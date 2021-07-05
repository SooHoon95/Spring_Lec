package com.jspproject.bbs.dto;

public class BDto {
//	(pPrice, pCategory, PExpirationDate, pName, pQuantity)
	String pPrice;
	String pCategory;
	String pExpriationDate;
	String pName;
	String pQuantity;
	
	public BDto() {
		// TODO Auto-generated constructor stub
	}

	public BDto(String pPrice, String pCategory, String pExpriationDate, String pName, String pQuantity) {
		super();
		this.pPrice = pPrice;
		this.pCategory = pCategory;
		this.pExpriationDate = pExpriationDate;
		this.pName = pName;
		this.pQuantity = pQuantity;
	}

	
	
	
	

	public String getpPrice() {
		return pPrice;
	}

	public void setpPrice(String pPrice) {
		this.pPrice = pPrice;
	}

	public String getpCategory() {
		return pCategory;
	}

	public void setpCategory(String pCategory) {
		this.pCategory = pCategory;
	}

	public String getpExpriationDate() {
		return pExpriationDate;
	}

	public void setpExpriationDate(String pExpriationDate) {
		this.pExpriationDate = pExpriationDate;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpQuantity() {
		return pQuantity;
	}

	public void setpQuantity(String pQuantity) {
		this.pQuantity = pQuantity;
	}

}
