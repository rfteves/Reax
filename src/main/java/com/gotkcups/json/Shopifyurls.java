/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.json;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rfteves
 */
@Entity
@Table(name = "shopifyurls")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Shopifyurls.findAll", query = "SELECT s FROM Shopifyurls s")
    , @NamedQuery(name = "Shopifyurls.findByRecordnumber", query = "SELECT s FROM Shopifyurls s WHERE s.recordnumber = :recordnumber")
    , @NamedQuery(name = "Shopifyurls.findByProducttype", query = "SELECT s FROM Shopifyurls s WHERE s.producttype = :producttype")
    , @NamedQuery(name = "Shopifyurls.findByDescription", query = "SELECT s FROM Shopifyurls s WHERE s.description = :description")
    , @NamedQuery(name = "Shopifyurls.findByUrl", query = "SELECT s FROM Shopifyurls s WHERE s.url = :url")
    , @NamedQuery(name = "Shopifyurls.findByCost", query = "SELECT s FROM Shopifyurls s WHERE s.cost = :cost")
    , @NamedQuery(name = "Shopifyurls.findByCompareprice", query = "SELECT s FROM Shopifyurls s WHERE s.compareprice = :compareprice")
    , @NamedQuery(name = "Shopifyurls.findByDefaultcost", query = "SELECT s FROM Shopifyurls s WHERE s.defaultcost = :defaultcost")
    , @NamedQuery(name = "Shopifyurls.findByShipping", query = "SELECT s FROM Shopifyurls s WHERE s.shipping = :shipping")
    , @NamedQuery(name = "Shopifyurls.findByDefaultshipping", query = "SELECT s FROM Shopifyurls s WHERE s.defaultshipping = :defaultshipping")
    , @NamedQuery(name = "Shopifyurls.findByMaxprice", query = "SELECT s FROM Shopifyurls s WHERE s.maxprice = :maxprice")
    , @NamedQuery(name = "Shopifyurls.findByMinprice", query = "SELECT s FROM Shopifyurls s WHERE s.minprice = :minprice")
    , @NamedQuery(name = "Shopifyurls.findByDiscount", query = "SELECT s FROM Shopifyurls s WHERE s.discount = :discount")
    , @NamedQuery(name = "Shopifyurls.findByExpiration", query = "SELECT s FROM Shopifyurls s WHERE s.expiration = :expiration")
    , @NamedQuery(name = "Shopifyurls.findByTaxable", query = "SELECT s FROM Shopifyurls s WHERE s.taxable = :taxable")
    , @NamedQuery(name = "Shopifyurls.findByMinqty", query = "SELECT s FROM Shopifyurls s WHERE s.minqty = :minqty")
    , @NamedQuery(name = "Shopifyurls.findByDefaultminqty", query = "SELECT s FROM Shopifyurls s WHERE s.defaultminqty = :defaultminqty")
    , @NamedQuery(name = "Shopifyurls.findByPageid", query = "SELECT s FROM Shopifyurls s WHERE s.pageid = :pageid")
    , @NamedQuery(name = "Shopifyurls.findByProductId", query = "SELECT s FROM Shopifyurls s WHERE s.productId = :productId")
    , @NamedQuery(name = "Shopifyurls.findByVariantId", query = "SELECT s FROM Shopifyurls s WHERE s.variantId = :variantId")
    , @NamedQuery(name = "Shopifyurls.findByVariantsku", query = "SELECT s FROM Shopifyurls s WHERE s.variantsku = :variantsku")
    , @NamedQuery(name = "Shopifyurls.findByInstock", query = "SELECT s FROM Shopifyurls s WHERE s.instock = :instock")
    , @NamedQuery(name = "Shopifyurls.findByInstockqty", query = "SELECT s FROM Shopifyurls s WHERE s.instockqty = :instockqty")
    , @NamedQuery(name = "Shopifyurls.findByRecordstatus", query = "SELECT s FROM Shopifyurls s WHERE s.recordstatus = :recordstatus")
    , @NamedQuery(name = "Shopifyurls.findByHidden", query = "SELECT s FROM Shopifyurls s WHERE s.hidden = :hidden")
    , @NamedQuery(name = "Shopifyurls.findByWeight", query = "SELECT s FROM Shopifyurls s WHERE s.weight = :weight")})
public class Shopifyurls implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "recordnumber")
    private Integer recordnumber;
    @Column(name = "producttype")
    private String producttype;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "url")
    private String url;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cost")
    private BigDecimal cost;
    @Column(name = "compareprice")
    private BigDecimal compareprice;
    @Column(name = "defaultcost")
    private BigDecimal defaultcost;
    @Column(name = "shipping")
    private BigDecimal shipping;
    @Column(name = "defaultshipping")
    private BigDecimal defaultshipping;
    @Column(name = "maxprice")
    private BigDecimal maxprice;
    @Column(name = "minprice")
    private BigDecimal minprice;
    @Column(name = "discount")
    private BigDecimal discount;
    @Column(name = "expiration")
    @Temporal(TemporalType.DATE)
    private Date expiration;
    @Column(name = "taxable")
    private String taxable;
    @Column(name = "minqty")
    private Integer minqty;
    @Column(name = "defaultminqty")
    private Integer defaultminqty;
    @Column(name = "pageid")
    private String pageid;
    @Column(name = "productId")
    private String productId;
    @Column(name = "variantId")
    private String variantId;
    @Column(name = "variantsku")
    private String variantsku;
    @Column(name = "instock")
    private String instock;
    @Column(name = "instockqty")
    private Integer instockqty;
    @Column(name = "recordstatus")
    private String recordstatus;
    @Column(name = "hidden")
    private String hidden;
    @Column(name = "weight")
    private BigDecimal weight;

    public Shopifyurls() {
    }

    public Shopifyurls(Integer recordnumber) {
        this.recordnumber = recordnumber;
    }

    public Shopifyurls(Integer recordnumber, String description, String url) {
        this.recordnumber = recordnumber;
        this.description = description;
        this.url = url;
    }

    public Integer getRecordnumber() {
        return recordnumber;
    }

    public void setRecordnumber(Integer recordnumber) {
        this.recordnumber = recordnumber;
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getCompareprice() {
        return compareprice;
    }

    public void setCompareprice(BigDecimal compareprice) {
        this.compareprice = compareprice;
    }

    public BigDecimal getDefaultcost() {
        return defaultcost;
    }

    public void setDefaultcost(BigDecimal defaultcost) {
        this.defaultcost = defaultcost;
    }

    public BigDecimal getShipping() {
        return shipping;
    }

    public void setShipping(BigDecimal shipping) {
        this.shipping = shipping;
    }

    public BigDecimal getDefaultshipping() {
        return defaultshipping;
    }

    public void setDefaultshipping(BigDecimal defaultshipping) {
        this.defaultshipping = defaultshipping;
    }

    public BigDecimal getMaxprice() {
        return maxprice;
    }

    public void setMaxprice(BigDecimal maxprice) {
        this.maxprice = maxprice;
    }

    public BigDecimal getMinprice() {
        return minprice;
    }

    public void setMinprice(BigDecimal minprice) {
        this.minprice = minprice;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public String getTaxable() {
        return taxable;
    }

    public void setTaxable(String taxable) {
        this.taxable = taxable;
    }

    public Integer getMinqty() {
        return minqty;
    }

    public void setMinqty(Integer minqty) {
        this.minqty = minqty;
    }

    public Integer getDefaultminqty() {
        return defaultminqty;
    }

    public void setDefaultminqty(Integer defaultminqty) {
        this.defaultminqty = defaultminqty;
    }

    public String getPageid() {
        return pageid;
    }

    public void setPageid(String pageid) {
        this.pageid = pageid;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getVariantId() {
        return variantId;
    }

    public void setVariantId(String variantId) {
        this.variantId = variantId;
    }

    public String getVariantsku() {
        return variantsku;
    }

    public void setVariantsku(String variantsku) {
        this.variantsku = variantsku;
    }

    public String getInstock() {
        return instock;
    }

    public void setInstock(String instock) {
        this.instock = instock;
    }

    public Integer getInstockqty() {
        return instockqty;
    }

    public void setInstockqty(Integer instockqty) {
        this.instockqty = instockqty;
    }

    public String getRecordstatus() {
        return recordstatus;
    }

    public void setRecordstatus(String recordstatus) {
        this.recordstatus = recordstatus;
    }

    public String getHidden() {
        return hidden;
    }

    public void setHidden(String hidden) {
        this.hidden = hidden;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (recordnumber != null ? recordnumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Shopifyurls)) {
            return false;
        }
        Shopifyurls other = (Shopifyurls) object;
        if ((this.recordnumber == null && other.recordnumber != null) || (this.recordnumber != null && !this.recordnumber.equals(other.recordnumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gotkcups.json.Shopifyurls[ recordnumber=" + recordnumber + " ]";
    }

}
