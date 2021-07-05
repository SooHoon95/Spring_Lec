package com.jspproject.bbs.dto;

public class BDtoProductList {
	
	int pCode;
	String pName;
	String pExpirationDate;
	int pPriceDC;
	int pDiscount;
	String star;
	int pCount;
	String pFilePath;
	
	
	
	public BDtoProductList() {
		// TODO Auto-generated constructor stub
	}

	public BDtoProductList(int pCode, String pName, String pExpirationDate, int pPriceDC, int pDiscount, String star,
			int pCount) {
		super();
		this.pCode = pCode;
		this.pName = pName;
		this.pExpirationDate = pExpirationDate;
		this.pPriceDC = pPriceDC;
		this.pDiscount = pDiscount;
		this.star = star;
		this.pCount = pCount;
	}
	public BDtoProductList(int pCode, String pName, String pExpirationDate, int pPriceDC, int pDiscount, String star,
			int pCount, String pFilePath) {
		super();
		this.pCode = pCode;
		this.pName = pName;
		this.pExpirationDate = pExpirationDate;
		this.pPriceDC = pPriceDC;
		this.pDiscount = pDiscount;
		this.star = star;
		this.pCount = pCount;
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

	public int getpDiscount() {
		return pDiscount;
	}

	public void setpDiscount(int pDiscount) {
		this.pDiscount = pDiscount;
	}

	public String getStar() {
		return star;
	}

	public void setStar(String star) {
		this.star = star;
	}

	public int getpCount() {
		return pCount;
	}

	public void setpCount(int pCount) {
		this.pCount = pCount;
	}

	public String getpFilePath() {
		return pFilePath;
	}

	public void setpFilePath(String pFilePath) {
		this.pFilePath = pFilePath;
	}

}

