/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.servers;

import com.borland.dx.dataset.DataRow;
import com.borland.dx.sql.dataset.ConnectionDescriptor;
import com.borland.dx.sql.dataset.Load;
import com.borland.dx.sql.dataset.QueryDescriptor;
import com.cwd.db.ColumnFactory;
import com.cwd.db.Data;
import com.gotkcups.json.Utilities;
import com.gotkcups.data.Packet;
import com.gotkcups.data.Product;
import com.gotkcups.data.Product.ProductStatus;
import com.gotkcups.data.ProductInfo;
import com.gotkcups.pageprocessors.ProductProcessor;
import com.gotkcups.io.PageReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author rfteves
 */
public class PageServer extends Thread {

    private static final PageServer SERVER = new PageServer();
    private Packet value;

    static {
        SERVER.start();
        SERVER.initData();
    }

    private Queue<Packet> IDS = new LinkedList<>();

    public static PageServer fetchCostAndPricing(Packet packet) {
        SERVER.register(packet);
        return SERVER;
    }

    private void register(Packet packet) {
        synchronized (this) {
            while (IDS.size() != 0) {
                try {
                    this.wait();
                } catch (InterruptedException ex) {
                }
            }
            IDS.add(packet);
            this.notifyAll(); // Notify this and statusWaitForReady callers
        }
    }

    public void run() {
        while (true) {
            synchronized (this) {
                while (IDS.isEmpty()) {
                    try {
                        this.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(PageServer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                value = IDS.poll();
            }
            this.browsePages(value);
        }
    }

    private Data data;

    private void browsePages(Packet packet) {
        // Create UrlProductInfo
        Collection<UrlProductInfo> udata = this.getUrlData(packet.getProductid(), packet.getVariantid());
        // Get the html page of each product then group it by url
        Map<String, List<UrlProductInfo>> map = udata.stream().map(p -> {
            PageReader.fetch(p);
            
            return p;
        }).collect(Collectors.groupingBy(lll -> lll.getUrl()));
        // Now resolve product availability
        map.values().forEach(ProductProcessor::costing);
        // Now determine pricing
        map.values().forEach(ProductProcessor::pricing);
        //map.values().stream().map(p -> p.stream().iterator()).map(k -> k.next().getProduct()).forEach(o -> System.out.println(Utilities.gson(o)));
        //map.values().stream().map(p -> p.stream().iterator()).map(k -> k.next().getProduct()).forEach(o -> System.out.println(Utilities.xml(o)));
        Collection<ProductInfo> values = new ArrayList<>();
        map.values().stream().forEach(uds -> uds.stream().map(p -> p.getProduct()).forEach(values::add));
        packet.setProducts(values);
        synchronized (packet) {
            packet.notify();
        }
    }

    private Collection<UrlProductInfo> getUrlData(String productid, String variantid) {
        Collection<UrlProductInfo> udata = new ArrayList<>();
        data.getParameters().setString("productid", productid);
        data.getParameters().setString("variantid", variantid);
        if (!data.getSource().isOpen()) {
            data.getSource().open();
        }
        data.getSource().refresh();
        if (!data.getSource().isEmpty()) {
            do {
                DataRow row = new DataRow(data.getSource());
                data.getSource().getDataRow(row);
                String url = data.getSource().getString("url");
                ProductInfo product = new ProductInfo();
                product.setDefaultCost(data.getSource().getBigDecimal("defaultcost").doubleValue());
                product.setDefaultMinqty(data.getSource().getBigDecimal("defaultminqty").intValue());
                product.setDefaultShipping(data.getSource().getBigDecimal("defaultshipping").doubleValue());
                product.setDescription(data.getSource().getString("description"));
                product.setTaxable(data.getSource().getString("taxable").equalsIgnoreCase("y"));
                product.setVariantid(data.getSource().getString("variantid"));
                product.setProductid(data.getSource().getString("productid"));
                product.setVariantsku(data.getSource().getString("variantsku"));
                product.setDefaultInv(data.getSource().getBigDecimal("instockqty").intValue());
                product.setInstock(false);
                product.setCurrentStock(data.getSource().getString("instock").equalsIgnoreCase("y"));
                product.setStatus(ProductStatus.PAGE_NOT_AVAILABLE);
                product.setShipping(-1);
                product.setMinprice(data.getSource().getBigDecimal("minprice").doubleValue());
                product.setMaxprice(data.getSource().getBigDecimal("maxprice").doubleValue());
                UrlProductInfo ud = UrlProductInfo.create(product, url);
                udata.add(ud);
            } while (data.getSource().next());
        }
        return udata;
    }

    private void initData() {
        data = Data.getData();
        try {
            data.getSourcedb().setConnection(new ConnectionDescriptor(
                    Utilities.getApplicationProperty("jdbc.url.amazonkeurig"), Utilities.getApplicationProperty("jdbc.user"),
                    Utilities.getApplicationProperty("jdbc.password"), false, "com.mysql.jdbc.Driver"));
            data.getSourcedb().getJdbcConnection().setAutoCommit(false);
            data.getSource().setQuery(new QueryDescriptor(data.getSourcedb(),
                    "select * from shopifyurls where productid=:productid and variantid=:variantid",
                    data.getParameters(), true, Load.ALL));
            data.getParameters().addColumn(ColumnFactory.createStringColumn("productid"));
            data.getParameters().addColumn(ColumnFactory.createStringColumn("variantid"));
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // ('7035660231' , '7035660423' , '9589263818')503304
    }

}
