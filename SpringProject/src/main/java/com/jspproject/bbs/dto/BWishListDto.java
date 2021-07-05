package com.jspproject.bbs.dto;

public class BWishListDto {
	
	// Field
	String pName;
	int wQuantity;
	String pExpirationDate;
	int pPriceDC;
	int wId;
	int Product_pCode;
	
	public BWishListDto() {
		// TODO Auto-generated constructor stub
	}

	public BWishListDto(String pName, int wQuantity, String pExpirationDate, int pPriceDC, int wId, int product_pCode) {
		super();
		this.pName = pName;
		this.wQuantity = wQuantity;
		this.pExpirationDate = pExpirationDate;
		this.pPriceDC = pPriceDC;
		this.wId = wId;
		this.Product_pCode = product_pCode;
	}


	
}
