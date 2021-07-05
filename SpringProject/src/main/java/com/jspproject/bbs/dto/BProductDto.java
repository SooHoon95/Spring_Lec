package com.jspproject.bbs.dto;

public class BProductDto {
//	pCode, pCategory, pName, pPrice, pExpirationDate, pProductEA
	String pCode;
	String pCategory;
	String pName;
	String pPrice;
	String pPriceDC;
	String pExpirationDate;
	String pProductEA;
	String pStatus;
	String pDelete;
	String pAddDate;
	String pFilePath;
	
	// ------------------------------------------------------------------------------
	public BProductDto() {
		// TODO Auto-generated constructor stub
	}
	
	
	public BProductDto(String pCode, String pCategory, String pName, String pPrice, String pExpirationDate, String pProductEA) {
		super();
		this.pCode = pCode;
		this.pCategory = pCategory;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pExpirationDate = pExpirationDate;
		this.pProductEA = pProductEA;
	}

	
	public BProductDto(String pCode, String pCategory, String pName, String pPrice, String pExpirationDate, String pProductEA,
			String pStatus) {
		super();
		this.pCode = pCode;
		this.pCategory = pCategory;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pExpirationDate = pExpirationDate;
		this.pProductEA = pProductEA;
		this.pStatus = pStatus;
	}
	

	public BProductDto(String pCode, String pName, String pPrice, String pPriceDC, String pExpirationDate,
			String pStatus, String pAddDate, String pCategory) {
		super();
		this.pCode = pCode;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pPriceDC = pPriceDC;
		this.pExpirationDate = pExpirationDate;
		this.pStatus = pStatus;
		this.pAddDate = pAddDate;
		this.pCategory = pCategory;
	}


	public BProductDto(String pCode, String pCategory, String pName, String pPrice, String pPriceDC,
			String pExpirationDate, String pProductEA, String pStatus, String pAddDate, String pFilePath) {
		super();
		this.pCode = pCode;
		this.pCategory = pCategory;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pPriceDC = pPriceDC;
		this.pExpirationDate = pExpirationDate;
		this.pProductEA = pProductEA;
		this.pStatus = pStatus;
		this.pAddDate = pAddDate;
		this.pFilePath = pFilePath;
	}


	// ------------------------------------------------------------------------------

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpCategory() {
		return pCategory;
	}

	public void setpCategory(String pCategory) {
		this.pCategory = pCategory;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpPrice() {
		return pPrice;
	}

	public void setpPrice(String pPrice) {
		this.pPrice = pPrice;
	}

	public String getpExpirationDate() {
		return pExpirationDate;
	}

	public void setpExpirationDate(String pExpirationDate) {
		this.pExpirationDate = pExpirationDate;
	}

	public String getpProductEA() {
		return pProductEA;
	}

	public void setpProductEA(String pProductEA) {
		this.pProductEA = pProductEA;
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


	public String getpPriceDC() {
		return pPriceDC;
	}


	public void setpPriceDC(String pPriceDC) {
		this.pPriceDC = pPriceDC;
	}


	public String getpAddDate() {
		return pAddDate;
	}


	public void setpAddDate(String pAddDate) {
		this.pAddDate = pAddDate;
	}


	public String getpFilePath() {
		return pFilePath;
	}


	public void setpFilePath(String pFilePath) {
		this.pFilePath = pFilePath;
	}

}
