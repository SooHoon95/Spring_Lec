package com.jspproject.bbs.dto;

public class BSellerDto { // 2021.05.25 조혜지 - 판매자 정보 수정 dto
	
	// Field
	String sId;
	String sName;
	String sEmail;
	String sBirth;
	String sTel;
	String sPostalCode;
	String sAddress1;
	String sAddress2;
	String sShopName;
	String sNumber;
	
	// Constructor
	public BSellerDto() {
		// TODO Auto-generated constructor stub
	}

	public BSellerDto(String sId, String sName, String sEmail, String sBirth, String sTel, String sPostalCode,
			String sAddress1, String sAddress2, String sShopName, String sNumber) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sEmail = sEmail;
		this.sBirth = sBirth;
		this.sTel = sTel;
		this.sPostalCode = sPostalCode;
		this.sAddress1 = sAddress1;
		this.sAddress2 = sAddress2;
		this.sShopName = sShopName;
		this.sNumber = sNumber;
	}

	// Method
	public String getsId() {
		return sId;
	}

	public void setsId(String sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getsBirth() {
		return sBirth;
	}

	public void setsBirth(String sBirth) {
		this.sBirth = sBirth;
	}

	public String getsTel() {
		return sTel;
	}

	public void setsTel(String sTel) {
		this.sTel = sTel;
	}

	public String getsPostalCode() {
		return sPostalCode;
	}

	public void setsPostalCode(String sPostalCode) {
		this.sPostalCode = sPostalCode;
	}

	public String getsAddress1() {
		return sAddress1;
	}

	public void setsAddress1(String sAddress1) {
		this.sAddress1 = sAddress1;
	}

	public String getsAddress2() {
		return sAddress2;
	}

	public void setsAddress2(String sAddress2) {
		this.sAddress2 = sAddress2;
	}

	public String getsShopName() {
		return sShopName;
	}

	public void setsShopName(String sShopName) {
		this.sShopName = sShopName;
	}

	public String getsNumber() {
		return sNumber;
	}

	public void setsNumber(String sNumber) {
		this.sNumber = sNumber;
	}

}
