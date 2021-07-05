package com.jspproject.bbs.dto;

public class BDtoProduct {
	
	int pCode;
	String pName;
	String pCategory;
	int pPrice;
	int pPriceDC;
	int pDiscount;
	String pExpirationDate;
	int pProductEA;
	String pFilePath;
	String pStatus;
	String pDelete;
	String pAddDate;
	
	public BDtoProduct() {
		// TODO Auto-generated constructor stub
	}

	public BDtoProduct(int pCode, String pName, String pCategory, int pPrice, int pPriceDC, int pDiscount,
			String pExpirationDate, int pProductEA) {
		super();
		this.pCode = pCode;
		this.pName = pName;
		this.pCategory = pCategory;
		this.pPrice = pPrice;
		this.pPriceDC = pPriceDC;
		this.pDiscount = pDiscount;
		this.pExpirationDate = pExpirationDate;
		this.pProductEA = pProductEA;
	}

	public BDtoProduct(int pCode, String pName, String pCategory, int pPrice, int pPriceDC, int pDiscount,
			String pExpirationDate, int pProductEA, String pFilePath) {
		super();
		this.pCode = pCode;
		this.pName = pName;
		this.pCategory = pCategory;
		this.pPrice = pPrice;
		this.pPriceDC = pPriceDC;
		this.pDiscount = pDiscount;
		this.pExpirationDate = pExpirationDate;
		this.pProductEA = pProductEA;
		this.pFilePath = pFilePath;
	}
	

	public int getpCode() {
		return pCode;
	}

	public void setpCode(int pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpCategory() {
		return pCategory;
	}

	public void setpCategory(String pCategory) {
		this.pCategory = pCategory;
	}

	public int getpPrice() {
		return pPrice;
	}

	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}

	public int getpPriceDC() {
		return pPriceDC;
	}

	public void setpPriceDC(int pPriceDC) {
		this.pPriceDC = pPriceDC;
	}

	public int getpDiscount() {
		return pDiscount;
	}

	public void setpDiscount(int pDiscount) {
		this.pDiscount = pDiscount;
	}

	public String getpExpirationDate() {
		return pExpirationDate;
	}

	public void setpExpirationDate(String pExpirationDate) {
		this.pExpirationDate = pExpirationDate;
	}

	public int getpProductEA() {
		return pProductEA;
	}

	public void setpProductEA(int pProductEA) {
		this.pProductEA = pProductEA;
	}

	public String getpFilePath() {
		return pFilePath;
	}

	public void setpFilePath(String pFilePath) {
		this.pFilePath = pFilePath;
	}

	public String getpStatus() {
		return pStatus;
	}

	public void setpStatus(String pStatus) {
		this.pStatus = pStatus;
	}

	public String getpDelete() {
		return pDelete;
	}

	public void setpDelete(String pDelete) {
		this.pDelete = pDelete;
	}

	public String getpAddDate() {
		return pAddDate;
	}

	public void setpAddDate(String pAddDate) {
		this.pAddDate = pAddDate;
	}
	
	
}
