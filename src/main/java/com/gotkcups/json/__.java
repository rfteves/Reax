/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.json;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author rfteves
 */
public class __ {

	private OnlineInventoryVo onlineInventoryVo;

	public OnlineInventoryVo getOnlineInventoryVo() {
		return onlineInventoryVo;
	}

	public void setOnlineInventoryVo(OnlineInventoryVo onlineInventoryVo) {
		this.onlineInventoryVo = onlineInventoryVo;
	}

	private ClubInventoryVo clubInventoryVo;

	public ClubInventoryVo getClubInventoryVo() {
		return clubInventoryVo;
	}

	public void setClubInventoryVo(ClubInventoryVo clubInventoryVo) {
		this.clubInventoryVo = clubInventoryVo;
	}

	private Collection<FulfillmentType> fulfillmentType;

	public Collection<FulfillmentType> getFulfillmentType() {
		return fulfillmentType;
	}

	public void setFulfillmentType(Collection<FulfillmentType> fulfillmentType) {
		this.fulfillmentType = fulfillmentType;
	}

	private Collection<ItemNumberDetails> itemNumberDetails;

	public Collection<ItemNumberDetails> getItemNumberDetails() {
		return itemNumberDetails;
	}

	public void setItemNumberDetails(Collection<ItemNumberDetails> itemNumberDetails) {
		this.itemNumberDetails = itemNumberDetails;
	}

	private Collection<AvailableSKUOptions> availableSKUOptions;

	public Collection<AvailableSKUOptions> getAvailableSKUOptions() {
		return availableSKUOptions;
	}

	public void setAvailableSKUOptions(Collection<AvailableSKUOptions> availableSKUOptions) {
		this.availableSKUOptions = availableSKUOptions;
	}

	private SelectedSKU selectedSKU;

	public SelectedSKU getSelectedSKU() {
		return selectedSKU;
	}

	public void setSelectedSKU(SelectedSKU selectedSKU) {
		this.selectedSKU = selectedSKU;
	}

	private Collection<AvailableSKUs> availableSKUs;

	public Collection<AvailableSKUs> getAvailableSKUs() {
		return availableSKUs;
	}

	public void setAvailableSKUs(Collection<AvailableSKUs> availableSKUs) {
		this.availableSKUs = availableSKUs;
	}

	private AvailableVariances availableVariances;

	public AvailableVariances getAvailableVariances() {
		return availableVariances;
	}

	public void setAvailableVariances(AvailableVariances availableVariances) {
		this.availableVariances = availableVariances;
	}

	private ParentCategoryVO parentCategoryVO;

	public ParentCategoryVO getParentCategoryVO() {
		return parentCategoryVO;
	}

	public void setParentCategoryVO(ParentCategoryVO parentCategoryVO) {
		this.parentCategoryVO = parentCategoryVO;
	}

	private Collection<ProductSpecifications> productSpecifications;

	public Collection<ProductSpecifications> getProductSpecifications() {
		return productSpecifications;
	}

	public void setProductSpecifications(Collection<ProductSpecifications> productSpecifications) {
		this.productSpecifications = productSpecifications;
	}

	private Collection<ProductDisclaimers> productDisclaimers;

	public Collection<ProductDisclaimers> getProductDisclaimers() {
		return productDisclaimers;
	}

	public void setProductDisclaimers(Collection<ProductDisclaimers> productDisclaimers) {
		this.productDisclaimers = productDisclaimers;
	}

	private Collection<MemberBenefits> memberBenefits;

	public Collection<MemberBenefits> getMemberBenefits() {
		return memberBenefits;
	}

	public void setMemberBenefits(Collection<MemberBenefits> memberBenefits) {
		this.memberBenefits = memberBenefits;
	}

	private ComputedPriceDetailsVariantProduct computedPriceDetailsVariantProduct;

	public ComputedPriceDetailsVariantProduct getComputedPriceDetailsVariantProduct() {
		return computedPriceDetailsVariantProduct;
	}

	public void setComputedPriceDetailsVariantProduct(ComputedPriceDetailsVariantProduct computedPriceDetailsVariantProduct) {
		this.computedPriceDetailsVariantProduct = computedPriceDetailsVariantProduct;
	}

	private Collection<ShippingEstimates> shippingEstimates;

	public Collection<ShippingEstimates> getShippingEstimates() {
		return shippingEstimates;
	}

	public void setShippingEstimates(Collection<ShippingEstimates> shippingEstimates) {
		this.shippingEstimates = shippingEstimates;
	}

	private Collection<ThresholdEligibleDetails> thresholdEligibleDetails;

	public Collection<ThresholdEligibleDetails> getThresholdEligibleDetails() {
		return thresholdEligibleDetails;
	}

	public void setThresholdEligibleDetails(Collection<ThresholdEligibleDetails> thresholdEligibleDetails) {
		this.thresholdEligibleDetails = thresholdEligibleDetails;
	}

	private Collection<ServiceAgreements> serviceAgreements;

	public Collection<ServiceAgreements> getServiceAgreements() {
		return serviceAgreements;
	}

	public void setServiceAgreements(Collection<ServiceAgreements> serviceAgreements) {
		this.serviceAgreements = serviceAgreements;
	}

	private Collection<EvalueDetails> evalueDetails;

	public Collection<EvalueDetails> getEvalueDetails() {
		return evalueDetails;
	}

	public void setEvalueDetails(Collection<EvalueDetails> evalueDetails) {
		this.evalueDetails = evalueDetails;
	}

}


class OnlineInventoryVo {

	private String onlineClub;

	public String getOnlineClub() {
		return onlineClub;
	}

	public void setOnlineClub(String onlineClub) {
		this.onlineClub = onlineClub;
	}

	private BigInteger qtySold;

	public BigInteger getQtySold() {
		return qtySold;
	}

	public void setQtySold(BigInteger qtySold) {
		this.qtySold = qtySold;
	}

	private BigInteger qtyLeft;

	public BigInteger getQtyLeft() {
		return qtyLeft;
	}

	public void setQtyLeft(BigInteger qtyLeft) {
		this.qtyLeft = qtyLeft;
	}

	private BigInteger mAvailableToSellQuantity;

	public BigInteger getMAvailableToSellQuantity() {
		return mAvailableToSellQuantity;
	}

	public void setMAvailableToSellQuantity(BigInteger mAvailableToSellQuantity) {
		this.mAvailableToSellQuantity = mAvailableToSellQuantity;
	}

	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	private BigInteger minQuantity;

	public BigInteger getMinQuantity() {
		return minQuantity;
	}

	public void setMinQuantity(BigInteger minQuantity) {
		this.minQuantity = minQuantity;
	}

	private BigInteger maxQuantity;

	public BigInteger getMaxQuantity() {
		return maxQuantity;
	}

	public void setMaxQuantity(BigInteger maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

	private BigInteger legacyItemNo;

	public BigInteger getLegacyItemNo() {
		return legacyItemNo;
	}

	public void setLegacyItemNo(BigInteger legacyItemNo) {
		this.legacyItemNo = legacyItemNo;
	}

	private BigInteger clubNo;

	public BigInteger getClubNo() {
		return clubNo;
	}

	public void setClubNo(BigInteger clubNo) {
		this.clubNo = clubNo;
	}

	private boolean viewOnly;

	public boolean getViewOnly() {
		return viewOnly;
	}

	public void setViewOnly(boolean viewOnly) {
		this.viewOnly = viewOnly;
	}

}


class ClubInventoryVo {

	private BigInteger qtySold;

	public BigInteger getQtySold() {
		return qtySold;
	}

	public void setQtySold(BigInteger qtySold) {
		this.qtySold = qtySold;
	}

	private BigInteger qtyLeft;

	public BigInteger getQtyLeft() {
		return qtyLeft;
	}

	public void setQtyLeft(BigInteger qtyLeft) {
		this.qtyLeft = qtyLeft;
	}

	private BigInteger mAvailableToSellQuantity;

	public BigInteger getMAvailableToSellQuantity() {
		return mAvailableToSellQuantity;
	}

	public void setMAvailableToSellQuantity(BigInteger mAvailableToSellQuantity) {
		this.mAvailableToSellQuantity = mAvailableToSellQuantity;
	}

	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	private BigInteger minQuantity;

	public BigInteger getMinQuantity() {
		return minQuantity;
	}

	public void setMinQuantity(BigInteger minQuantity) {
		this.minQuantity = minQuantity;
	}

	private BigInteger maxQuantity;

	public BigInteger getMaxQuantity() {
		return maxQuantity;
	}

	public void setMaxQuantity(BigInteger maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

	private boolean viewOnly;

	public boolean getViewOnly() {
		return viewOnly;
	}

	public void setViewOnly(boolean viewOnly) {
		this.viewOnly = viewOnly;
	}

}


class FulfillmentType {

}


class ItemNumberDetails {

	private BigInteger itemnumber;

	public BigInteger getItemnumber() {
		return itemnumber;
	}

	public void setItemnumber(BigInteger itemnumber) {
		this.itemnumber = itemnumber;
	}

	private String fulfillmentOption;

	public String getFulfillmentOption() {
		return fulfillmentOption;
	}

	public void setFulfillmentOption(String fulfillmentOption) {
		this.fulfillmentOption = fulfillmentOption;
	}

	private boolean merchAuthorized;

	public boolean getMerchAuthorized() {
		return merchAuthorized;
	}

	public void setMerchAuthorized(boolean merchAuthorized) {
		this.merchAuthorized = merchAuthorized;
	}

	private boolean isViewOnly;

	public boolean getIsViewOnly() {
		return isViewOnly;
	}

	public void setIsViewOnly(boolean isViewOnly) {
		this.isViewOnly = isViewOnly;
	}

	private BigInteger thresholdQty;

	public BigInteger getThresholdQty() {
		return thresholdQty;
	}

	public void setThresholdQty(BigInteger thresholdQty) {
		this.thresholdQty = thresholdQty;
	}

	private BigInteger legacyItemId;

	public BigInteger getLegacyItemId() {
		return legacyItemId;
	}

	public void setLegacyItemId(BigInteger legacyItemId) {
		this.legacyItemId = legacyItemId;
	}

	private boolean instockNotificatoinEnabled;

	public boolean getInstockNotificatoinEnabled() {
		return instockNotificatoinEnabled;
	}

	public void setInstockNotificatoinEnabled(boolean instockNotificatoinEnabled) {
		this.instockNotificatoinEnabled = instockNotificatoinEnabled;
	}

	private BigInteger onlineThreshholdValue;

	public BigInteger getOnlineThreshholdValue() {
		return onlineThreshholdValue;
	}

	public void setOnlineThreshholdValue(BigInteger onlineThreshholdValue) {
		this.onlineThreshholdValue = onlineThreshholdValue;
	}

	private boolean isWeightedItem;

	public boolean getIsWeightedItem() {
		return isWeightedItem;
	}

	public void setIsWeightedItem(boolean isWeightedItem) {
		this.isWeightedItem = isWeightedItem;
	}

	private boolean isUnitPriceItem;

	public boolean getIsUnitPriceItem() {
		return isUnitPriceItem;
	}

	public void setIsUnitPriceItem(boolean isUnitPriceItem) {
		this.isUnitPriceItem = isUnitPriceItem;
	}

	private BigDecimal weightedPackMaxSize;

	public BigDecimal getWeightedPackMaxSize() {
		return weightedPackMaxSize;
	}

	public void setWeightedPackMaxSize(BigDecimal weightedPackMaxSize) {
		this.weightedPackMaxSize = weightedPackMaxSize;
	}

	private BigDecimal weightedPackMinSize;

	public BigDecimal getWeightedPackMinSize() {
		return weightedPackMinSize;
	}

	public void setWeightedPackMinSize(BigDecimal weightedPackMinSize) {
		this.weightedPackMinSize = weightedPackMinSize;
	}

	private BigDecimal packSize;

	public BigDecimal getPackSize() {
		return packSize;
	}

	public void setPackSize(BigDecimal packSize) {
		this.packSize = packSize;
	}

	private BigDecimal itemListPrice;

	public BigDecimal getItemListPrice() {
		return itemListPrice;
	}

	public void setItemListPrice(BigDecimal itemListPrice) {
		this.itemListPrice = itemListPrice;
	}

	private boolean deleted;

	public boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

}


class AvailableSKUOptions {

	private Collection<ItemNumberDetails2> itemNumberDetails2;

	public Collection<ItemNumberDetails2> getItemNumberDetails2() {
		return itemNumberDetails2;
	}

	public void setItemNumberDetails2(Collection<ItemNumberDetails2> itemNumberDetails2) {
		this.itemNumberDetails2 = itemNumberDetails2;
	}

	private OnlineInventoryVO onlineInventoryVO;

	public OnlineInventoryVO getOnlineInventoryVO() {
		return onlineInventoryVO;
	}

	public void setOnlineInventoryVO(OnlineInventoryVO onlineInventoryVO) {
		this.onlineInventoryVO = onlineInventoryVO;
	}

	private ClubInventoryVO clubInventoryVO;

	public ClubInventoryVO getClubInventoryVO() {
		return clubInventoryVO;
	}

	public void setClubInventoryVO(ClubInventoryVO clubInventoryVO) {
		this.clubInventoryVO = clubInventoryVO;
	}

	private OnlinePriceVO onlinePriceVO;

	public OnlinePriceVO getOnlinePriceVO() {
		return onlinePriceVO;
	}

	public void setOnlinePriceVO(OnlinePriceVO onlinePriceVO) {
		this.onlinePriceVO = onlinePriceVO;
	}

	private VarianceValueMap varianceValueMap;

	public VarianceValueMap getVarianceValueMap() {
		return varianceValueMap;
	}

	public void setVarianceValueMap(VarianceValueMap varianceValueMap) {
		this.varianceValueMap = varianceValueMap;
	}

	private Collection<ServiceAgreement> serviceAgreement;

	public Collection<ServiceAgreement> getServiceAgreement() {
		return serviceAgreement;
	}

	public void setServiceAgreement(Collection<ServiceAgreement> serviceAgreement) {
		this.serviceAgreement = serviceAgreement;
	}

	private Collection<FlowerDeliveryDate> flowerDeliveryDate;

	public Collection<FlowerDeliveryDate> getFlowerDeliveryDate() {
		return flowerDeliveryDate;
	}

	public void setFlowerDeliveryDate(Collection<FlowerDeliveryDate> flowerDeliveryDate) {
		this.flowerDeliveryDate = flowerDeliveryDate;
	}

	private MoneyBox moneyBox;

	public MoneyBox getMoneyBox() {
		return moneyBox;
	}

	public void setMoneyBox(MoneyBox moneyBox) {
		this.moneyBox = moneyBox;
	}

	private Collection<RelatedSkus> relatedSkus;

	public Collection<RelatedSkus> getRelatedSkus() {
		return relatedSkus;
	}

	public void setRelatedSkus(Collection<RelatedSkus> relatedSkus) {
		this.relatedSkus = relatedSkus;
	}

	private BigDecimal msrpPrice;

	public BigDecimal getMsrpPrice() {
		return msrpPrice;
	}

	public void setMsrpPrice(BigDecimal msrpPrice) {
		this.msrpPrice = msrpPrice;
	}

	private String listImage;

	public String getListImage() {
		return listImage;
	}

	public void setListImage(String listImage) {
		this.listImage = listImage;
	}

	private String skuName;

	public String getSkuName() {
		return skuName;
	}

	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

	private String skuId;

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	private BigInteger itemNo;

	public BigInteger getItemNo() {
		return itemNo;
	}

	public void setItemNo(BigInteger itemNo) {
		this.itemNo = itemNo;
	}

	private BigInteger onlineLegacyItemId;

	public BigInteger getOnlineLegacyItemId() {
		return onlineLegacyItemId;
	}

	public void setOnlineLegacyItemId(BigInteger onlineLegacyItemId) {
		this.onlineLegacyItemId = onlineLegacyItemId;
	}

	private BigInteger clubLegacyItemId;

	public BigInteger getClubLegacyItemId() {
		return clubLegacyItemId;
	}

	public void setClubLegacyItemId(BigInteger clubLegacyItemId) {
		this.clubLegacyItemId = clubLegacyItemId;
	}

	private boolean viewOnly;

	public boolean getViewOnly() {
		return viewOnly;
	}

	public void setViewOnly(boolean viewOnly) {
		this.viewOnly = viewOnly;
	}

	private BigInteger modelNo;

	public BigInteger getModelNo() {
		return modelNo;
	}

	public void setModelNo(BigInteger modelNo) {
		this.modelNo = modelNo;
	}

	private String imageName;

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	private boolean subscribeEnabled;

	public boolean getSubscribeEnabled() {
		return subscribeEnabled;
	}

	public void setSubscribeEnabled(boolean subscribeEnabled) {
		this.subscribeEnabled = subscribeEnabled;
	}

	private boolean subscribed;

	public boolean getSubscribed() {
		return subscribed;
	}

	public void setSubscribed(boolean subscribed) {
		this.subscribed = subscribed;
	}

	private BigDecimal mapPrice;

	public BigDecimal getMapPrice() {
		return mapPrice;
	}

	public void setMapPrice(BigDecimal mapPrice) {
		this.mapPrice = mapPrice;
	}

	private boolean strikeOffPrice;

	public boolean getStrikeOffPrice() {
		return strikeOffPrice;
	}

	public void setStrikeOffPrice(boolean strikeOffPrice) {
		this.strikeOffPrice = strikeOffPrice;
	}

	private BigInteger imageId;

	public BigInteger getImageId() {
		return imageId;
	}

	public void setImageId(BigInteger imageId) {
		this.imageId = imageId;
	}

	private boolean tobacco;

	public boolean getTobacco() {
		return tobacco;
	}

	public void setTobacco(boolean tobacco) {
		this.tobacco = tobacco;
	}

	private boolean chewingTobacco;

	public boolean getChewingTobacco() {
		return chewingTobacco;
	}

	public void setChewingTobacco(boolean chewingTobacco) {
		this.chewingTobacco = chewingTobacco;
	}

	private boolean showTobacco;

	public boolean getShowTobacco() {
		return showTobacco;
	}

	public void setShowTobacco(boolean showTobacco) {
		this.showTobacco = showTobacco;
	}

	private String shippingMethodType;

	public String getShippingMethodType() {
		return shippingMethodType;
	}

	public void setShippingMethodType(String shippingMethodType) {
		this.shippingMethodType = shippingMethodType;
	}

	private boolean auctionSku;

	public boolean getAuctionSku() {
		return auctionSku;
	}

	public void setAuctionSku(boolean auctionSku) {
		this.auctionSku = auctionSku;
	}

	private BigInteger upc;

	public BigInteger getUpc() {
		return upc;
	}

	public void setUpc(BigInteger upc) {
		this.upc = upc;
	}

	private boolean freeShippingFlag;

	public boolean getFreeShippingFlag() {
		return freeShippingFlag;
	}

	public void setFreeShippingFlag(boolean freeShippingFlag) {
		this.freeShippingFlag = freeShippingFlag;
	}

	private boolean serviceAgreementProductFlag;

	public boolean getServiceAgreementProductFlag() {
		return serviceAgreementProductFlag;
	}

	public void setServiceAgreementProductFlag(boolean serviceAgreementProductFlag) {
		this.serviceAgreementProductFlag = serviceAgreementProductFlag;
	}

	private boolean instockNotification;

	public boolean getInstockNotification() {
		return instockNotification;
	}

	public void setInstockNotification(boolean instockNotification) {
		this.instockNotification = instockNotification;
	}

	private boolean electronicDeliveryFlag;

	public boolean getElectronicDeliveryFlag() {
		return electronicDeliveryFlag;
	}

	public void setElectronicDeliveryFlag(boolean electronicDeliveryFlag) {
		this.electronicDeliveryFlag = electronicDeliveryFlag;
	}

	private String scene7Imageurl;

	public String getScene7Imageurl() {
		return scene7Imageurl;
	}

	public void setScene7Imageurl(String scene7Imageurl) {
		this.scene7Imageurl = scene7Imageurl;
	}

	private BigInteger productReviewCounts;

	public BigInteger getProductReviewCounts() {
		return productReviewCounts;
	}

	public void setProductReviewCounts(BigInteger productReviewCounts) {
		this.productReviewCounts = productReviewCounts;
	}

	private BigDecimal productAvgRating;

	public BigDecimal getProductAvgRating() {
		return productAvgRating;
	}

	public void setProductAvgRating(BigDecimal productAvgRating) {
		this.productAvgRating = productAvgRating;
	}

	private String productType;

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	private boolean serviceAgreementFlag;

	public boolean getServiceAgreementFlag() {
		return serviceAgreementFlag;
	}

	public void setServiceAgreementFlag(boolean serviceAgreementFlag) {
		this.serviceAgreementFlag = serviceAgreementFlag;
	}

	private boolean isAvaiableSeperately;

	public boolean getIsAvaiableSeperately() {
		return isAvaiableSeperately;
	}

	public void setIsAvaiableSeperately(boolean isAvaiableSeperately) {
		this.isAvaiableSeperately = isAvaiableSeperately;
	}

	private boolean evalueAvailableFlag;

	public boolean getEvalueAvailableFlag() {
		return evalueAvailableFlag;
	}

	public void setEvalueAvailableFlag(boolean evalueAvailableFlag) {
		this.evalueAvailableFlag = evalueAvailableFlag;
	}

	private BigInteger shipDays;

	public BigInteger getShipDays() {
		return shipDays;
	}

	public void setShipDays(BigInteger shipDays) {
		this.shipDays = shipDays;
	}

	private String productId;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	private String scene7serverUrl;

	public String getScene7serverUrl() {
		return scene7serverUrl;
	}

	public void setScene7serverUrl(String scene7serverUrl) {
		this.scene7serverUrl = scene7serverUrl;
	}

	private String scene7serverUrlWithProtocol;

	public String getScene7serverUrlWithProtocol() {
		return scene7serverUrlWithProtocol;
	}

	public void setScene7serverUrlWithProtocol(String scene7serverUrlWithProtocol) {
		this.scene7serverUrlWithProtocol = scene7serverUrlWithProtocol;
	}

	private String scene7ColorAppender;

	public String getScene7ColorAppender() {
		return scene7ColorAppender;
	}

	public void setScene7ColorAppender(String scene7ColorAppender) {
		this.scene7ColorAppender = scene7ColorAppender;
	}

	private String scene7ClientName;

	public String getScene7ClientName() {
		return scene7ClientName;
	}

	public void setScene7ClientName(String scene7ClientName) {
		this.scene7ClientName = scene7ClientName;
	}

	private boolean clubSelected;

	public boolean getClubSelected() {
		return clubSelected;
	}

	public void setClubSelected(boolean clubSelected) {
		this.clubSelected = clubSelected;
	}

	private boolean promotionSKu;

	public boolean getPromotionSKu() {
		return promotionSKu;
	}

	public void setPromotionSKu(boolean promotionSKu) {
		this.promotionSKu = promotionSKu;
	}

	private boolean flowersTemplateProduct;

	public boolean getFlowersTemplateProduct() {
		return flowersTemplateProduct;
	}

	public void setFlowersTemplateProduct(boolean flowersTemplateProduct) {
		this.flowersTemplateProduct = flowersTemplateProduct;
	}

	private boolean populateSkuDetails;

	public boolean getPopulateSkuDetails() {
		return populateSkuDetails;
	}

	public void setPopulateSkuDetails(boolean populateSkuDetails) {
		this.populateSkuDetails = populateSkuDetails;
	}

	private boolean isServiceAgreementEligible;

	public boolean getIsServiceAgreementEligible() {
		return isServiceAgreementEligible;
	}

	public void setIsServiceAgreementEligible(boolean isServiceAgreementEligible) {
		this.isServiceAgreementEligible = isServiceAgreementEligible;
	}

	private boolean cnpSpecialOrder;

	public boolean getCnpSpecialOrder() {
		return cnpSpecialOrder;
	}

	public void setCnpSpecialOrder(boolean cnpSpecialOrder) {
		this.cnpSpecialOrder = cnpSpecialOrder;
	}

	private BigInteger merchandiseCategory;

	public BigInteger getMerchandiseCategory() {
		return merchandiseCategory;
	}

	public void setMerchandiseCategory(BigInteger merchandiseCategory) {
		this.merchandiseCategory = merchandiseCategory;
	}

	private BigInteger merchandiseSubCategory;

	public BigInteger getMerchandiseSubCategory() {
		return merchandiseSubCategory;
	}

	public void setMerchandiseSubCategory(BigInteger merchandiseSubCategory) {
		this.merchandiseSubCategory = merchandiseSubCategory;
	}

	private String skuType;

	public String getSkuType() {
		return skuType;
	}

	public void setSkuType(String skuType) {
		this.skuType = skuType;
	}

	private BigInteger onlineThreshholdValue;

	public BigInteger getOnlineThreshholdValue() {
		return onlineThreshholdValue;
	}

	public void setOnlineThreshholdValue(BigInteger onlineThreshholdValue) {
		this.onlineThreshholdValue = onlineThreshholdValue;
	}

}


class ItemNumberDetails2 {

	private BigInteger itemnumber;

	public BigInteger getItemnumber() {
		return itemnumber;
	}

	public void setItemnumber(BigInteger itemnumber) {
		this.itemnumber = itemnumber;
	}

	private String fulfillmentOption;

	public String getFulfillmentOption() {
		return fulfillmentOption;
	}

	public void setFulfillmentOption(String fulfillmentOption) {
		this.fulfillmentOption = fulfillmentOption;
	}

	private boolean merchAuthorized;

	public boolean getMerchAuthorized() {
		return merchAuthorized;
	}

	public void setMerchAuthorized(boolean merchAuthorized) {
		this.merchAuthorized = merchAuthorized;
	}

	private boolean isViewOnly;

	public boolean getIsViewOnly() {
		return isViewOnly;
	}

	public void setIsViewOnly(boolean isViewOnly) {
		this.isViewOnly = isViewOnly;
	}

	private BigInteger thresholdQty;

	public BigInteger getThresholdQty() {
		return thresholdQty;
	}

	public void setThresholdQty(BigInteger thresholdQty) {
		this.thresholdQty = thresholdQty;
	}

	private BigInteger legacyItemId;

	public BigInteger getLegacyItemId() {
		return legacyItemId;
	}

	public void setLegacyItemId(BigInteger legacyItemId) {
		this.legacyItemId = legacyItemId;
	}

	private boolean instockNotificatoinEnabled;

	public boolean getInstockNotificatoinEnabled() {
		return instockNotificatoinEnabled;
	}

	public void setInstockNotificatoinEnabled(boolean instockNotificatoinEnabled) {
		this.instockNotificatoinEnabled = instockNotificatoinEnabled;
	}

	private BigInteger onlineThreshholdValue;

	public BigInteger getOnlineThreshholdValue() {
		return onlineThreshholdValue;
	}

	public void setOnlineThreshholdValue(BigInteger onlineThreshholdValue) {
		this.onlineThreshholdValue = onlineThreshholdValue;
	}

	private boolean isWeightedItem;

	public boolean getIsWeightedItem() {
		return isWeightedItem;
	}

	public void setIsWeightedItem(boolean isWeightedItem) {
		this.isWeightedItem = isWeightedItem;
	}

	private boolean isUnitPriceItem;

	public boolean getIsUnitPriceItem() {
		return isUnitPriceItem;
	}

	public void setIsUnitPriceItem(boolean isUnitPriceItem) {
		this.isUnitPriceItem = isUnitPriceItem;
	}

	private BigDecimal weightedPackMaxSize;

	public BigDecimal getWeightedPackMaxSize() {
		return weightedPackMaxSize;
	}

	public void setWeightedPackMaxSize(BigDecimal weightedPackMaxSize) {
		this.weightedPackMaxSize = weightedPackMaxSize;
	}

	private BigDecimal weightedPackMinSize;

	public BigDecimal getWeightedPackMinSize() {
		return weightedPackMinSize;
	}

	public void setWeightedPackMinSize(BigDecimal weightedPackMinSize) {
		this.weightedPackMinSize = weightedPackMinSize;
	}

	private BigDecimal packSize;

	public BigDecimal getPackSize() {
		return packSize;
	}

	public void setPackSize(BigDecimal packSize) {
		this.packSize = packSize;
	}

	private BigDecimal itemListPrice;

	public BigDecimal getItemListPrice() {
		return itemListPrice;
	}

	public void setItemListPrice(BigDecimal itemListPrice) {
		this.itemListPrice = itemListPrice;
	}

	private boolean deleted;

	public boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

}


class OnlineInventoryVO {

	private String onlineClub;

	public String getOnlineClub() {
		return onlineClub;
	}

	public void setOnlineClub(String onlineClub) {
		this.onlineClub = onlineClub;
	}

	private BigInteger qtySold;

	public BigInteger getQtySold() {
		return qtySold;
	}

	public void setQtySold(BigInteger qtySold) {
		this.qtySold = qtySold;
	}

	private BigInteger qtyLeft;

	public BigInteger getQtyLeft() {
		return qtyLeft;
	}

	public void setQtyLeft(BigInteger qtyLeft) {
		this.qtyLeft = qtyLeft;
	}

	private BigInteger mAvailableToSellQuantity;

	public BigInteger getMAvailableToSellQuantity() {
		return mAvailableToSellQuantity;
	}

	public void setMAvailableToSellQuantity(BigInteger mAvailableToSellQuantity) {
		this.mAvailableToSellQuantity = mAvailableToSellQuantity;
	}

	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	private BigInteger minQuantity;

	public BigInteger getMinQuantity() {
		return minQuantity;
	}

	public void setMinQuantity(BigInteger minQuantity) {
		this.minQuantity = minQuantity;
	}

	private BigInteger maxQuantity;

	public BigInteger getMaxQuantity() {
		return maxQuantity;
	}

	public void setMaxQuantity(BigInteger maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

	private BigInteger legacyItemNo;

	public BigInteger getLegacyItemNo() {
		return legacyItemNo;
	}

	public void setLegacyItemNo(BigInteger legacyItemNo) {
		this.legacyItemNo = legacyItemNo;
	}

	private BigInteger clubNo;

	public BigInteger getClubNo() {
		return clubNo;
	}

	public void setClubNo(BigInteger clubNo) {
		this.clubNo = clubNo;
	}

	private boolean viewOnly;

	public boolean getViewOnly() {
		return viewOnly;
	}

	public void setViewOnly(boolean viewOnly) {
		this.viewOnly = viewOnly;
	}

}


class ClubInventoryVO {

	private BigInteger qtySold;

	public BigInteger getQtySold() {
		return qtySold;
	}

	public void setQtySold(BigInteger qtySold) {
		this.qtySold = qtySold;
	}

	private BigInteger qtyLeft;

	public BigInteger getQtyLeft() {
		return qtyLeft;
	}

	public void setQtyLeft(BigInteger qtyLeft) {
		this.qtyLeft = qtyLeft;
	}

	private BigInteger mAvailableToSellQuantity;

	public BigInteger getMAvailableToSellQuantity() {
		return mAvailableToSellQuantity;
	}

	public void setMAvailableToSellQuantity(BigInteger mAvailableToSellQuantity) {
		this.mAvailableToSellQuantity = mAvailableToSellQuantity;
	}

	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	private BigInteger minQuantity;

	public BigInteger getMinQuantity() {
		return minQuantity;
	}

	public void setMinQuantity(BigInteger minQuantity) {
		this.minQuantity = minQuantity;
	}

	private BigInteger maxQuantity;

	public BigInteger getMaxQuantity() {
		return maxQuantity;
	}

	public void setMaxQuantity(BigInteger maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

	private boolean viewOnly;

	public boolean getViewOnly() {
		return viewOnly;
	}

	public void setViewOnly(boolean viewOnly) {
		this.viewOnly = viewOnly;
	}

}


class OnlinePriceVO {

	private SavingDetailsVO savingDetailsVO;

	public SavingDetailsVO getSavingDetailsVO() {
		return savingDetailsVO;
	}

	public void setSavingDetailsVO(SavingDetailsVO savingDetailsVO) {
		this.savingDetailsVO = savingDetailsVO;
	}

	private boolean tobacco;

	public boolean getTobacco() {
		return tobacco;
	}

	public void setTobacco(boolean tobacco) {
		this.tobacco = tobacco;
	}

	private boolean chewingTobacco;

	public boolean getChewingTobacco() {
		return chewingTobacco;
	}

	public void setChewingTobacco(boolean chewingTobacco) {
		this.chewingTobacco = chewingTobacco;
	}

	private boolean showTobacco;

	public boolean getShowTobacco() {
		return showTobacco;
	}

	public void setShowTobacco(boolean showTobacco) {
		this.showTobacco = showTobacco;
	}

	private boolean mapPriceItem;

	public boolean getMapPriceItem() {
		return mapPriceItem;
	}

	public void setMapPriceItem(boolean mapPriceItem) {
		this.mapPriceItem = mapPriceItem;
	}

	private BigDecimal mapPrice;

	public BigDecimal getMapPrice() {
		return mapPrice;
	}

	public void setMapPrice(BigDecimal mapPrice) {
		this.mapPrice = mapPrice;
	}

	private boolean strikeOffPrice;

	public boolean getStrikeOffPrice() {
		return strikeOffPrice;
	}

	public void setStrikeOffPrice(boolean strikeOffPrice) {
		this.strikeOffPrice = strikeOffPrice;
	}

	private boolean onlineClubPricing;

	public boolean getOnlineClubPricing() {
		return onlineClubPricing;
	}

	public void setOnlineClubPricing(boolean onlineClubPricing) {
		this.onlineClubPricing = onlineClubPricing;
	}

	private boolean invalidPrice;

	public boolean getInvalidPrice() {
		return invalidPrice;
	}

	public void setInvalidPrice(boolean invalidPrice) {
		this.invalidPrice = invalidPrice;
	}

	private BigInteger itemNumber;

	public BigInteger getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(BigInteger itemNumber) {
		this.itemNumber = itemNumber;
	}

	private boolean unitPriceItem;

	public boolean getUnitPriceItem() {
		return unitPriceItem;
	}

	public void setUnitPriceItem(boolean unitPriceItem) {
		this.unitPriceItem = unitPriceItem;
	}

	private boolean variantMapOption;

	public boolean getVariantMapOption() {
		return variantMapOption;
	}

	public void setVariantMapOption(boolean variantMapOption) {
		this.variantMapOption = variantMapOption;
	}

	private BigDecimal listPrice;

	public BigDecimal getListPrice() {
		return listPrice;
	}

	public void setListPrice(BigDecimal listPrice) {
		this.listPrice = listPrice;
	}

	private BigDecimal finalPrice;

	public BigDecimal getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(BigDecimal finalPrice) {
		this.finalPrice = finalPrice;
	}

	private BigDecimal unitPrice;

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	private BigDecimal defaultPrice;

	public BigDecimal getDefaultPrice() {
		return defaultPrice;
	}

	public void setDefaultPrice(BigDecimal defaultPrice) {
		this.defaultPrice = defaultPrice;
	}

	private boolean isTaxExempted;

	public boolean getIsTaxExempted() {
		return isTaxExempted;
	}

	public void setIsTaxExempted(boolean isTaxExempted) {
		this.isTaxExempted = isTaxExempted;
	}

	private BigDecimal packMaxSize;

	public BigDecimal getPackMaxSize() {
		return packMaxSize;
	}

	public void setPackMaxSize(BigDecimal packMaxSize) {
		this.packMaxSize = packMaxSize;
	}

	private BigDecimal packMinSize;

	public BigDecimal getPackMinSize() {
		return packMinSize;
	}

	public void setPackMinSize(BigDecimal packMinSize) {
		this.packMinSize = packMinSize;
	}

	private BigDecimal ulpw;

	public BigDecimal getUlpw() {
		return ulpw;
	}

	public void setUlpw(BigDecimal ulpw) {
		this.ulpw = ulpw;
	}

	private boolean forcedLogin;

	public boolean getForcedLogin() {
		return forcedLogin;
	}

	public void setForcedLogin(boolean forcedLogin) {
		this.forcedLogin = forcedLogin;
	}

	private BigInteger mapOption;

	public BigInteger getMapOption() {
		return mapOption;
	}

	public void setMapOption(BigInteger mapOption) {
		this.mapOption = mapOption;
	}

	private BigInteger defaultMapOption;

	public BigInteger getDefaultMapOption() {
		return defaultMapOption;
	}

	public void setDefaultMapOption(BigInteger defaultMapOption) {
		this.defaultMapOption = defaultMapOption;
	}

	private boolean wirelessProduct;

	public boolean getWirelessProduct() {
		return wirelessProduct;
	}

	public void setWirelessProduct(boolean wirelessProduct) {
		this.wirelessProduct = wirelessProduct;
	}

	private boolean weightedItem;

	public boolean getWeightedItem() {
		return weightedItem;
	}

	public void setWeightedItem(boolean weightedItem) {
		this.weightedItem = weightedItem;
	}

	private BigDecimal msrpPrice;

	public BigDecimal getMsrpPrice() {
		return msrpPrice;
	}

	public void setMsrpPrice(BigDecimal msrpPrice) {
		this.msrpPrice = msrpPrice;
	}

	private boolean msrp;

	public boolean getMsrp() {
		return msrp;
	}

	public void setMsrp(boolean msrp) {
		this.msrp = msrp;
	}

	private BigDecimal minVariancePrice;

	public BigDecimal getMinVariancePrice() {
		return minVariancePrice;
	}

	public void setMinVariancePrice(BigDecimal minVariancePrice) {
		this.minVariancePrice = minVariancePrice;
	}

	private BigDecimal maxVariancePrice;

	public BigDecimal getMaxVariancePrice() {
		return maxVariancePrice;
	}

	public void setMaxVariancePrice(BigDecimal maxVariancePrice) {
		this.maxVariancePrice = maxVariancePrice;
	}

	private boolean varianceRangePrice;

	public boolean getVarianceRangePrice() {
		return varianceRangePrice;
	}

	public void setVarianceRangePrice(boolean varianceRangePrice) {
		this.varianceRangePrice = varianceRangePrice;
	}

	private boolean varianceMapPriceRange;

	public boolean getVarianceMapPriceRange() {
		return varianceMapPriceRange;
	}

	public void setVarianceMapPriceRange(boolean varianceMapPriceRange) {
		this.varianceMapPriceRange = varianceMapPriceRange;
	}

	private BigDecimal minVarianceMapPrice;

	public BigDecimal getMinVarianceMapPrice() {
		return minVarianceMapPrice;
	}

	public void setMinVarianceMapPrice(BigDecimal minVarianceMapPrice) {
		this.minVarianceMapPrice = minVarianceMapPrice;
	}

	private BigDecimal maxVarianceMapPrice;

	public BigDecimal getMaxVarianceMapPrice() {
		return maxVarianceMapPrice;
	}

	public void setMaxVarianceMapPrice(BigDecimal maxVarianceMapPrice) {
		this.maxVarianceMapPrice = maxVarianceMapPrice;
	}

	private boolean multipleSavingsProduct;

	public boolean getMultipleSavingsProduct() {
		return multipleSavingsProduct;
	}

	public void setMultipleSavingsProduct(boolean multipleSavingsProduct) {
		this.multipleSavingsProduct = multipleSavingsProduct;
	}

	private String unitOfMeassureSingular;

	public String getUnitOfMeassureSingular() {
		return unitOfMeassureSingular;
	}

	public void setUnitOfMeassureSingular(String unitOfMeassureSingular) {
		this.unitOfMeassureSingular = unitOfMeassureSingular;
	}

	private String unitOfMeassurePlural;

	public String getUnitOfMeassurePlural() {
		return unitOfMeassurePlural;
	}

	public void setUnitOfMeassurePlural(String unitOfMeassurePlural) {
		this.unitOfMeassurePlural = unitOfMeassurePlural;
	}

	private BigDecimal comparativePrice;

	public BigDecimal getComparativePrice() {
		return comparativePrice;
	}

	public void setComparativePrice(BigDecimal comparativePrice) {
		this.comparativePrice = comparativePrice;
	}

	private BigDecimal originalListPrice;

	public BigDecimal getOriginalListPrice() {
		return originalListPrice;
	}

	public void setOriginalListPrice(BigDecimal originalListPrice) {
		this.originalListPrice = originalListPrice;
	}

	private String priceStatus;

	public String getPriceStatus() {
		return priceStatus;
	}

	public void setPriceStatus(String priceStatus) {
		this.priceStatus = priceStatus;
	}

	private boolean specialOrderPricing;

	public boolean getSpecialOrderPricing() {
		return specialOrderPricing;
	}

	public void setSpecialOrderPricing(boolean specialOrderPricing) {
		this.specialOrderPricing = specialOrderPricing;
	}

	private boolean fromPrice;

	public boolean getFromPrice() {
		return fromPrice;
	}

	public void setFromPrice(boolean fromPrice) {
		this.fromPrice = fromPrice;
	}

}


class SavingDetailsVO {

	private String savingType;

	public String getSavingType() {
		return savingType;
	}

	public void setSavingType(String savingType) {
		this.savingType = savingType;
	}

	private String discountType;

	public String getDiscountType() {
		return discountType;
	}

	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	private String savingMessageShort;

	public String getSavingMessageShort() {
		return savingMessageShort;
	}

	public void setSavingMessageShort(String savingMessageShort) {
		this.savingMessageShort = savingMessageShort;
	}

	private String savingMessageLong;

	public String getSavingMessageLong() {
		return savingMessageLong;
	}

	public void setSavingMessageLong(String savingMessageLong) {
		this.savingMessageLong = savingMessageLong;
	}

	private String specialMessage;

	public String getSpecialMessage() {
		return specialMessage;
	}

	public void setSpecialMessage(String specialMessage) {
		this.specialMessage = specialMessage;
	}

	private String popupMessage;

	public String getPopupMessage() {
		return popupMessage;
	}

	public void setPopupMessage(String popupMessage) {
		this.popupMessage = popupMessage;
	}

	private BigDecimal amountSaved;

	public BigDecimal getAmountSaved() {
		return amountSaved;
	}

	public void setAmountSaved(BigDecimal amountSaved) {
		this.amountSaved = amountSaved;
	}

	private BigDecimal percentSaved;

	public BigDecimal getPercentSaved() {
		return percentSaved;
	}

	public void setPercentSaved(BigDecimal percentSaved) {
		this.percentSaved = percentSaved;
	}

	private BigDecimal discountedPrice;

	public BigDecimal getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(BigDecimal discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	private BigInteger limitPerMember;

	public BigInteger getLimitPerMember() {
		return limitPerMember;
	}

	public void setLimitPerMember(BigInteger limitPerMember) {
		this.limitPerMember = limitPerMember;
	}

	private BigInteger skuType;

	public BigInteger getSkuType() {
		return skuType;
	}

	public void setSkuType(BigInteger skuType) {
		this.skuType = skuType;
	}

	private boolean clubInsiderPackageCode;

	public boolean getClubInsiderPackageCode() {
		return clubInsiderPackageCode;
	}

	public void setClubInsiderPackageCode(boolean clubInsiderPackageCode) {
		this.clubInsiderPackageCode = clubInsiderPackageCode;
	}

	private BigInteger minQuantity;

	public BigInteger getMinQuantity() {
		return minQuantity;
	}

	public void setMinQuantity(BigInteger minQuantity) {
		this.minQuantity = minQuantity;
	}

}


class VarianceValueMap {

	private Color color;

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}


class Color {

	private BigInteger upcId;

	public BigInteger getUpcId() {
		return upcId;
	}

	public void setUpcId(BigInteger upcId) {
		this.upcId = upcId;
	}

	private String varianceName;

	public String getVarianceName() {
		return varianceName;
	}

	public void setVarianceName(String varianceName) {
		this.varianceName = varianceName;
	}

	private String varianceNameOriginal;

	public String getVarianceNameOriginal() {
		return varianceNameOriginal;
	}

	public void setVarianceNameOriginal(String varianceNameOriginal) {
		this.varianceNameOriginal = varianceNameOriginal;
	}

	private String varianceValue;

	public String getVarianceValue() {
		return varianceValue;
	}

	public void setVarianceValue(String varianceValue) {
		this.varianceValue = varianceValue;
	}

	private String skuId;

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}


class ServiceAgreement {

}


class FlowerDeliveryDate {

}


class MoneyBox {

	private boolean checkOnlineInventory;

	public boolean getCheckOnlineInventory() {
		return checkOnlineInventory;
	}

	public void setCheckOnlineInventory(boolean checkOnlineInventory) {
		this.checkOnlineInventory = checkOnlineInventory;
	}

	private boolean checkClubInventory;

	public boolean getCheckClubInventory() {
		return checkClubInventory;
	}

	public void setCheckClubInventory(boolean checkClubInventory) {
		this.checkClubInventory = checkClubInventory;
	}

	private boolean checkOnlinePricing;

	public boolean getCheckOnlinePricing() {
		return checkOnlinePricing;
	}

	public void setCheckOnlinePricing(boolean checkOnlinePricing) {
		this.checkOnlinePricing = checkOnlinePricing;
	}

	private boolean checkClubPricing;

	public boolean getCheckClubPricing() {
		return checkClubPricing;
	}

	public void setCheckClubPricing(boolean checkClubPricing) {
		this.checkClubPricing = checkClubPricing;
	}

	private boolean populateProductDetails;

	public boolean getPopulateProductDetails() {
		return populateProductDetails;
	}

	public void setPopulateProductDetails(boolean populateProductDetails) {
		this.populateProductDetails = populateProductDetails;
	}

}


class RelatedSkus {

}


class SelectedSKU {

	private Collection<ItemNumberDetails3> itemNumberDetails3;

	public Collection<ItemNumberDetails3> getItemNumberDetails3() {
		return itemNumberDetails3;
	}

	public void setItemNumberDetails3(Collection<ItemNumberDetails3> itemNumberDetails3) {
		this.itemNumberDetails3 = itemNumberDetails3;
	}

	private OnlineInventoryVO2 onlineInventoryVO2;

	public OnlineInventoryVO2 getOnlineInventoryVO2() {
		return onlineInventoryVO2;
	}

	public void setOnlineInventoryVO2(OnlineInventoryVO2 onlineInventoryVO2) {
		this.onlineInventoryVO2 = onlineInventoryVO2;
	}

	private ClubInventoryVO2 clubInventoryVO2;

	public ClubInventoryVO2 getClubInventoryVO2() {
		return clubInventoryVO2;
	}

	public void setClubInventoryVO2(ClubInventoryVO2 clubInventoryVO2) {
		this.clubInventoryVO2 = clubInventoryVO2;
	}

	private OnlinePriceVO2 onlinePriceVO2;

	public OnlinePriceVO2 getOnlinePriceVO2() {
		return onlinePriceVO2;
	}

	public void setOnlinePriceVO2(OnlinePriceVO2 onlinePriceVO2) {
		this.onlinePriceVO2 = onlinePriceVO2;
	}

	private VarianceValueMap2 varianceValueMap2;

	public VarianceValueMap2 getVarianceValueMap2() {
		return varianceValueMap2;
	}

	public void setVarianceValueMap2(VarianceValueMap2 varianceValueMap2) {
		this.varianceValueMap2 = varianceValueMap2;
	}

	private Collection<ServiceAgreement2> serviceAgreement2;

	public Collection<ServiceAgreement2> getServiceAgreement2() {
		return serviceAgreement2;
	}

	public void setServiceAgreement2(Collection<ServiceAgreement2> serviceAgreement2) {
		this.serviceAgreement2 = serviceAgreement2;
	}

	private Collection<FlowerDeliveryDate2> flowerDeliveryDate2;

	public Collection<FlowerDeliveryDate2> getFlowerDeliveryDate2() {
		return flowerDeliveryDate2;
	}

	public void setFlowerDeliveryDate2(Collection<FlowerDeliveryDate2> flowerDeliveryDate2) {
		this.flowerDeliveryDate2 = flowerDeliveryDate2;
	}

	private MoneyBox2 moneyBox2;

	public MoneyBox2 getMoneyBox2() {
		return moneyBox2;
	}

	public void setMoneyBox2(MoneyBox2 moneyBox2) {
		this.moneyBox2 = moneyBox2;
	}

	private Collection<RelatedSkus2> relatedSkus2;

	public Collection<RelatedSkus2> getRelatedSkus2() {
		return relatedSkus2;
	}

	public void setRelatedSkus2(Collection<RelatedSkus2> relatedSkus2) {
		this.relatedSkus2 = relatedSkus2;
	}

	private BigDecimal msrpPrice;

	public BigDecimal getMsrpPrice() {
		return msrpPrice;
	}

	public void setMsrpPrice(BigDecimal msrpPrice) {
		this.msrpPrice = msrpPrice;
	}

	private String listImage;

	public String getListImage() {
		return listImage;
	}

	public void setListImage(String listImage) {
		this.listImage = listImage;
	}

	private String skuName;

	public String getSkuName() {
		return skuName;
	}

	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

	private String skuId;

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	private BigInteger itemNo;

	public BigInteger getItemNo() {
		return itemNo;
	}

	public void setItemNo(BigInteger itemNo) {
		this.itemNo = itemNo;
	}

	private BigInteger onlineLegacyItemId;

	public BigInteger getOnlineLegacyItemId() {
		return onlineLegacyItemId;
	}

	public void setOnlineLegacyItemId(BigInteger onlineLegacyItemId) {
		this.onlineLegacyItemId = onlineLegacyItemId;
	}

	private BigInteger clubLegacyItemId;

	public BigInteger getClubLegacyItemId() {
		return clubLegacyItemId;
	}

	public void setClubLegacyItemId(BigInteger clubLegacyItemId) {
		this.clubLegacyItemId = clubLegacyItemId;
	}

	private boolean viewOnly;

	public boolean getViewOnly() {
		return viewOnly;
	}

	public void setViewOnly(boolean viewOnly) {
		this.viewOnly = viewOnly;
	}

	private BigInteger modelNo;

	public BigInteger getModelNo() {
		return modelNo;
	}

	public void setModelNo(BigInteger modelNo) {
		this.modelNo = modelNo;
	}

	private String imageName;

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	private boolean subscribeEnabled;

	public boolean getSubscribeEnabled() {
		return subscribeEnabled;
	}

	public void setSubscribeEnabled(boolean subscribeEnabled) {
		this.subscribeEnabled = subscribeEnabled;
	}

	private boolean subscribed;

	public boolean getSubscribed() {
		return subscribed;
	}

	public void setSubscribed(boolean subscribed) {
		this.subscribed = subscribed;
	}

	private BigDecimal mapPrice;

	public BigDecimal getMapPrice() {
		return mapPrice;
	}

	public void setMapPrice(BigDecimal mapPrice) {
		this.mapPrice = mapPrice;
	}

	private boolean strikeOffPrice;

	public boolean getStrikeOffPrice() {
		return strikeOffPrice;
	}

	public void setStrikeOffPrice(boolean strikeOffPrice) {
		this.strikeOffPrice = strikeOffPrice;
	}

	private BigInteger imageId;

	public BigInteger getImageId() {
		return imageId;
	}

	public void setImageId(BigInteger imageId) {
		this.imageId = imageId;
	}

	private boolean tobacco;

	public boolean getTobacco() {
		return tobacco;
	}

	public void setTobacco(boolean tobacco) {
		this.tobacco = tobacco;
	}

	private boolean chewingTobacco;

	public boolean getChewingTobacco() {
		return chewingTobacco;
	}

	public void setChewingTobacco(boolean chewingTobacco) {
		this.chewingTobacco = chewingTobacco;
	}

	private boolean showTobacco;

	public boolean getShowTobacco() {
		return showTobacco;
	}

	public void setShowTobacco(boolean showTobacco) {
		this.showTobacco = showTobacco;
	}

	private String shippingMethodType;

	public String getShippingMethodType() {
		return shippingMethodType;
	}

	public void setShippingMethodType(String shippingMethodType) {
		this.shippingMethodType = shippingMethodType;
	}

	private boolean auctionSku;

	public boolean getAuctionSku() {
		return auctionSku;
	}

	public void setAuctionSku(boolean auctionSku) {
		this.auctionSku = auctionSku;
	}

	private BigInteger upc;

	public BigInteger getUpc() {
		return upc;
	}

	public void setUpc(BigInteger upc) {
		this.upc = upc;
	}

	private boolean freeShippingFlag;

	public boolean getFreeShippingFlag() {
		return freeShippingFlag;
	}

	public void setFreeShippingFlag(boolean freeShippingFlag) {
		this.freeShippingFlag = freeShippingFlag;
	}

	private boolean serviceAgreementProductFlag;

	public boolean getServiceAgreementProductFlag() {
		return serviceAgreementProductFlag;
	}

	public void setServiceAgreementProductFlag(boolean serviceAgreementProductFlag) {
		this.serviceAgreementProductFlag = serviceAgreementProductFlag;
	}

	private boolean instockNotification;

	public boolean getInstockNotification() {
		return instockNotification;
	}

	public void setInstockNotification(boolean instockNotification) {
		this.instockNotification = instockNotification;
	}

	private boolean electronicDeliveryFlag;

	public boolean getElectronicDeliveryFlag() {
		return electronicDeliveryFlag;
	}

	public void setElectronicDeliveryFlag(boolean electronicDeliveryFlag) {
		this.electronicDeliveryFlag = electronicDeliveryFlag;
	}

	private String scene7Imageurl;

	public String getScene7Imageurl() {
		return scene7Imageurl;
	}

	public void setScene7Imageurl(String scene7Imageurl) {
		this.scene7Imageurl = scene7Imageurl;
	}

	private BigInteger productReviewCounts;

	public BigInteger getProductReviewCounts() {
		return productReviewCounts;
	}

	public void setProductReviewCounts(BigInteger productReviewCounts) {
		this.productReviewCounts = productReviewCounts;
	}

	private BigDecimal productAvgRating;

	public BigDecimal getProductAvgRating() {
		return productAvgRating;
	}

	public void setProductAvgRating(BigDecimal productAvgRating) {
		this.productAvgRating = productAvgRating;
	}

	private String productType;

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	private boolean serviceAgreementFlag;

	public boolean getServiceAgreementFlag() {
		return serviceAgreementFlag;
	}

	public void setServiceAgreementFlag(boolean serviceAgreementFlag) {
		this.serviceAgreementFlag = serviceAgreementFlag;
	}

	private boolean isAvaiableSeperately;

	public boolean getIsAvaiableSeperately() {
		return isAvaiableSeperately;
	}

	public void setIsAvaiableSeperately(boolean isAvaiableSeperately) {
		this.isAvaiableSeperately = isAvaiableSeperately;
	}

	private boolean evalueAvailableFlag;

	public boolean getEvalueAvailableFlag() {
		return evalueAvailableFlag;
	}

	public void setEvalueAvailableFlag(boolean evalueAvailableFlag) {
		this.evalueAvailableFlag = evalueAvailableFlag;
	}

	private BigInteger shipDays;

	public BigInteger getShipDays() {
		return shipDays;
	}

	public void setShipDays(BigInteger shipDays) {
		this.shipDays = shipDays;
	}

	private String productId;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	private String scene7serverUrl;

	public String getScene7serverUrl() {
		return scene7serverUrl;
	}

	public void setScene7serverUrl(String scene7serverUrl) {
		this.scene7serverUrl = scene7serverUrl;
	}

	private String scene7serverUrlWithProtocol;

	public String getScene7serverUrlWithProtocol() {
		return scene7serverUrlWithProtocol;
	}

	public void setScene7serverUrlWithProtocol(String scene7serverUrlWithProtocol) {
		this.scene7serverUrlWithProtocol = scene7serverUrlWithProtocol;
	}

	private String scene7ColorAppender;

	public String getScene7ColorAppender() {
		return scene7ColorAppender;
	}

	public void setScene7ColorAppender(String scene7ColorAppender) {
		this.scene7ColorAppender = scene7ColorAppender;
	}

	private String scene7ClientName;

	public String getScene7ClientName() {
		return scene7ClientName;
	}

	public void setScene7ClientName(String scene7ClientName) {
		this.scene7ClientName = scene7ClientName;
	}

	private boolean clubSelected;

	public boolean getClubSelected() {
		return clubSelected;
	}

	public void setClubSelected(boolean clubSelected) {
		this.clubSelected = clubSelected;
	}

	private boolean promotionSKu;

	public boolean getPromotionSKu() {
		return promotionSKu;
	}

	public void setPromotionSKu(boolean promotionSKu) {
		this.promotionSKu = promotionSKu;
	}

	private boolean flowersTemplateProduct;

	public boolean getFlowersTemplateProduct() {
		return flowersTemplateProduct;
	}

	public void setFlowersTemplateProduct(boolean flowersTemplateProduct) {
		this.flowersTemplateProduct = flowersTemplateProduct;
	}

	private boolean populateSkuDetails;

	public boolean getPopulateSkuDetails() {
		return populateSkuDetails;
	}

	public void setPopulateSkuDetails(boolean populateSkuDetails) {
		this.populateSkuDetails = populateSkuDetails;
	}

	private boolean isServiceAgreementEligible;

	public boolean getIsServiceAgreementEligible() {
		return isServiceAgreementEligible;
	}

	public void setIsServiceAgreementEligible(boolean isServiceAgreementEligible) {
		this.isServiceAgreementEligible = isServiceAgreementEligible;
	}

	private boolean cnpSpecialOrder;

	public boolean getCnpSpecialOrder() {
		return cnpSpecialOrder;
	}

	public void setCnpSpecialOrder(boolean cnpSpecialOrder) {
		this.cnpSpecialOrder = cnpSpecialOrder;
	}

	private BigInteger merchandiseCategory;

	public BigInteger getMerchandiseCategory() {
		return merchandiseCategory;
	}

	public void setMerchandiseCategory(BigInteger merchandiseCategory) {
		this.merchandiseCategory = merchandiseCategory;
	}

	private BigInteger merchandiseSubCategory;

	public BigInteger getMerchandiseSubCategory() {
		return merchandiseSubCategory;
	}

	public void setMerchandiseSubCategory(BigInteger merchandiseSubCategory) {
		this.merchandiseSubCategory = merchandiseSubCategory;
	}

	private String skuType;

	public String getSkuType() {
		return skuType;
	}

	public void setSkuType(String skuType) {
		this.skuType = skuType;
	}

	private BigInteger onlineThreshholdValue;

	public BigInteger getOnlineThreshholdValue() {
		return onlineThreshholdValue;
	}

	public void setOnlineThreshholdValue(BigInteger onlineThreshholdValue) {
		this.onlineThreshholdValue = onlineThreshholdValue;
	}

}


class ItemNumberDetails3 {

	private BigInteger itemnumber;

	public BigInteger getItemnumber() {
		return itemnumber;
	}

	public void setItemnumber(BigInteger itemnumber) {
		this.itemnumber = itemnumber;
	}

	private String fulfillmentOption;

	public String getFulfillmentOption() {
		return fulfillmentOption;
	}

	public void setFulfillmentOption(String fulfillmentOption) {
		this.fulfillmentOption = fulfillmentOption;
	}

	private boolean merchAuthorized;

	public boolean getMerchAuthorized() {
		return merchAuthorized;
	}

	public void setMerchAuthorized(boolean merchAuthorized) {
		this.merchAuthorized = merchAuthorized;
	}

	private boolean isViewOnly;

	public boolean getIsViewOnly() {
		return isViewOnly;
	}

	public void setIsViewOnly(boolean isViewOnly) {
		this.isViewOnly = isViewOnly;
	}

	private BigInteger thresholdQty;

	public BigInteger getThresholdQty() {
		return thresholdQty;
	}

	public void setThresholdQty(BigInteger thresholdQty) {
		this.thresholdQty = thresholdQty;
	}

	private BigInteger legacyItemId;

	public BigInteger getLegacyItemId() {
		return legacyItemId;
	}

	public void setLegacyItemId(BigInteger legacyItemId) {
		this.legacyItemId = legacyItemId;
	}

	private boolean instockNotificatoinEnabled;

	public boolean getInstockNotificatoinEnabled() {
		return instockNotificatoinEnabled;
	}

	public void setInstockNotificatoinEnabled(boolean instockNotificatoinEnabled) {
		this.instockNotificatoinEnabled = instockNotificatoinEnabled;
	}

	private BigInteger onlineThreshholdValue;

	public BigInteger getOnlineThreshholdValue() {
		return onlineThreshholdValue;
	}

	public void setOnlineThreshholdValue(BigInteger onlineThreshholdValue) {
		this.onlineThreshholdValue = onlineThreshholdValue;
	}

	private boolean isWeightedItem;

	public boolean getIsWeightedItem() {
		return isWeightedItem;
	}

	public void setIsWeightedItem(boolean isWeightedItem) {
		this.isWeightedItem = isWeightedItem;
	}

	private boolean isUnitPriceItem;

	public boolean getIsUnitPriceItem() {
		return isUnitPriceItem;
	}

	public void setIsUnitPriceItem(boolean isUnitPriceItem) {
		this.isUnitPriceItem = isUnitPriceItem;
	}

	private BigDecimal weightedPackMaxSize;

	public BigDecimal getWeightedPackMaxSize() {
		return weightedPackMaxSize;
	}

	public void setWeightedPackMaxSize(BigDecimal weightedPackMaxSize) {
		this.weightedPackMaxSize = weightedPackMaxSize;
	}

	private BigDecimal weightedPackMinSize;

	public BigDecimal getWeightedPackMinSize() {
		return weightedPackMinSize;
	}

	public void setWeightedPackMinSize(BigDecimal weightedPackMinSize) {
		this.weightedPackMinSize = weightedPackMinSize;
	}

	private BigDecimal packSize;

	public BigDecimal getPackSize() {
		return packSize;
	}

	public void setPackSize(BigDecimal packSize) {
		this.packSize = packSize;
	}

	private BigDecimal itemListPrice;

	public BigDecimal getItemListPrice() {
		return itemListPrice;
	}

	public void setItemListPrice(BigDecimal itemListPrice) {
		this.itemListPrice = itemListPrice;
	}

	private boolean deleted;

	public boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

}


class OnlineInventoryVO2 {

	private String onlineClub;

	public String getOnlineClub() {
		return onlineClub;
	}

	public void setOnlineClub(String onlineClub) {
		this.onlineClub = onlineClub;
	}

	private BigInteger qtySold;

	public BigInteger getQtySold() {
		return qtySold;
	}

	public void setQtySold(BigInteger qtySold) {
		this.qtySold = qtySold;
	}

	private BigInteger qtyLeft;

	public BigInteger getQtyLeft() {
		return qtyLeft;
	}

	public void setQtyLeft(BigInteger qtyLeft) {
		this.qtyLeft = qtyLeft;
	}

	private BigInteger mAvailableToSellQuantity;

	public BigInteger getMAvailableToSellQuantity() {
		return mAvailableToSellQuantity;
	}

	public void setMAvailableToSellQuantity(BigInteger mAvailableToSellQuantity) {
		this.mAvailableToSellQuantity = mAvailableToSellQuantity;
	}

	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	private BigInteger minQuantity;

	public BigInteger getMinQuantity() {
		return minQuantity;
	}

	public void setMinQuantity(BigInteger minQuantity) {
		this.minQuantity = minQuantity;
	}

	private BigInteger maxQuantity;

	public BigInteger getMaxQuantity() {
		return maxQuantity;
	}

	public void setMaxQuantity(BigInteger maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

	private BigInteger legacyItemNo;

	public BigInteger getLegacyItemNo() {
		return legacyItemNo;
	}

	public void setLegacyItemNo(BigInteger legacyItemNo) {
		this.legacyItemNo = legacyItemNo;
	}

	private BigInteger clubNo;

	public BigInteger getClubNo() {
		return clubNo;
	}

	public void setClubNo(BigInteger clubNo) {
		this.clubNo = clubNo;
	}

	private boolean viewOnly;

	public boolean getViewOnly() {
		return viewOnly;
	}

	public void setViewOnly(boolean viewOnly) {
		this.viewOnly = viewOnly;
	}

}


class ClubInventoryVO2 {

	private BigInteger qtySold;

	public BigInteger getQtySold() {
		return qtySold;
	}

	public void setQtySold(BigInteger qtySold) {
		this.qtySold = qtySold;
	}

	private BigInteger qtyLeft;

	public BigInteger getQtyLeft() {
		return qtyLeft;
	}

	public void setQtyLeft(BigInteger qtyLeft) {
		this.qtyLeft = qtyLeft;
	}

	private BigInteger mAvailableToSellQuantity;

	public BigInteger getMAvailableToSellQuantity() {
		return mAvailableToSellQuantity;
	}

	public void setMAvailableToSellQuantity(BigInteger mAvailableToSellQuantity) {
		this.mAvailableToSellQuantity = mAvailableToSellQuantity;
	}

	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	private BigInteger minQuantity;

	public BigInteger getMinQuantity() {
		return minQuantity;
	}

	public void setMinQuantity(BigInteger minQuantity) {
		this.minQuantity = minQuantity;
	}

	private BigInteger maxQuantity;

	public BigInteger getMaxQuantity() {
		return maxQuantity;
	}

	public void setMaxQuantity(BigInteger maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

	private boolean viewOnly;

	public boolean getViewOnly() {
		return viewOnly;
	}

	public void setViewOnly(boolean viewOnly) {
		this.viewOnly = viewOnly;
	}

}


class OnlinePriceVO2 {

	private boolean tobacco;

	public boolean getTobacco() {
		return tobacco;
	}

	public void setTobacco(boolean tobacco) {
		this.tobacco = tobacco;
	}

	private boolean chewingTobacco;

	public boolean getChewingTobacco() {
		return chewingTobacco;
	}

	public void setChewingTobacco(boolean chewingTobacco) {
		this.chewingTobacco = chewingTobacco;
	}

	private boolean showTobacco;

	public boolean getShowTobacco() {
		return showTobacco;
	}

	public void setShowTobacco(boolean showTobacco) {
		this.showTobacco = showTobacco;
	}

	private boolean mapPriceItem;

	public boolean getMapPriceItem() {
		return mapPriceItem;
	}

	public void setMapPriceItem(boolean mapPriceItem) {
		this.mapPriceItem = mapPriceItem;
	}

	private BigDecimal mapPrice;

	public BigDecimal getMapPrice() {
		return mapPrice;
	}

	public void setMapPrice(BigDecimal mapPrice) {
		this.mapPrice = mapPrice;
	}

	private boolean strikeOffPrice;

	public boolean getStrikeOffPrice() {
		return strikeOffPrice;
	}

	public void setStrikeOffPrice(boolean strikeOffPrice) {
		this.strikeOffPrice = strikeOffPrice;
	}

	private boolean onlineClubPricing;

	public boolean getOnlineClubPricing() {
		return onlineClubPricing;
	}

	public void setOnlineClubPricing(boolean onlineClubPricing) {
		this.onlineClubPricing = onlineClubPricing;
	}

	private boolean invalidPrice;

	public boolean getInvalidPrice() {
		return invalidPrice;
	}

	public void setInvalidPrice(boolean invalidPrice) {
		this.invalidPrice = invalidPrice;
	}

	private BigInteger itemNumber;

	public BigInteger getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(BigInteger itemNumber) {
		this.itemNumber = itemNumber;
	}

	private boolean unitPriceItem;

	public boolean getUnitPriceItem() {
		return unitPriceItem;
	}

	public void setUnitPriceItem(boolean unitPriceItem) {
		this.unitPriceItem = unitPriceItem;
	}

	private boolean variantMapOption;

	public boolean getVariantMapOption() {
		return variantMapOption;
	}

	public void setVariantMapOption(boolean variantMapOption) {
		this.variantMapOption = variantMapOption;
	}

	private BigDecimal listPrice;

	public BigDecimal getListPrice() {
		return listPrice;
	}

	public void setListPrice(BigDecimal listPrice) {
		this.listPrice = listPrice;
	}

	private BigDecimal finalPrice;

	public BigDecimal getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(BigDecimal finalPrice) {
		this.finalPrice = finalPrice;
	}

	private BigDecimal unitPrice;

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	private BigDecimal defaultPrice;

	public BigDecimal getDefaultPrice() {
		return defaultPrice;
	}

	public void setDefaultPrice(BigDecimal defaultPrice) {
		this.defaultPrice = defaultPrice;
	}

	private boolean isTaxExempted;

	public boolean getIsTaxExempted() {
		return isTaxExempted;
	}

	public void setIsTaxExempted(boolean isTaxExempted) {
		this.isTaxExempted = isTaxExempted;
	}

	private BigDecimal packMaxSize;

	public BigDecimal getPackMaxSize() {
		return packMaxSize;
	}

	public void setPackMaxSize(BigDecimal packMaxSize) {
		this.packMaxSize = packMaxSize;
	}

	private BigDecimal packMinSize;

	public BigDecimal getPackMinSize() {
		return packMinSize;
	}

	public void setPackMinSize(BigDecimal packMinSize) {
		this.packMinSize = packMinSize;
	}

	private BigDecimal ulpw;

	public BigDecimal getUlpw() {
		return ulpw;
	}

	public void setUlpw(BigDecimal ulpw) {
		this.ulpw = ulpw;
	}

	private boolean forcedLogin;

	public boolean getForcedLogin() {
		return forcedLogin;
	}

	public void setForcedLogin(boolean forcedLogin) {
		this.forcedLogin = forcedLogin;
	}

	private BigInteger mapOption;

	public BigInteger getMapOption() {
		return mapOption;
	}

	public void setMapOption(BigInteger mapOption) {
		this.mapOption = mapOption;
	}

	private BigInteger defaultMapOption;

	public BigInteger getDefaultMapOption() {
		return defaultMapOption;
	}

	public void setDefaultMapOption(BigInteger defaultMapOption) {
		this.defaultMapOption = defaultMapOption;
	}

	private boolean wirelessProduct;

	public boolean getWirelessProduct() {
		return wirelessProduct;
	}

	public void setWirelessProduct(boolean wirelessProduct) {
		this.wirelessProduct = wirelessProduct;
	}

	private boolean weightedItem;

	public boolean getWeightedItem() {
		return weightedItem;
	}

	public void setWeightedItem(boolean weightedItem) {
		this.weightedItem = weightedItem;
	}

	private BigDecimal msrpPrice;

	public BigDecimal getMsrpPrice() {
		return msrpPrice;
	}

	public void setMsrpPrice(BigDecimal msrpPrice) {
		this.msrpPrice = msrpPrice;
	}

	private boolean msrp;

	public boolean getMsrp() {
		return msrp;
	}

	public void setMsrp(boolean msrp) {
		this.msrp = msrp;
	}

	private BigDecimal minVariancePrice;

	public BigDecimal getMinVariancePrice() {
		return minVariancePrice;
	}

	public void setMinVariancePrice(BigDecimal minVariancePrice) {
		this.minVariancePrice = minVariancePrice;
	}

	private BigDecimal maxVariancePrice;

	public BigDecimal getMaxVariancePrice() {
		return maxVariancePrice;
	}

	public void setMaxVariancePrice(BigDecimal maxVariancePrice) {
		this.maxVariancePrice = maxVariancePrice;
	}

	private boolean varianceRangePrice;

	public boolean getVarianceRangePrice() {
		return varianceRangePrice;
	}

	public void setVarianceRangePrice(boolean varianceRangePrice) {
		this.varianceRangePrice = varianceRangePrice;
	}

	private boolean varianceMapPriceRange;

	public boolean getVarianceMapPriceRange() {
		return varianceMapPriceRange;
	}

	public void setVarianceMapPriceRange(boolean varianceMapPriceRange) {
		this.varianceMapPriceRange = varianceMapPriceRange;
	}

	private BigDecimal minVarianceMapPrice;

	public BigDecimal getMinVarianceMapPrice() {
		return minVarianceMapPrice;
	}

	public void setMinVarianceMapPrice(BigDecimal minVarianceMapPrice) {
		this.minVarianceMapPrice = minVarianceMapPrice;
	}

	private BigDecimal maxVarianceMapPrice;

	public BigDecimal getMaxVarianceMapPrice() {
		return maxVarianceMapPrice;
	}

	public void setMaxVarianceMapPrice(BigDecimal maxVarianceMapPrice) {
		this.maxVarianceMapPrice = maxVarianceMapPrice;
	}

	private boolean multipleSavingsProduct;

	public boolean getMultipleSavingsProduct() {
		return multipleSavingsProduct;
	}

	public void setMultipleSavingsProduct(boolean multipleSavingsProduct) {
		this.multipleSavingsProduct = multipleSavingsProduct;
	}

	private String unitOfMeassureSingular;

	public String getUnitOfMeassureSingular() {
		return unitOfMeassureSingular;
	}

	public void setUnitOfMeassureSingular(String unitOfMeassureSingular) {
		this.unitOfMeassureSingular = unitOfMeassureSingular;
	}

	private String unitOfMeassurePlural;

	public String getUnitOfMeassurePlural() {
		return unitOfMeassurePlural;
	}

	public void setUnitOfMeassurePlural(String unitOfMeassurePlural) {
		this.unitOfMeassurePlural = unitOfMeassurePlural;
	}

	private BigDecimal comparativePrice;

	public BigDecimal getComparativePrice() {
		return comparativePrice;
	}

	public void setComparativePrice(BigDecimal comparativePrice) {
		this.comparativePrice = comparativePrice;
	}

	private BigDecimal originalListPrice;

	public BigDecimal getOriginalListPrice() {
		return originalListPrice;
	}

	public void setOriginalListPrice(BigDecimal originalListPrice) {
		this.originalListPrice = originalListPrice;
	}

	private String priceStatus;

	public String getPriceStatus() {
		return priceStatus;
	}

	public void setPriceStatus(String priceStatus) {
		this.priceStatus = priceStatus;
	}

	private boolean specialOrderPricing;

	public boolean getSpecialOrderPricing() {
		return specialOrderPricing;
	}

	public void setSpecialOrderPricing(boolean specialOrderPricing) {
		this.specialOrderPricing = specialOrderPricing;
	}

	private boolean fromPrice;

	public boolean getFromPrice() {
		return fromPrice;
	}

	public void setFromPrice(boolean fromPrice) {
		this.fromPrice = fromPrice;
	}

}


class VarianceValueMap2 {

	private Color2 color2;

	public Color2 getColor2() {
		return color2;
	}

	public void setColor2(Color2 color2) {
		this.color2 = color2;
	}

}


class Color2 {

	private BigInteger upcId;

	public BigInteger getUpcId() {
		return upcId;
	}

	public void setUpcId(BigInteger upcId) {
		this.upcId = upcId;
	}

	private String varianceName;

	public String getVarianceName() {
		return varianceName;
	}

	public void setVarianceName(String varianceName) {
		this.varianceName = varianceName;
	}

	private String varianceNameOriginal;

	public String getVarianceNameOriginal() {
		return varianceNameOriginal;
	}

	public void setVarianceNameOriginal(String varianceNameOriginal) {
		this.varianceNameOriginal = varianceNameOriginal;
	}

	private String varianceValue;

	public String getVarianceValue() {
		return varianceValue;
	}

	public void setVarianceValue(String varianceValue) {
		this.varianceValue = varianceValue;
	}

	private String skuId;

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}


class ServiceAgreement2 {

}


class FlowerDeliveryDate2 {

}


class MoneyBox2 {

	private boolean checkOnlineInventory;

	public boolean getCheckOnlineInventory() {
		return checkOnlineInventory;
	}

	public void setCheckOnlineInventory(boolean checkOnlineInventory) {
		this.checkOnlineInventory = checkOnlineInventory;
	}

	private boolean checkClubInventory;

	public boolean getCheckClubInventory() {
		return checkClubInventory;
	}

	public void setCheckClubInventory(boolean checkClubInventory) {
		this.checkClubInventory = checkClubInventory;
	}

	private boolean checkOnlinePricing;

	public boolean getCheckOnlinePricing() {
		return checkOnlinePricing;
	}

	public void setCheckOnlinePricing(boolean checkOnlinePricing) {
		this.checkOnlinePricing = checkOnlinePricing;
	}

	private boolean checkClubPricing;

	public boolean getCheckClubPricing() {
		return checkClubPricing;
	}

	public void setCheckClubPricing(boolean checkClubPricing) {
		this.checkClubPricing = checkClubPricing;
	}

	private boolean populateProductDetails;

	public boolean getPopulateProductDetails() {
		return populateProductDetails;
	}

	public void setPopulateProductDetails(boolean populateProductDetails) {
		this.populateProductDetails = populateProductDetails;
	}

}


class RelatedSkus2 {

}


class AvailableSKUs {

	private OnlineInventoryVO3 onlineInventoryVO3;

	public OnlineInventoryVO3 getOnlineInventoryVO3() {
		return onlineInventoryVO3;
	}

	public void setOnlineInventoryVO3(OnlineInventoryVO3 onlineInventoryVO3) {
		this.onlineInventoryVO3 = onlineInventoryVO3;
	}

	private ClubInventoryVO3 clubInventoryVO3;

	public ClubInventoryVO3 getClubInventoryVO3() {
		return clubInventoryVO3;
	}

	public void setClubInventoryVO3(ClubInventoryVO3 clubInventoryVO3) {
		this.clubInventoryVO3 = clubInventoryVO3;
	}

	private OnlinePriceVO3 onlinePriceVO3;

	public OnlinePriceVO3 getOnlinePriceVO3() {
		return onlinePriceVO3;
	}

	public void setOnlinePriceVO3(OnlinePriceVO3 onlinePriceVO3) {
		this.onlinePriceVO3 = onlinePriceVO3;
	}

	private VarianceValueMap3 varianceValueMap3;

	public VarianceValueMap3 getVarianceValueMap3() {
		return varianceValueMap3;
	}

	public void setVarianceValueMap3(VarianceValueMap3 varianceValueMap3) {
		this.varianceValueMap3 = varianceValueMap3;
	}

	private Collection<ServiceAgreement3> serviceAgreement3;

	public Collection<ServiceAgreement3> getServiceAgreement3() {
		return serviceAgreement3;
	}

	public void setServiceAgreement3(Collection<ServiceAgreement3> serviceAgreement3) {
		this.serviceAgreement3 = serviceAgreement3;
	}

	private Collection<FlowerDeliveryDate3> flowerDeliveryDate3;

	public Collection<FlowerDeliveryDate3> getFlowerDeliveryDate3() {
		return flowerDeliveryDate3;
	}

	public void setFlowerDeliveryDate3(Collection<FlowerDeliveryDate3> flowerDeliveryDate3) {
		this.flowerDeliveryDate3 = flowerDeliveryDate3;
	}

	private MoneyBox3 moneyBox3;

	public MoneyBox3 getMoneyBox3() {
		return moneyBox3;
	}

	public void setMoneyBox3(MoneyBox3 moneyBox3) {
		this.moneyBox3 = moneyBox3;
	}

	private Collection<RelatedSkus3> relatedSkus3;

	public Collection<RelatedSkus3> getRelatedSkus3() {
		return relatedSkus3;
	}

	public void setRelatedSkus3(Collection<RelatedSkus3> relatedSkus3) {
		this.relatedSkus3 = relatedSkus3;
	}

	private String skuName;

	public String getSkuName() {
		return skuName;
	}

	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

	private String skuId;

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	private BigInteger itemNo;

	public BigInteger getItemNo() {
		return itemNo;
	}

	public void setItemNo(BigInteger itemNo) {
		this.itemNo = itemNo;
	}

	private BigInteger onlineLegacyItemId;

	public BigInteger getOnlineLegacyItemId() {
		return onlineLegacyItemId;
	}

	public void setOnlineLegacyItemId(BigInteger onlineLegacyItemId) {
		this.onlineLegacyItemId = onlineLegacyItemId;
	}

	private BigInteger clubLegacyItemId;

	public BigInteger getClubLegacyItemId() {
		return clubLegacyItemId;
	}

	public void setClubLegacyItemId(BigInteger clubLegacyItemId) {
		this.clubLegacyItemId = clubLegacyItemId;
	}

	private boolean viewOnly;

	public boolean getViewOnly() {
		return viewOnly;
	}

	public void setViewOnly(boolean viewOnly) {
		this.viewOnly = viewOnly;
	}

	private BigInteger modelNo;

	public BigInteger getModelNo() {
		return modelNo;
	}

	public void setModelNo(BigInteger modelNo) {
		this.modelNo = modelNo;
	}

	private String imageName;

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	private boolean subscribeEnabled;

	public boolean getSubscribeEnabled() {
		return subscribeEnabled;
	}

	public void setSubscribeEnabled(boolean subscribeEnabled) {
		this.subscribeEnabled = subscribeEnabled;
	}

	private boolean subscribed;

	public boolean getSubscribed() {
		return subscribed;
	}

	public void setSubscribed(boolean subscribed) {
		this.subscribed = subscribed;
	}

	private BigDecimal mapPrice;

	public BigDecimal getMapPrice() {
		return mapPrice;
	}

	public void setMapPrice(BigDecimal mapPrice) {
		this.mapPrice = mapPrice;
	}

	private boolean strikeOffPrice;

	public boolean getStrikeOffPrice() {
		return strikeOffPrice;
	}

	public void setStrikeOffPrice(boolean strikeOffPrice) {
		this.strikeOffPrice = strikeOffPrice;
	}

	private BigInteger imageId;

	public BigInteger getImageId() {
		return imageId;
	}

	public void setImageId(BigInteger imageId) {
		this.imageId = imageId;
	}

	private boolean tobacco;

	public boolean getTobacco() {
		return tobacco;
	}

	public void setTobacco(boolean tobacco) {
		this.tobacco = tobacco;
	}

	private boolean chewingTobacco;

	public boolean getChewingTobacco() {
		return chewingTobacco;
	}

	public void setChewingTobacco(boolean chewingTobacco) {
		this.chewingTobacco = chewingTobacco;
	}

	private boolean showTobacco;

	public boolean getShowTobacco() {
		return showTobacco;
	}

	public void setShowTobacco(boolean showTobacco) {
		this.showTobacco = showTobacco;
	}

	private String shippingMethodType;

	public String getShippingMethodType() {
		return shippingMethodType;
	}

	public void setShippingMethodType(String shippingMethodType) {
		this.shippingMethodType = shippingMethodType;
	}

	private boolean auctionSku;

	public boolean getAuctionSku() {
		return auctionSku;
	}

	public void setAuctionSku(boolean auctionSku) {
		this.auctionSku = auctionSku;
	}

	private BigInteger upc;

	public BigInteger getUpc() {
		return upc;
	}

	public void setUpc(BigInteger upc) {
		this.upc = upc;
	}

	private boolean freeShippingFlag;

	public boolean getFreeShippingFlag() {
		return freeShippingFlag;
	}

	public void setFreeShippingFlag(boolean freeShippingFlag) {
		this.freeShippingFlag = freeShippingFlag;
	}

	private boolean serviceAgreementProductFlag;

	public boolean getServiceAgreementProductFlag() {
		return serviceAgreementProductFlag;
	}

	public void setServiceAgreementProductFlag(boolean serviceAgreementProductFlag) {
		this.serviceAgreementProductFlag = serviceAgreementProductFlag;
	}

	private boolean instockNotification;

	public boolean getInstockNotification() {
		return instockNotification;
	}

	public void setInstockNotification(boolean instockNotification) {
		this.instockNotification = instockNotification;
	}

	private boolean electronicDeliveryFlag;

	public boolean getElectronicDeliveryFlag() {
		return electronicDeliveryFlag;
	}

	public void setElectronicDeliveryFlag(boolean electronicDeliveryFlag) {
		this.electronicDeliveryFlag = electronicDeliveryFlag;
	}

	private String scene7Imageurl;

	public String getScene7Imageurl() {
		return scene7Imageurl;
	}

	public void setScene7Imageurl(String scene7Imageurl) {
		this.scene7Imageurl = scene7Imageurl;
	}

	private BigInteger productReviewCounts;

	public BigInteger getProductReviewCounts() {
		return productReviewCounts;
	}

	public void setProductReviewCounts(BigInteger productReviewCounts) {
		this.productReviewCounts = productReviewCounts;
	}

	private BigDecimal productAvgRating;

	public BigDecimal getProductAvgRating() {
		return productAvgRating;
	}

	public void setProductAvgRating(BigDecimal productAvgRating) {
		this.productAvgRating = productAvgRating;
	}

	private String productType;

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	private boolean serviceAgreementFlag;

	public boolean getServiceAgreementFlag() {
		return serviceAgreementFlag;
	}

	public void setServiceAgreementFlag(boolean serviceAgreementFlag) {
		this.serviceAgreementFlag = serviceAgreementFlag;
	}

	private boolean isAvaiableSeperately;

	public boolean getIsAvaiableSeperately() {
		return isAvaiableSeperately;
	}

	public void setIsAvaiableSeperately(boolean isAvaiableSeperately) {
		this.isAvaiableSeperately = isAvaiableSeperately;
	}

	private boolean evalueAvailableFlag;

	public boolean getEvalueAvailableFlag() {
		return evalueAvailableFlag;
	}

	public void setEvalueAvailableFlag(boolean evalueAvailableFlag) {
		this.evalueAvailableFlag = evalueAvailableFlag;
	}

	private BigInteger shipDays;

	public BigInteger getShipDays() {
		return shipDays;
	}

	public void setShipDays(BigInteger shipDays) {
		this.shipDays = shipDays;
	}

	private String productId;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	private String scene7serverUrl;

	public String getScene7serverUrl() {
		return scene7serverUrl;
	}

	public void setScene7serverUrl(String scene7serverUrl) {
		this.scene7serverUrl = scene7serverUrl;
	}

	private String scene7serverUrlWithProtocol;

	public String getScene7serverUrlWithProtocol() {
		return scene7serverUrlWithProtocol;
	}

	public void setScene7serverUrlWithProtocol(String scene7serverUrlWithProtocol) {
		this.scene7serverUrlWithProtocol = scene7serverUrlWithProtocol;
	}

	private String scene7ColorAppender;

	public String getScene7ColorAppender() {
		return scene7ColorAppender;
	}

	public void setScene7ColorAppender(String scene7ColorAppender) {
		this.scene7ColorAppender = scene7ColorAppender;
	}

	private String scene7ClientName;

	public String getScene7ClientName() {
		return scene7ClientName;
	}

	public void setScene7ClientName(String scene7ClientName) {
		this.scene7ClientName = scene7ClientName;
	}

	private boolean clubSelected;

	public boolean getClubSelected() {
		return clubSelected;
	}

	public void setClubSelected(boolean clubSelected) {
		this.clubSelected = clubSelected;
	}

	private boolean promotionSKu;

	public boolean getPromotionSKu() {
		return promotionSKu;
	}

	public void setPromotionSKu(boolean promotionSKu) {
		this.promotionSKu = promotionSKu;
	}

	private boolean flowersTemplateProduct;

	public boolean getFlowersTemplateProduct() {
		return flowersTemplateProduct;
	}

	public void setFlowersTemplateProduct(boolean flowersTemplateProduct) {
		this.flowersTemplateProduct = flowersTemplateProduct;
	}

	private boolean populateSkuDetails;

	public boolean getPopulateSkuDetails() {
		return populateSkuDetails;
	}

	public void setPopulateSkuDetails(boolean populateSkuDetails) {
		this.populateSkuDetails = populateSkuDetails;
	}

	private boolean isServiceAgreementEligible;

	public boolean getIsServiceAgreementEligible() {
		return isServiceAgreementEligible;
	}

	public void setIsServiceAgreementEligible(boolean isServiceAgreementEligible) {
		this.isServiceAgreementEligible = isServiceAgreementEligible;
	}

	private boolean cnpSpecialOrder;

	public boolean getCnpSpecialOrder() {
		return cnpSpecialOrder;
	}

	public void setCnpSpecialOrder(boolean cnpSpecialOrder) {
		this.cnpSpecialOrder = cnpSpecialOrder;
	}

	private BigInteger merchandiseCategory;

	public BigInteger getMerchandiseCategory() {
		return merchandiseCategory;
	}

	public void setMerchandiseCategory(BigInteger merchandiseCategory) {
		this.merchandiseCategory = merchandiseCategory;
	}

	private BigInteger merchandiseSubCategory;

	public BigInteger getMerchandiseSubCategory() {
		return merchandiseSubCategory;
	}

	public void setMerchandiseSubCategory(BigInteger merchandiseSubCategory) {
		this.merchandiseSubCategory = merchandiseSubCategory;
	}

	private String skuType;

	public String getSkuType() {
		return skuType;
	}

	public void setSkuType(String skuType) {
		this.skuType = skuType;
	}

	private BigInteger onlineThreshholdValue;

	public BigInteger getOnlineThreshholdValue() {
		return onlineThreshholdValue;
	}

	public void setOnlineThreshholdValue(BigInteger onlineThreshholdValue) {
		this.onlineThreshholdValue = onlineThreshholdValue;
	}

}


class OnlineInventoryVO3 {

	private String onlineClub;

	public String getOnlineClub() {
		return onlineClub;
	}

	public void setOnlineClub(String onlineClub) {
		this.onlineClub = onlineClub;
	}

	private BigInteger qtySold;

	public BigInteger getQtySold() {
		return qtySold;
	}

	public void setQtySold(BigInteger qtySold) {
		this.qtySold = qtySold;
	}

	private BigInteger qtyLeft;

	public BigInteger getQtyLeft() {
		return qtyLeft;
	}

	public void setQtyLeft(BigInteger qtyLeft) {
		this.qtyLeft = qtyLeft;
	}

	private BigInteger mAvailableToSellQuantity;

	public BigInteger getMAvailableToSellQuantity() {
		return mAvailableToSellQuantity;
	}

	public void setMAvailableToSellQuantity(BigInteger mAvailableToSellQuantity) {
		this.mAvailableToSellQuantity = mAvailableToSellQuantity;
	}

	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	private BigInteger minQuantity;

	public BigInteger getMinQuantity() {
		return minQuantity;
	}

	public void setMinQuantity(BigInteger minQuantity) {
		this.minQuantity = minQuantity;
	}

	private BigInteger maxQuantity;

	public BigInteger getMaxQuantity() {
		return maxQuantity;
	}

	public void setMaxQuantity(BigInteger maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

	private BigInteger legacyItemNo;

	public BigInteger getLegacyItemNo() {
		return legacyItemNo;
	}

	public void setLegacyItemNo(BigInteger legacyItemNo) {
		this.legacyItemNo = legacyItemNo;
	}

	private BigInteger clubNo;

	public BigInteger getClubNo() {
		return clubNo;
	}

	public void setClubNo(BigInteger clubNo) {
		this.clubNo = clubNo;
	}

	private boolean viewOnly;

	public boolean getViewOnly() {
		return viewOnly;
	}

	public void setViewOnly(boolean viewOnly) {
		this.viewOnly = viewOnly;
	}

}


class ClubInventoryVO3 {

	private BigInteger qtySold;

	public BigInteger getQtySold() {
		return qtySold;
	}

	public void setQtySold(BigInteger qtySold) {
		this.qtySold = qtySold;
	}

	private BigInteger qtyLeft;

	public BigInteger getQtyLeft() {
		return qtyLeft;
	}

	public void setQtyLeft(BigInteger qtyLeft) {
		this.qtyLeft = qtyLeft;
	}

	private BigInteger mAvailableToSellQuantity;

	public BigInteger getMAvailableToSellQuantity() {
		return mAvailableToSellQuantity;
	}

	public void setMAvailableToSellQuantity(BigInteger mAvailableToSellQuantity) {
		this.mAvailableToSellQuantity = mAvailableToSellQuantity;
	}

	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	private BigInteger minQuantity;

	public BigInteger getMinQuantity() {
		return minQuantity;
	}

	public void setMinQuantity(BigInteger minQuantity) {
		this.minQuantity = minQuantity;
	}

	private BigInteger maxQuantity;

	public BigInteger getMaxQuantity() {
		return maxQuantity;
	}

	public void setMaxQuantity(BigInteger maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

	private boolean viewOnly;

	public boolean getViewOnly() {
		return viewOnly;
	}

	public void setViewOnly(boolean viewOnly) {
		this.viewOnly = viewOnly;
	}

}


class OnlinePriceVO3 {

	private SavingDetailsVO2 savingDetailsVO2;

	public SavingDetailsVO2 getSavingDetailsVO2() {
		return savingDetailsVO2;
	}

	public void setSavingDetailsVO2(SavingDetailsVO2 savingDetailsVO2) {
		this.savingDetailsVO2 = savingDetailsVO2;
	}

	private boolean tobacco;

	public boolean getTobacco() {
		return tobacco;
	}

	public void setTobacco(boolean tobacco) {
		this.tobacco = tobacco;
	}

	private boolean chewingTobacco;

	public boolean getChewingTobacco() {
		return chewingTobacco;
	}

	public void setChewingTobacco(boolean chewingTobacco) {
		this.chewingTobacco = chewingTobacco;
	}

	private boolean showTobacco;

	public boolean getShowTobacco() {
		return showTobacco;
	}

	public void setShowTobacco(boolean showTobacco) {
		this.showTobacco = showTobacco;
	}

	private boolean mapPriceItem;

	public boolean getMapPriceItem() {
		return mapPriceItem;
	}

	public void setMapPriceItem(boolean mapPriceItem) {
		this.mapPriceItem = mapPriceItem;
	}

	private BigDecimal mapPrice;

	public BigDecimal getMapPrice() {
		return mapPrice;
	}

	public void setMapPrice(BigDecimal mapPrice) {
		this.mapPrice = mapPrice;
	}

	private boolean strikeOffPrice;

	public boolean getStrikeOffPrice() {
		return strikeOffPrice;
	}

	public void setStrikeOffPrice(boolean strikeOffPrice) {
		this.strikeOffPrice = strikeOffPrice;
	}

	private boolean onlineClubPricing;

	public boolean getOnlineClubPricing() {
		return onlineClubPricing;
	}

	public void setOnlineClubPricing(boolean onlineClubPricing) {
		this.onlineClubPricing = onlineClubPricing;
	}

	private boolean invalidPrice;

	public boolean getInvalidPrice() {
		return invalidPrice;
	}

	public void setInvalidPrice(boolean invalidPrice) {
		this.invalidPrice = invalidPrice;
	}

	private BigInteger itemNumber;

	public BigInteger getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(BigInteger itemNumber) {
		this.itemNumber = itemNumber;
	}

	private boolean unitPriceItem;

	public boolean getUnitPriceItem() {
		return unitPriceItem;
	}

	public void setUnitPriceItem(boolean unitPriceItem) {
		this.unitPriceItem = unitPriceItem;
	}

	private boolean variantMapOption;

	public boolean getVariantMapOption() {
		return variantMapOption;
	}

	public void setVariantMapOption(boolean variantMapOption) {
		this.variantMapOption = variantMapOption;
	}

	private BigDecimal listPrice;

	public BigDecimal getListPrice() {
		return listPrice;
	}

	public void setListPrice(BigDecimal listPrice) {
		this.listPrice = listPrice;
	}

	private BigDecimal finalPrice;

	public BigDecimal getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(BigDecimal finalPrice) {
		this.finalPrice = finalPrice;
	}

	private BigDecimal unitPrice;

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	private BigDecimal defaultPrice;

	public BigDecimal getDefaultPrice() {
		return defaultPrice;
	}

	public void setDefaultPrice(BigDecimal defaultPrice) {
		this.defaultPrice = defaultPrice;
	}

	private boolean isTaxExempted;

	public boolean getIsTaxExempted() {
		return isTaxExempted;
	}

	public void setIsTaxExempted(boolean isTaxExempted) {
		this.isTaxExempted = isTaxExempted;
	}

	private BigDecimal packMaxSize;

	public BigDecimal getPackMaxSize() {
		return packMaxSize;
	}

	public void setPackMaxSize(BigDecimal packMaxSize) {
		this.packMaxSize = packMaxSize;
	}

	private BigDecimal packMinSize;

	public BigDecimal getPackMinSize() {
		return packMinSize;
	}

	public void setPackMinSize(BigDecimal packMinSize) {
		this.packMinSize = packMinSize;
	}

	private BigDecimal ulpw;

	public BigDecimal getUlpw() {
		return ulpw;
	}

	public void setUlpw(BigDecimal ulpw) {
		this.ulpw = ulpw;
	}

	private boolean forcedLogin;

	public boolean getForcedLogin() {
		return forcedLogin;
	}

	public void setForcedLogin(boolean forcedLogin) {
		this.forcedLogin = forcedLogin;
	}

	private BigInteger mapOption;

	public BigInteger getMapOption() {
		return mapOption;
	}

	public void setMapOption(BigInteger mapOption) {
		this.mapOption = mapOption;
	}

	private BigInteger defaultMapOption;

	public BigInteger getDefaultMapOption() {
		return defaultMapOption;
	}

	public void setDefaultMapOption(BigInteger defaultMapOption) {
		this.defaultMapOption = defaultMapOption;
	}

	private boolean wirelessProduct;

	public boolean getWirelessProduct() {
		return wirelessProduct;
	}

	public void setWirelessProduct(boolean wirelessProduct) {
		this.wirelessProduct = wirelessProduct;
	}

	private boolean weightedItem;

	public boolean getWeightedItem() {
		return weightedItem;
	}

	public void setWeightedItem(boolean weightedItem) {
		this.weightedItem = weightedItem;
	}

	private BigDecimal msrpPrice;

	public BigDecimal getMsrpPrice() {
		return msrpPrice;
	}

	public void setMsrpPrice(BigDecimal msrpPrice) {
		this.msrpPrice = msrpPrice;
	}

	private boolean msrp;

	public boolean getMsrp() {
		return msrp;
	}

	public void setMsrp(boolean msrp) {
		this.msrp = msrp;
	}

	private BigDecimal minVariancePrice;

	public BigDecimal getMinVariancePrice() {
		return minVariancePrice;
	}

	public void setMinVariancePrice(BigDecimal minVariancePrice) {
		this.minVariancePrice = minVariancePrice;
	}

	private BigDecimal maxVariancePrice;

	public BigDecimal getMaxVariancePrice() {
		return maxVariancePrice;
	}

	public void setMaxVariancePrice(BigDecimal maxVariancePrice) {
		this.maxVariancePrice = maxVariancePrice;
	}

	private boolean varianceRangePrice;

	public boolean getVarianceRangePrice() {
		return varianceRangePrice;
	}

	public void setVarianceRangePrice(boolean varianceRangePrice) {
		this.varianceRangePrice = varianceRangePrice;
	}

	private boolean varianceMapPriceRange;

	public boolean getVarianceMapPriceRange() {
		return varianceMapPriceRange;
	}

	public void setVarianceMapPriceRange(boolean varianceMapPriceRange) {
		this.varianceMapPriceRange = varianceMapPriceRange;
	}

	private BigDecimal minVarianceMapPrice;

	public BigDecimal getMinVarianceMapPrice() {
		return minVarianceMapPrice;
	}

	public void setMinVarianceMapPrice(BigDecimal minVarianceMapPrice) {
		this.minVarianceMapPrice = minVarianceMapPrice;
	}

	private BigDecimal maxVarianceMapPrice;

	public BigDecimal getMaxVarianceMapPrice() {
		return maxVarianceMapPrice;
	}

	public void setMaxVarianceMapPrice(BigDecimal maxVarianceMapPrice) {
		this.maxVarianceMapPrice = maxVarianceMapPrice;
	}

	private boolean multipleSavingsProduct;

	public boolean getMultipleSavingsProduct() {
		return multipleSavingsProduct;
	}

	public void setMultipleSavingsProduct(boolean multipleSavingsProduct) {
		this.multipleSavingsProduct = multipleSavingsProduct;
	}

	private String unitOfMeassureSingular;

	public String getUnitOfMeassureSingular() {
		return unitOfMeassureSingular;
	}

	public void setUnitOfMeassureSingular(String unitOfMeassureSingular) {
		this.unitOfMeassureSingular = unitOfMeassureSingular;
	}

	private String unitOfMeassurePlural;

	public String getUnitOfMeassurePlural() {
		return unitOfMeassurePlural;
	}

	public void setUnitOfMeassurePlural(String unitOfMeassurePlural) {
		this.unitOfMeassurePlural = unitOfMeassurePlural;
	}

	private BigDecimal comparativePrice;

	public BigDecimal getComparativePrice() {
		return comparativePrice;
	}

	public void setComparativePrice(BigDecimal comparativePrice) {
		this.comparativePrice = comparativePrice;
	}

	private BigDecimal originalListPrice;

	public BigDecimal getOriginalListPrice() {
		return originalListPrice;
	}

	public void setOriginalListPrice(BigDecimal originalListPrice) {
		this.originalListPrice = originalListPrice;
	}

	private String priceStatus;

	public String getPriceStatus() {
		return priceStatus;
	}

	public void setPriceStatus(String priceStatus) {
		this.priceStatus = priceStatus;
	}

	private boolean specialOrderPricing;

	public boolean getSpecialOrderPricing() {
		return specialOrderPricing;
	}

	public void setSpecialOrderPricing(boolean specialOrderPricing) {
		this.specialOrderPricing = specialOrderPricing;
	}

	private boolean fromPrice;

	public boolean getFromPrice() {
		return fromPrice;
	}

	public void setFromPrice(boolean fromPrice) {
		this.fromPrice = fromPrice;
	}

}


class SavingDetailsVO2 {

	private String savingType;

	public String getSavingType() {
		return savingType;
	}

	public void setSavingType(String savingType) {
		this.savingType = savingType;
	}

	private String discountType;

	public String getDiscountType() {
		return discountType;
	}

	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	private String savingMessageShort;

	public String getSavingMessageShort() {
		return savingMessageShort;
	}

	public void setSavingMessageShort(String savingMessageShort) {
		this.savingMessageShort = savingMessageShort;
	}

	private String savingMessageLong;

	public String getSavingMessageLong() {
		return savingMessageLong;
	}

	public void setSavingMessageLong(String savingMessageLong) {
		this.savingMessageLong = savingMessageLong;
	}

	private String specialMessage;

	public String getSpecialMessage() {
		return specialMessage;
	}

	public void setSpecialMessage(String specialMessage) {
		this.specialMessage = specialMessage;
	}

	private String popupMessage;

	public String getPopupMessage() {
		return popupMessage;
	}

	public void setPopupMessage(String popupMessage) {
		this.popupMessage = popupMessage;
	}

	private BigDecimal amountSaved;

	public BigDecimal getAmountSaved() {
		return amountSaved;
	}

	public void setAmountSaved(BigDecimal amountSaved) {
		this.amountSaved = amountSaved;
	}

	private BigDecimal percentSaved;

	public BigDecimal getPercentSaved() {
		return percentSaved;
	}

	public void setPercentSaved(BigDecimal percentSaved) {
		this.percentSaved = percentSaved;
	}

	private BigDecimal discountedPrice;

	public BigDecimal getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(BigDecimal discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	private BigInteger limitPerMember;

	public BigInteger getLimitPerMember() {
		return limitPerMember;
	}

	public void setLimitPerMember(BigInteger limitPerMember) {
		this.limitPerMember = limitPerMember;
	}

	private BigInteger skuType;

	public BigInteger getSkuType() {
		return skuType;
	}

	public void setSkuType(BigInteger skuType) {
		this.skuType = skuType;
	}

	private boolean clubInsiderPackageCode;

	public boolean getClubInsiderPackageCode() {
		return clubInsiderPackageCode;
	}

	public void setClubInsiderPackageCode(boolean clubInsiderPackageCode) {
		this.clubInsiderPackageCode = clubInsiderPackageCode;
	}

	private BigInteger minQuantity;

	public BigInteger getMinQuantity() {
		return minQuantity;
	}

	public void setMinQuantity(BigInteger minQuantity) {
		this.minQuantity = minQuantity;
	}

}


class VarianceValueMap3 {

	private Color3 color3;

	public Color3 getColor3() {
		return color3;
	}

	public void setColor3(Color3 color3) {
		this.color3 = color3;
	}

}


class Color3 {

	private BigInteger upcId;

	public BigInteger getUpcId() {
		return upcId;
	}

	public void setUpcId(BigInteger upcId) {
		this.upcId = upcId;
	}

	private String varianceName;

	public String getVarianceName() {
		return varianceName;
	}

	public void setVarianceName(String varianceName) {
		this.varianceName = varianceName;
	}

	private String varianceNameOriginal;

	public String getVarianceNameOriginal() {
		return varianceNameOriginal;
	}

	public void setVarianceNameOriginal(String varianceNameOriginal) {
		this.varianceNameOriginal = varianceNameOriginal;
	}

	private String varianceValue;

	public String getVarianceValue() {
		return varianceValue;
	}

	public void setVarianceValue(String varianceValue) {
		this.varianceValue = varianceValue;
	}

	private String skuId;

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}


class ServiceAgreement3 {

}


class FlowerDeliveryDate3 {

}


class MoneyBox3 {

	private boolean checkOnlineInventory;

	public boolean getCheckOnlineInventory() {
		return checkOnlineInventory;
	}

	public void setCheckOnlineInventory(boolean checkOnlineInventory) {
		this.checkOnlineInventory = checkOnlineInventory;
	}

	private boolean checkClubInventory;

	public boolean getCheckClubInventory() {
		return checkClubInventory;
	}

	public void setCheckClubInventory(boolean checkClubInventory) {
		this.checkClubInventory = checkClubInventory;
	}

	private boolean checkOnlinePricing;

	public boolean getCheckOnlinePricing() {
		return checkOnlinePricing;
	}

	public void setCheckOnlinePricing(boolean checkOnlinePricing) {
		this.checkOnlinePricing = checkOnlinePricing;
	}

	private boolean checkClubPricing;

	public boolean getCheckClubPricing() {
		return checkClubPricing;
	}

	public void setCheckClubPricing(boolean checkClubPricing) {
		this.checkClubPricing = checkClubPricing;
	}

	private boolean populateProductDetails;

	public boolean getPopulateProductDetails() {
		return populateProductDetails;
	}

	public void setPopulateProductDetails(boolean populateProductDetails) {
		this.populateProductDetails = populateProductDetails;
	}

}


class RelatedSkus3 {

}


class AvailableVariances {

	private Color4 color4;

	public Color4 getColor4() {
		return color4;
	}

	public void setColor4(Color4 color4) {
		this.color4 = color4;
	}

}


class Color4 {

	private VarianceValuesMap varianceValuesMap;

	public VarianceValuesMap getVarianceValuesMap() {
		return varianceValuesMap;
	}

	public void setVarianceValuesMap(VarianceValuesMap varianceValuesMap) {
		this.varianceValuesMap = varianceValuesMap;
	}

	private String varianceName;

	public String getVarianceName() {
		return varianceName;
	}

	public void setVarianceName(String varianceName) {
		this.varianceName = varianceName;
	}

	private String varianceType;

	public String getVarianceType() {
		return varianceType;
	}

	public void setVarianceType(String varianceType) {
		this.varianceType = varianceType;
	}

	private boolean swatchBoxDisplay;

	public boolean getSwatchBoxDisplay() {
		return swatchBoxDisplay;
	}

	public void setSwatchBoxDisplay(boolean swatchBoxDisplay) {
		this.swatchBoxDisplay = swatchBoxDisplay;
	}

}


class VarianceValuesMap {

	private Black black;

	public Black getBlack() {
		return black;
	}

	public void setBlack(Black black) {
		this.black = black;
	}

	private Gray gray;

	public Gray getGray() {
		return gray;
	}

	public void setGray(Gray gray) {
		this.gray = gray;
	}

	private Blue blue;

	public Blue getBlue() {
		return blue;
	}

	public void setBlue(Blue blue) {
		this.blue = blue;
	}

	private Red red;

	public Red getRed() {
		return red;
	}

	public void setRed(Red red) {
		this.red = red;
	}

}


class Black {

	private Collection<ApplicableSkus> applicableSkus;

	public Collection<ApplicableSkus> getApplicableSkus() {
		return applicableSkus;
	}

	public void setApplicableSkus(Collection<ApplicableSkus> applicableSkus) {
		this.applicableSkus = applicableSkus;
	}

	private boolean availabilitySkuPresent;

	public boolean getAvailabilitySkuPresent() {
		return availabilitySkuPresent;
	}

	public void setAvailabilitySkuPresent(boolean availabilitySkuPresent) {
		this.availabilitySkuPresent = availabilitySkuPresent;
	}

	private String defaultS7Url;

	public String getDefaultS7Url() {
		return defaultS7Url;
	}

	public void setDefaultS7Url(String defaultS7Url) {
		this.defaultS7Url = defaultS7Url;
	}

	private BigInteger defaultUpcId;

	public BigInteger getDefaultUpcId() {
		return defaultUpcId;
	}

	public void setDefaultUpcId(BigInteger defaultUpcId) {
		this.defaultUpcId = defaultUpcId;
	}

	private String varianceValue;

	public String getVarianceValue() {
		return varianceValue;
	}

	public void setVarianceValue(String varianceValue) {
		this.varianceValue = varianceValue;
	}

	private BigInteger minQuantity;

	public BigInteger getMinQuantity() {
		return minQuantity;
	}

	public void setMinQuantity(BigInteger minQuantity) {
		this.minQuantity = minQuantity;
	}

	private BigInteger maxQuantity;

	public BigInteger getMaxQuantity() {
		return maxQuantity;
	}

	public void setMaxQuantity(BigInteger maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

}


class ApplicableSkus {

}


class Gray {

	private Collection<ApplicableSkus2> applicableSkus2;

	public Collection<ApplicableSkus2> getApplicableSkus2() {
		return applicableSkus2;
	}

	public void setApplicableSkus2(Collection<ApplicableSkus2> applicableSkus2) {
		this.applicableSkus2 = applicableSkus2;
	}

	private boolean availabilitySkuPresent;

	public boolean getAvailabilitySkuPresent() {
		return availabilitySkuPresent;
	}

	public void setAvailabilitySkuPresent(boolean availabilitySkuPresent) {
		this.availabilitySkuPresent = availabilitySkuPresent;
	}

	private String defaultS7Url;

	public String getDefaultS7Url() {
		return defaultS7Url;
	}

	public void setDefaultS7Url(String defaultS7Url) {
		this.defaultS7Url = defaultS7Url;
	}

	private BigInteger defaultUpcId;

	public BigInteger getDefaultUpcId() {
		return defaultUpcId;
	}

	public void setDefaultUpcId(BigInteger defaultUpcId) {
		this.defaultUpcId = defaultUpcId;
	}

	private String varianceValue;

	public String getVarianceValue() {
		return varianceValue;
	}

	public void setVarianceValue(String varianceValue) {
		this.varianceValue = varianceValue;
	}

	private BigInteger minQuantity;

	public BigInteger getMinQuantity() {
		return minQuantity;
	}

	public void setMinQuantity(BigInteger minQuantity) {
		this.minQuantity = minQuantity;
	}

	private BigInteger maxQuantity;

	public BigInteger getMaxQuantity() {
		return maxQuantity;
	}

	public void setMaxQuantity(BigInteger maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

}


class ApplicableSkus2 {

}


class Blue {

	private Collection<ApplicableSkus3> applicableSkus3;

	public Collection<ApplicableSkus3> getApplicableSkus3() {
		return applicableSkus3;
	}

	public void setApplicableSkus3(Collection<ApplicableSkus3> applicableSkus3) {
		this.applicableSkus3 = applicableSkus3;
	}

	private boolean availabilitySkuPresent;

	public boolean getAvailabilitySkuPresent() {
		return availabilitySkuPresent;
	}

	public void setAvailabilitySkuPresent(boolean availabilitySkuPresent) {
		this.availabilitySkuPresent = availabilitySkuPresent;
	}

	private String defaultS7Url;

	public String getDefaultS7Url() {
		return defaultS7Url;
	}

	public void setDefaultS7Url(String defaultS7Url) {
		this.defaultS7Url = defaultS7Url;
	}

	private BigInteger defaultUpcId;

	public BigInteger getDefaultUpcId() {
		return defaultUpcId;
	}

	public void setDefaultUpcId(BigInteger defaultUpcId) {
		this.defaultUpcId = defaultUpcId;
	}

	private String varianceValue;

	public String getVarianceValue() {
		return varianceValue;
	}

	public void setVarianceValue(String varianceValue) {
		this.varianceValue = varianceValue;
	}

	private BigInteger minQuantity;

	public BigInteger getMinQuantity() {
		return minQuantity;
	}

	public void setMinQuantity(BigInteger minQuantity) {
		this.minQuantity = minQuantity;
	}

	private BigInteger maxQuantity;

	public BigInteger getMaxQuantity() {
		return maxQuantity;
	}

	public void setMaxQuantity(BigInteger maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

}


class ApplicableSkus3 {

}


class Red {

	private Collection<ApplicableSkus4> applicableSkus4;

	public Collection<ApplicableSkus4> getApplicableSkus4() {
		return applicableSkus4;
	}

	public void setApplicableSkus4(Collection<ApplicableSkus4> applicableSkus4) {
		this.applicableSkus4 = applicableSkus4;
	}

	private boolean availabilitySkuPresent;

	public boolean getAvailabilitySkuPresent() {
		return availabilitySkuPresent;
	}

	public void setAvailabilitySkuPresent(boolean availabilitySkuPresent) {
		this.availabilitySkuPresent = availabilitySkuPresent;
	}

	private String defaultS7Url;

	public String getDefaultS7Url() {
		return defaultS7Url;
	}

	public void setDefaultS7Url(String defaultS7Url) {
		this.defaultS7Url = defaultS7Url;
	}

	private BigInteger defaultUpcId;

	public BigInteger getDefaultUpcId() {
		return defaultUpcId;
	}

	public void setDefaultUpcId(BigInteger defaultUpcId) {
		this.defaultUpcId = defaultUpcId;
	}

	private String varianceValue;

	public String getVarianceValue() {
		return varianceValue;
	}

	public void setVarianceValue(String varianceValue) {
		this.varianceValue = varianceValue;
	}

	private BigInteger minQuantity;

	public BigInteger getMinQuantity() {
		return minQuantity;
	}

	public void setMinQuantity(BigInteger minQuantity) {
		this.minQuantity = minQuantity;
	}

	private BigInteger maxQuantity;

	public BigInteger getMaxQuantity() {
		return maxQuantity;
	}

	public void setMaxQuantity(BigInteger maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

}


class ApplicableSkus4 {

}


class ColdGold {

	private Collection<ApplicableSkus5> applicableSkus5;

	public Collection<ApplicableSkus5> getApplicableSkus5() {
		return applicableSkus5;
	}

	public void setApplicableSkus5(Collection<ApplicableSkus5> applicableSkus5) {
		this.applicableSkus5 = applicableSkus5;
	}

	private boolean availabilitySkuPresent;

	public boolean getAvailabilitySkuPresent() {
		return availabilitySkuPresent;
	}

	public void setAvailabilitySkuPresent(boolean availabilitySkuPresent) {
		this.availabilitySkuPresent = availabilitySkuPresent;
	}

	private String defaultS7Url;

	public String getDefaultS7Url() {
		return defaultS7Url;
	}

	public void setDefaultS7Url(String defaultS7Url) {
		this.defaultS7Url = defaultS7Url;
	}

	private BigInteger defaultUpcId;

	public BigInteger getDefaultUpcId() {
		return defaultUpcId;
	}

	public void setDefaultUpcId(BigInteger defaultUpcId) {
		this.defaultUpcId = defaultUpcId;
	}

	private String varianceValue;

	public String getVarianceValue() {
		return varianceValue;
	}

	public void setVarianceValue(String varianceValue) {
		this.varianceValue = varianceValue;
	}

	private BigInteger minQuantity;

	public BigInteger getMinQuantity() {
		return minQuantity;
	}

	public void setMinQuantity(BigInteger minQuantity) {
		this.minQuantity = minQuantity;
	}

	private BigInteger maxQuantity;

	public BigInteger getMaxQuantity() {
		return maxQuantity;
	}

	public void setMaxQuantity(BigInteger maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

}


class ApplicableSkus5 {

}


class AquaPin {

	private Collection<ApplicableSkus6> applicableSkus6;

	public Collection<ApplicableSkus6> getApplicableSkus6() {
		return applicableSkus6;
	}

	public void setApplicableSkus6(Collection<ApplicableSkus6> applicableSkus6) {
		this.applicableSkus6 = applicableSkus6;
	}

	private boolean availabilitySkuPresent;

	public boolean getAvailabilitySkuPresent() {
		return availabilitySkuPresent;
	}

	public void setAvailabilitySkuPresent(boolean availabilitySkuPresent) {
		this.availabilitySkuPresent = availabilitySkuPresent;
	}

	private String defaultS7Url;

	public String getDefaultS7Url() {
		return defaultS7Url;
	}

	public void setDefaultS7Url(String defaultS7Url) {
		this.defaultS7Url = defaultS7Url;
	}

	private BigInteger defaultUpcId;

	public BigInteger getDefaultUpcId() {
		return defaultUpcId;
	}

	public void setDefaultUpcId(BigInteger defaultUpcId) {
		this.defaultUpcId = defaultUpcId;
	}

	private String varianceValue;

	public String getVarianceValue() {
		return varianceValue;
	}

	public void setVarianceValue(String varianceValue) {
		this.varianceValue = varianceValue;
	}

	private BigInteger minQuantity;

	public BigInteger getMinQuantity() {
		return minQuantity;
	}

	public void setMinQuantity(BigInteger minQuantity) {
		this.minQuantity = minQuantity;
	}

	private BigInteger maxQuantity;

	public BigInteger getMaxQuantity() {
		return maxQuantity;
	}

	public void setMaxQuantity(BigInteger maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

}


class ApplicableSkus6 {

}


class RelaxedMauve {

	private Collection<ApplicableSkus7> applicableSkus7;

	public Collection<ApplicableSkus7> getApplicableSkus7() {
		return applicableSkus7;
	}

	public void setApplicableSkus7(Collection<ApplicableSkus7> applicableSkus7) {
		this.applicableSkus7 = applicableSkus7;
	}

	private boolean availabilitySkuPresent;

	public boolean getAvailabilitySkuPresent() {
		return availabilitySkuPresent;
	}

	public void setAvailabilitySkuPresent(boolean availabilitySkuPresent) {
		this.availabilitySkuPresent = availabilitySkuPresent;
	}

	private String defaultS7Url;

	public String getDefaultS7Url() {
		return defaultS7Url;
	}

	public void setDefaultS7Url(String defaultS7Url) {
		this.defaultS7Url = defaultS7Url;
	}

	private BigInteger defaultUpcId;

	public BigInteger getDefaultUpcId() {
		return defaultUpcId;
	}

	public void setDefaultUpcId(BigInteger defaultUpcId) {
		this.defaultUpcId = defaultUpcId;
	}

	private String varianceValue;

	public String getVarianceValue() {
		return varianceValue;
	}

	public void setVarianceValue(String varianceValue) {
		this.varianceValue = varianceValue;
	}

	private BigInteger minQuantity;

	public BigInteger getMinQuantity() {
		return minQuantity;
	}

	public void setMinQuantity(BigInteger minQuantity) {
		this.minQuantity = minQuantity;
	}

	private BigInteger maxQuantity;

	public BigInteger getMaxQuantity() {
		return maxQuantity;
	}

	public void setMaxQuantity(BigInteger maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

}


class ApplicableSkus7 {

}


class OutdoorPink {

	private Collection<ApplicableSkus8> applicableSkus8;

	public Collection<ApplicableSkus8> getApplicableSkus8() {
		return applicableSkus8;
	}

	public void setApplicableSkus8(Collection<ApplicableSkus8> applicableSkus8) {
		this.applicableSkus8 = applicableSkus8;
	}

	private boolean availabilitySkuPresent;

	public boolean getAvailabilitySkuPresent() {
		return availabilitySkuPresent;
	}

	public void setAvailabilitySkuPresent(boolean availabilitySkuPresent) {
		this.availabilitySkuPresent = availabilitySkuPresent;
	}

	private String defaultS7Url;

	public String getDefaultS7Url() {
		return defaultS7Url;
	}

	public void setDefaultS7Url(String defaultS7Url) {
		this.defaultS7Url = defaultS7Url;
	}

	private BigInteger defaultUpcId;

	public BigInteger getDefaultUpcId() {
		return defaultUpcId;
	}

	public void setDefaultUpcId(BigInteger defaultUpcId) {
		this.defaultUpcId = defaultUpcId;
	}

	private String varianceValue;

	public String getVarianceValue() {
		return varianceValue;
	}

	public void setVarianceValue(String varianceValue) {
		this.varianceValue = varianceValue;
	}

	private BigInteger minQuantity;

	public BigInteger getMinQuantity() {
		return minQuantity;
	}

	public void setMinQuantity(BigInteger minQuantity) {
		this.minQuantity = minQuantity;
	}

	private BigInteger maxQuantity;

	public BigInteger getMaxQuantity() {
		return maxQuantity;
	}

	public void setMaxQuantity(BigInteger maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

}


class ApplicableSkus8 {

}


class PurpleYoga {

	private Collection<ApplicableSkus9> applicableSkus9;

	public Collection<ApplicableSkus9> getApplicableSkus9() {
		return applicableSkus9;
	}

	public void setApplicableSkus9(Collection<ApplicableSkus9> applicableSkus9) {
		this.applicableSkus9 = applicableSkus9;
	}

	private boolean availabilitySkuPresent;

	public boolean getAvailabilitySkuPresent() {
		return availabilitySkuPresent;
	}

	public void setAvailabilitySkuPresent(boolean availabilitySkuPresent) {
		this.availabilitySkuPresent = availabilitySkuPresent;
	}

	private String defaultS7Url;

	public String getDefaultS7Url() {
		return defaultS7Url;
	}

	public void setDefaultS7Url(String defaultS7Url) {
		this.defaultS7Url = defaultS7Url;
	}

	private BigInteger defaultUpcId;

	public BigInteger getDefaultUpcId() {
		return defaultUpcId;
	}

	public void setDefaultUpcId(BigInteger defaultUpcId) {
		this.defaultUpcId = defaultUpcId;
	}

	private String varianceValue;

	public String getVarianceValue() {
		return varianceValue;
	}

	public void setVarianceValue(String varianceValue) {
		this.varianceValue = varianceValue;
	}

	private BigInteger minQuantity;

	public BigInteger getMinQuantity() {
		return minQuantity;
	}

	public void setMinQuantity(BigInteger minQuantity) {
		this.minQuantity = minQuantity;
	}

	private BigInteger maxQuantity;

	public BigInteger getMaxQuantity() {
		return maxQuantity;
	}

	public void setMaxQuantity(BigInteger maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

}


class ApplicableSkus9 {

}


class ParentCategoryVO {

	private BigInteger categoryId;

	public BigInteger getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(BigInteger categoryId) {
		this.categoryId = categoryId;
	}

	private String categoryName;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}


class ProductSpecifications {

	private String specificationHeading;

	public String getSpecificationHeading() {
		return specificationHeading;
	}

	public void setSpecificationHeading(String specificationHeading) {
		this.specificationHeading = specificationHeading;
	}

	private String specificationText;

	public String getSpecificationText() {
		return specificationText;
	}

	public void setSpecificationText(String specificationText) {
		this.specificationText = specificationText;
	}

}


class ProductDisclaimers {

	private Collection<DisclaimerContent> disclaimerContent;

	public Collection<DisclaimerContent> getDisclaimerContent() {
		return disclaimerContent;
	}

	public void setDisclaimerContent(Collection<DisclaimerContent> disclaimerContent) {
		this.disclaimerContent = disclaimerContent;
	}

	private String disclaimerName;

	public String getDisclaimerName() {
		return disclaimerName;
	}

	public void setDisclaimerName(String disclaimerName) {
		this.disclaimerName = disclaimerName;
	}

}


class DisclaimerContent {

}


class MemberBenefits {

}


class ComputedPriceDetailsVariantProduct {

	private SavingDetailsVO3 savingDetailsVO3;

	public SavingDetailsVO3 getSavingDetailsVO3() {
		return savingDetailsVO3;
	}

	public void setSavingDetailsVO3(SavingDetailsVO3 savingDetailsVO3) {
		this.savingDetailsVO3 = savingDetailsVO3;
	}

	private boolean tobacco;

	public boolean getTobacco() {
		return tobacco;
	}

	public void setTobacco(boolean tobacco) {
		this.tobacco = tobacco;
	}

	private boolean chewingTobacco;

	public boolean getChewingTobacco() {
		return chewingTobacco;
	}

	public void setChewingTobacco(boolean chewingTobacco) {
		this.chewingTobacco = chewingTobacco;
	}

	private boolean showTobacco;

	public boolean getShowTobacco() {
		return showTobacco;
	}

	public void setShowTobacco(boolean showTobacco) {
		this.showTobacco = showTobacco;
	}

	private boolean mapPriceItem;

	public boolean getMapPriceItem() {
		return mapPriceItem;
	}

	public void setMapPriceItem(boolean mapPriceItem) {
		this.mapPriceItem = mapPriceItem;
	}

	private BigDecimal mapPrice;

	public BigDecimal getMapPrice() {
		return mapPrice;
	}

	public void setMapPrice(BigDecimal mapPrice) {
		this.mapPrice = mapPrice;
	}

	private boolean strikeOffPrice;

	public boolean getStrikeOffPrice() {
		return strikeOffPrice;
	}

	public void setStrikeOffPrice(boolean strikeOffPrice) {
		this.strikeOffPrice = strikeOffPrice;
	}

	private boolean onlineClubPricing;

	public boolean getOnlineClubPricing() {
		return onlineClubPricing;
	}

	public void setOnlineClubPricing(boolean onlineClubPricing) {
		this.onlineClubPricing = onlineClubPricing;
	}

	private boolean invalidPrice;

	public boolean getInvalidPrice() {
		return invalidPrice;
	}

	public void setInvalidPrice(boolean invalidPrice) {
		this.invalidPrice = invalidPrice;
	}

	private boolean unitPriceItem;

	public boolean getUnitPriceItem() {
		return unitPriceItem;
	}

	public void setUnitPriceItem(boolean unitPriceItem) {
		this.unitPriceItem = unitPriceItem;
	}

	private boolean variantMapOption;

	public boolean getVariantMapOption() {
		return variantMapOption;
	}

	public void setVariantMapOption(boolean variantMapOption) {
		this.variantMapOption = variantMapOption;
	}

	private BigDecimal listPrice;

	public BigDecimal getListPrice() {
		return listPrice;
	}

	public void setListPrice(BigDecimal listPrice) {
		this.listPrice = listPrice;
	}

	private BigDecimal finalPrice;

	public BigDecimal getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(BigDecimal finalPrice) {
		this.finalPrice = finalPrice;
	}

	private BigDecimal unitPrice;

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	private BigDecimal defaultPrice;

	public BigDecimal getDefaultPrice() {
		return defaultPrice;
	}

	public void setDefaultPrice(BigDecimal defaultPrice) {
		this.defaultPrice = defaultPrice;
	}

	private boolean isTaxExempted;

	public boolean getIsTaxExempted() {
		return isTaxExempted;
	}

	public void setIsTaxExempted(boolean isTaxExempted) {
		this.isTaxExempted = isTaxExempted;
	}

	private BigDecimal packMaxSize;

	public BigDecimal getPackMaxSize() {
		return packMaxSize;
	}

	public void setPackMaxSize(BigDecimal packMaxSize) {
		this.packMaxSize = packMaxSize;
	}

	private BigDecimal packMinSize;

	public BigDecimal getPackMinSize() {
		return packMinSize;
	}

	public void setPackMinSize(BigDecimal packMinSize) {
		this.packMinSize = packMinSize;
	}

	private BigDecimal ulpw;

	public BigDecimal getUlpw() {
		return ulpw;
	}

	public void setUlpw(BigDecimal ulpw) {
		this.ulpw = ulpw;
	}

	private boolean forcedLogin;

	public boolean getForcedLogin() {
		return forcedLogin;
	}

	public void setForcedLogin(boolean forcedLogin) {
		this.forcedLogin = forcedLogin;
	}

	private BigInteger mapOption;

	public BigInteger getMapOption() {
		return mapOption;
	}

	public void setMapOption(BigInteger mapOption) {
		this.mapOption = mapOption;
	}

	private BigInteger defaultMapOption;

	public BigInteger getDefaultMapOption() {
		return defaultMapOption;
	}

	public void setDefaultMapOption(BigInteger defaultMapOption) {
		this.defaultMapOption = defaultMapOption;
	}

	private boolean wirelessProduct;

	public boolean getWirelessProduct() {
		return wirelessProduct;
	}

	public void setWirelessProduct(boolean wirelessProduct) {
		this.wirelessProduct = wirelessProduct;
	}

	private boolean weightedItem;

	public boolean getWeightedItem() {
		return weightedItem;
	}

	public void setWeightedItem(boolean weightedItem) {
		this.weightedItem = weightedItem;
	}

	private BigDecimal msrpPrice;

	public BigDecimal getMsrpPrice() {
		return msrpPrice;
	}

	public void setMsrpPrice(BigDecimal msrpPrice) {
		this.msrpPrice = msrpPrice;
	}

	private boolean msrp;

	public boolean getMsrp() {
		return msrp;
	}

	public void setMsrp(boolean msrp) {
		this.msrp = msrp;
	}

	private BigDecimal minVariancePrice;

	public BigDecimal getMinVariancePrice() {
		return minVariancePrice;
	}

	public void setMinVariancePrice(BigDecimal minVariancePrice) {
		this.minVariancePrice = minVariancePrice;
	}

	private BigDecimal maxVariancePrice;

	public BigDecimal getMaxVariancePrice() {
		return maxVariancePrice;
	}

	public void setMaxVariancePrice(BigDecimal maxVariancePrice) {
		this.maxVariancePrice = maxVariancePrice;
	}

	private boolean varianceRangePrice;

	public boolean getVarianceRangePrice() {
		return varianceRangePrice;
	}

	public void setVarianceRangePrice(boolean varianceRangePrice) {
		this.varianceRangePrice = varianceRangePrice;
	}

	private boolean varianceMapPriceRange;

	public boolean getVarianceMapPriceRange() {
		return varianceMapPriceRange;
	}

	public void setVarianceMapPriceRange(boolean varianceMapPriceRange) {
		this.varianceMapPriceRange = varianceMapPriceRange;
	}

	private BigDecimal minVarianceMapPrice;

	public BigDecimal getMinVarianceMapPrice() {
		return minVarianceMapPrice;
	}

	public void setMinVarianceMapPrice(BigDecimal minVarianceMapPrice) {
		this.minVarianceMapPrice = minVarianceMapPrice;
	}

	private BigDecimal maxVarianceMapPrice;

	public BigDecimal getMaxVarianceMapPrice() {
		return maxVarianceMapPrice;
	}

	public void setMaxVarianceMapPrice(BigDecimal maxVarianceMapPrice) {
		this.maxVarianceMapPrice = maxVarianceMapPrice;
	}

	private boolean multipleSavingsProduct;

	public boolean getMultipleSavingsProduct() {
		return multipleSavingsProduct;
	}

	public void setMultipleSavingsProduct(boolean multipleSavingsProduct) {
		this.multipleSavingsProduct = multipleSavingsProduct;
	}

	private String unitOfMeassureSingular;

	public String getUnitOfMeassureSingular() {
		return unitOfMeassureSingular;
	}

	public void setUnitOfMeassureSingular(String unitOfMeassureSingular) {
		this.unitOfMeassureSingular = unitOfMeassureSingular;
	}

	private String unitOfMeassurePlural;

	public String getUnitOfMeassurePlural() {
		return unitOfMeassurePlural;
	}

	public void setUnitOfMeassurePlural(String unitOfMeassurePlural) {
		this.unitOfMeassurePlural = unitOfMeassurePlural;
	}

	private BigDecimal comparativePrice;

	public BigDecimal getComparativePrice() {
		return comparativePrice;
	}

	public void setComparativePrice(BigDecimal comparativePrice) {
		this.comparativePrice = comparativePrice;
	}

	private BigDecimal originalListPrice;

	public BigDecimal getOriginalListPrice() {
		return originalListPrice;
	}

	public void setOriginalListPrice(BigDecimal originalListPrice) {
		this.originalListPrice = originalListPrice;
	}

	private boolean specialOrderPricing;

	public boolean getSpecialOrderPricing() {
		return specialOrderPricing;
	}

	public void setSpecialOrderPricing(boolean specialOrderPricing) {
		this.specialOrderPricing = specialOrderPricing;
	}

	private boolean fromPrice;

	public boolean getFromPrice() {
		return fromPrice;
	}

	public void setFromPrice(boolean fromPrice) {
		this.fromPrice = fromPrice;
	}

}


class SavingDetailsVO3 {

	private String savingType;

	public String getSavingType() {
		return savingType;
	}

	public void setSavingType(String savingType) {
		this.savingType = savingType;
	}

	private String discountType;

	public String getDiscountType() {
		return discountType;
	}

	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	private String savingMessageShort;

	public String getSavingMessageShort() {
		return savingMessageShort;
	}

	public void setSavingMessageShort(String savingMessageShort) {
		this.savingMessageShort = savingMessageShort;
	}

	private String savingMessageLong;

	public String getSavingMessageLong() {
		return savingMessageLong;
	}

	public void setSavingMessageLong(String savingMessageLong) {
		this.savingMessageLong = savingMessageLong;
	}

	private String specialMessage;

	public String getSpecialMessage() {
		return specialMessage;
	}

	public void setSpecialMessage(String specialMessage) {
		this.specialMessage = specialMessage;
	}

	private String popupMessage;

	public String getPopupMessage() {
		return popupMessage;
	}

	public void setPopupMessage(String popupMessage) {
		this.popupMessage = popupMessage;
	}

	private BigDecimal amountSaved;

	public BigDecimal getAmountSaved() {
		return amountSaved;
	}

	public void setAmountSaved(BigDecimal amountSaved) {
		this.amountSaved = amountSaved;
	}

	private BigDecimal percentSaved;

	public BigDecimal getPercentSaved() {
		return percentSaved;
	}

	public void setPercentSaved(BigDecimal percentSaved) {
		this.percentSaved = percentSaved;
	}

	private BigDecimal discountedPrice;

	public BigDecimal getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(BigDecimal discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	private BigInteger limitPerMember;

	public BigInteger getLimitPerMember() {
		return limitPerMember;
	}

	public void setLimitPerMember(BigInteger limitPerMember) {
		this.limitPerMember = limitPerMember;
	}

	private BigInteger skuType;

	public BigInteger getSkuType() {
		return skuType;
	}

	public void setSkuType(BigInteger skuType) {
		this.skuType = skuType;
	}

	private boolean clubInsiderPackageCode;

	public boolean getClubInsiderPackageCode() {
		return clubInsiderPackageCode;
	}

	public void setClubInsiderPackageCode(boolean clubInsiderPackageCode) {
		this.clubInsiderPackageCode = clubInsiderPackageCode;
	}

	private BigInteger minQuantity;

	public BigInteger getMinQuantity() {
		return minQuantity;
	}

	public void setMinQuantity(BigInteger minQuantity) {
		this.minQuantity = minQuantity;
	}

}


class ShippingEstimates {

}


class ThresholdEligibleDetails {

}


class ServiceAgreements {

}


class EvalueDetails {

}