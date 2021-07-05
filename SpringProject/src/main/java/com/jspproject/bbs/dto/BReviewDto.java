package com.jspproject.bbs.dto;

public class BReviewDto { // 2021.05.16 조혜지 - 리뷰 dto

	// Field
	String bNumber;
	String bBuyDate;
	String pName;
	int bQuantity;
	int pPriceDC;
	int pCode;
	int bReviewScore;
	String bReviewContent;
	
	// Constructor
	public BReviewDto() {
		// TODO Auto-generated constructor stub
	}

	public BReviewDto(String bNumber, String bBuyDate, String pName, int bQuantity, int pPriceDC, int pCode) {
		super();
		this.bNumber = bNumber;
		this.bBuyDate = bBuyDate;
		this.pName = pName;
		this.bQuantity = bQuantity;
		this.pPriceDC = pPriceDC;
		this.pCode = pCode;
	}

	public BReviewDto(String bNumber, String bBuyDate, String pName, int pCode, int bReviewScore,
			String bReviewContent) {
		super();
		this.bNumber = bNumber;
		this.bBuyDate = bBuyDate;
		this.pName = pName;
		this.pCode = pCode;
		this.bReviewScore = bReviewScore;
		this.bReviewContent = bReviewContent;
	}

	// Method
	public String getbNumber() {
		return bNumber;
	}


	public void setbNumber(String bNumber) {
		this.bNumber = bNumber;
	}


	public String getbBuyDate() {
		return bBuyDate;
	}


	public void setbBuyDate(String bBuyDate) {
		this.bBuyDate = bBuyDate;
	}


	public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}


	public int getbQuantity() {
		return bQuantity;
	}


	public void setbQuantity(int bQuantity) {
		this.bQuantity = bQuantity;
	}


	public int getpPriceDC() {
		return pPriceDC;
	}


	public void setpPriceDC(int pPriceDC) {
		this.pPriceDC = pPriceDC;
	}


	public int getbReviewScore() {
		return bReviewScore;
	}


	public void setbReviewScore(int bReviewScore) {
		this.bReviewScore = bReviewScore;
	}


	public String getbReviewContent() {
		return bReviewContent;
	}


	public void setbReviewContent(String bReviewContent) {
		this.bReviewContent = bReviewContent;
	}

	public int getpCode() {
		return pCode;
	}

	public void setpCode(int pCode) {
		this.pCode = pCode;
	}

}
