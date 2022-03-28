package com.mobile.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MobileDetails")
public class Mobile {

	@Id
	
	private int mobileId;
	private String mobileName;
	private String mobileTYPE;
	private float mobilePrice;
	private String mobileWarenty;
	private int mobileIMEINumber;
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public String getMobileTYPE() {
		return mobileTYPE;
	}
	public void setMobileTYPE(String mobileTYPE) {
		this.mobileTYPE = mobileTYPE;
	}
	public float getMobilePrice() {
		return mobilePrice;
	}
	public void setMobilePrice(float mobilePrice) {
		this.mobilePrice = mobilePrice;
	}
	public String getMobileWarenty() {
		return mobileWarenty;
	}
	public void setMobileWarenty(String mobileWarenty) {
		this.mobileWarenty = mobileWarenty;
	}
	public int getMobileIMEINumber() {
		return mobileIMEINumber;
	}
	public void setMobileIMEINumber(int mobileIMEINumber) {
		this.mobileIMEINumber = mobileIMEINumber;
	}
	public Mobile(int mobileId, String mobileName, String mobileTYPE, float mobilePrice, String mobileWarenty,
			int mobileIMEINumber) {
		super();
		this.mobileId = mobileId;
		this.mobileName = mobileName;
		this.mobileTYPE = mobileTYPE;
		this.mobilePrice = mobilePrice;
		this.mobileWarenty = mobileWarenty;
		this.mobileIMEINumber = mobileIMEINumber;
	}
	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", mobileName=" + mobileName + ", mobileTYPE=" + mobileTYPE
				+ ", mobilePrice=" + mobilePrice + ", mobileWarenty=" + mobileWarenty + ", mobileIMEINumber="
				+ mobileIMEINumber + "]";
	}
	public Mobile() {
		super();
	}
	
	
}