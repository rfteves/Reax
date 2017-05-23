/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.main;

import com.borland.dx.sql.dataset.ConnectionDescriptor;
import com.borland.dx.sql.dataset.Load;
import com.borland.dx.sql.dataset.QueryDescriptor;
import com.cwd.db.Data;
import com.gotkcups.data.EntityFacade;
import com.gotkcups.data.Packet;
import com.gotkcups.data.Product;
import com.gotkcups.data.Product.ProductStatus;
import com.gotkcups.data.ProductChange;
import com.gotkcups.data.ProductInfo;
import com.gotkcups.json.Utilities;
import com.gotkcups.servers.PageServer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rfteves
 */
public class BuildProductChanges {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println("start: " + new Date(start));
        Data data = Data.getData();
        data.getSourcedb().setConnection(new ConnectionDescriptor(
                Utilities.getApplicationProperty("jdbc.url.amazonkeurig"), Utilities.getApplicationProperty("jdbc.user"), Utilities.getApplicationProperty("jdbc.password"), false, "com.mysql.jdbc.Driver"));
        data.getSource().setQuery(new QueryDescriptor(data.getSourcedb(),
                //"select * from shopifyurls where productid is not null and hidden!='Y' and url like 'http%' and variantsku like '%s' and description like '%swissgear%' group by productid order by productid,variantid,url",
                //"select * from shopifyurls where productid like '%' and producttype like '%' and description like '%' and hidden!='Y' and url like 'http%' and variantsku like '%' group by productid order by productid,variantid,url",
                "select * from shopifyurls where productid is not null and productid like '%' and variantsku like '%' and hidden!='Y' and url like 'http%' group by productid,variantid order by productid,variantid,url",
                null, true, Load.ALL));
        data.getSource().open();
        EntityFacade.add(new ProductChange());
        EntityFacade.executeQuery("truncate productchanges;");
        EntityFacade.executeQuery("truncate productinfos;");
        Collection<ProductInfo> INFOS = new ArrayList<>();
        Collection<ProductChange> CHANGES = new ArrayList<>();
        Collection<Packet> packets = new ArrayList<>();
        do {
            Packet p = new Packet();
            p.setProductid(data.getSource().getString("productid"));
            p.setVariantid(data.getSource().getString("variantid"));
            packets.add(p);
        } while (data.getSource().next());
        packets.stream().forEach(p -> {
            PageServer.fetchCostAndPricing(p);
            synchronized (p) {
                try {
                    p.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(PageServer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            ProductInfo o = null;
            for (boolean b : new boolean[]{true, false}) {
                Optional<ProductInfo> optional = p.getProducts().stream().sorted().filter(oh -> oh.isInstock() == b).findFirst();
                if (optional.isPresent()) {
                    o = optional.get();
                    ProductChange change = null;
                    if (o.isInstock()) {
                        int max = Math.max((int) (3500 / o.getPrice()), 120);
                        int min = Math.max((int) (600 / o.getPrice()), 12);
                        o.setAlpha(ProductStatus.PRODUCT_FIRST);
                        if (Math.abs(o.getPrice() - o.getMinprice()) > 1.00 && o.isInstock() != o.isCurrentStock()) {
                            o.setReason(ProductStatus.PRODUCT_PRICE_STOCK_CHANGE);
                            change = EntityFacade.create(o);
                        } else if (o.isInstock() != o.isCurrentStock()) {
                            o.setReason(ProductStatus.PRODUCT_IN_STOCK);
                            change = EntityFacade.create(o);
                        } else if (Math.abs(o.getPrice() - o.getMinprice()) > 1.00) {
                            o.setReason(ProductStatus.PRODUCT_PRICE_CHANGE);
                            change = EntityFacade.create(o);
                        } else if (o.getDefaultInv() < min || o.getDefaultInv() > max) {
                            o.setReason(ProductStatus.PRODUCT_INV_QTY_CHANGE);
                            change = EntityFacade.create(o);
                        }
                        if (change != null) {
                            change.setInvqty(max);
                        }
                    } else if (o.getStatus().equals(ProductStatus.PAGE_NOT_AVAILABLE.toString())) {
                        o.setReason(ProductStatus.PAGE_NOT_AVAILABLE);
                        change = EntityFacade.create(o);
                    } else if (o.isInstock() != o.isCurrentStock()) {
                        o.setReason(Product.ProductStatus.PRODUCT_OUT_OF_STOCK);
                        change = EntityFacade.create(o);
                    }
                    if (change != null) {
                        CHANGES.add(change);
                    }
                    break;
                }
            }
            p.getProducts().stream().sorted().forEach(INFOS::add);
        });
        long mark = System.currentTimeMillis();
        EntityFacade.bulk(INFOS);
        long mark2 = System.currentTimeMillis();
        EntityFacade.bulk(CHANGES);
        long end = System.currentTimeMillis();
        System.out.println("start: " + new Date(start));
        System.out.println("mark: " + new Date(mark));
        System.out.println("mark2: " + new Date(mark2));
        System.out.println("end: " + new Date(end));
        System.exit(0);
    }

}
