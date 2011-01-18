package com.hisgadget.dropship.server.model;

import java.io.Serializable;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@SuppressWarnings("serial")
@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable = "true")
public class AmazonSKU implements Serializable {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private String merchantSKU;

	@Persistent
	private String netSKU;
	@Persistent
	private String asin;
	@Persistent
	private String parentSKU;
	@Persistent
	private String condition;
	@Persistent
	private int totalQuantity;
	@Persistent
	private int inStockQuantity;

	@Persistent
	private int actStockQuantity;

	@Persistent
	private float nowPrice;

	@Persistent
	private float nowShippingPrice;

	@Persistent
	private int nowPosition;
	@Persistent
	private float profit;
	@Persistent
	private boolean isOwn;
	@Persistent
	private boolean isActive;

	public String getMerchantSKU() {
		return merchantSKU;
	}

	public int getActStockQuantity() {
		return actStockQuantity;
	}

	public void setActStockQuantity(int actStockQuantity) {
		this.actStockQuantity = actStockQuantity;
	}

	public float getNowPrice() {
		return nowPrice;
	}

	public void setNowPrice(float nowPrice) {
		this.nowPrice = nowPrice;
	}

	public float getNowShippingPrice() {
		return nowShippingPrice;
	}

	public void setNowShippingPrice(float nowShippingPrice) {
		this.nowShippingPrice = nowShippingPrice;
	}

	public int getNowPosition() {
		return nowPosition;
	}

	public void setNowPosition(int nowPosition) {
		this.nowPosition = nowPosition;
	}

	public float getProfit() {
		return profit;
	}

	public void setProfit(float profit) {
		this.profit = profit;
	}

	public boolean isOwn() {
		return isOwn;
	}

	public void setOwn(boolean isOwn) {
		this.isOwn = isOwn;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public void setMerchantSKU(String merchantSKU) {
		this.merchantSKU = merchantSKU;
	}

	public String getNetSKU() {
		return netSKU;
	}

	public void setNetSKU(String netSKU) {
		this.netSKU = netSKU;
	}

	public String getAsin() {
		return asin;
	}

	public void setAsin(String asin) {
		this.asin = asin;
	}

	public String getParentSKU() {
		return parentSKU;
	}

	public void setParentSKU(String parentSKU) {
		this.parentSKU = parentSKU;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public int getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public int getInStockQuantity() {
		return inStockQuantity;
	}

	public void setInStockQuantity(int inStockQuantity) {
		this.inStockQuantity = inStockQuantity;
	}

}
