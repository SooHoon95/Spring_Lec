package com.jspproject.bbs.dto;

public class BCartDto { // 2021.05.16 조혜지 - 장바구니 dto
	
	// Field
	String pName;
	int wQuantity;
	String pExpirationDate;
	int pPriceDC;
	int wId;
	int pCode;
	String pProductEA;
	
	// Constructor
	public BCartDto() {
		// TODO Auto-generated constructor stub
	}

	public BCartDto(String pName, int wQuantity, String pExpirationDate, int pPriceDC, int wId) {
		super();
		this.pName = pName;
		this.wQuantity = wQuantity;
		this.pExpirationDate = pExpirationDate;
		this.pPriceDC = pPriceDC;
		this.wId = wId;
	}

	public BCartDto(int wId) {
		super();
		this.wId = wId;
	}
	
	public BCartDto(String pName, int wQuantity, String pExpirationDate, int pPriceDC, int wId, int pCode,
			String pProductEA) {
		super();
		this.pName = pName;
		this.wQuantity = wQuantity;
		this.pExpirationDate = pExpirationDate;
		this.pPriceDC = pPriceDC;
		this.wId = wId;
		this.pCode = pCode;
		this.pProductEA = pProductEA;
	}

	// Method
	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getwQuantity() {
		return wQuantity;
	}

	public void setwQuantity(int wQuantity) {
		this.wQuantity = wQuantity;
	}

	public String getpExpirationDate() {
		return pExpirationDate;
	}

	public void setpExpirationDate(String pExpirationDate) {
		this.pExpirationDate = pExpirationDate;
	}

	public int getpPriceDC() {
		return pPriceDC;
	}

	public void setpPriceDC(int pPriceDC) {
		this.pPriceDC = pPriceDC;
	}

	public int getwId() {
		return wId;
	}

	public void setwId(int wId) {
		this.wId = wId;
	}

	public int getpCode() {
		return pCode;
	}

	public void setpCode(int pCode) {
		this.pCode = pCode;
	}

}
