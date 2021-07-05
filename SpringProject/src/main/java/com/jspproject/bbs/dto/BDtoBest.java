package com.jspproject.bbs.dto;

public class BDtoBest {
	
	int pCode;
	int pCount;
	String pName;
	int pPriceDC;
	int pDiscount;
	String pFilePath;
	
	public BDtoBest(int pCode, int pCount, String pName, int pPriceDC, int pDiscount) {
		super();
		this.pCode = pCode;
		this.pCount = pCount;
		this.pName = pName;
		this.pPriceDC = pPriceDC;
		this.pDiscount = pDiscount;
	}
	public BDtoBest(int pCode, int pCount, String pName, int pPriceDC, int pDiscount, String pFilePath) {
		super();
		this.pCode = pCode;
		this.pCount = pCount;
		this.pName = pName;
		this.pPriceDC = pPriceDC;
		this.pDiscount = pDiscount;
		this.pFilePath = pFilePath;
	}
	

	public int getpCode() {
		return pCode;
	}

	public void setpCode(int pCode) {
		this.pCode = pCode;
	}

	public int getpCount() {
		return pCount;
	}

	public void setpCount(int pCount) {
		this.pCount = pCount;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
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
	public String getpFilePath() {
		return pFilePath;
	}
	public void setpFilePath(String pFilePath) {
		this.pFilePath = pFilePath;
	}
	
}
