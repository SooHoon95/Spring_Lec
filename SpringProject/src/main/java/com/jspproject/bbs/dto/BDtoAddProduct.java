package com.jspproject.bbs.dto;

import java.sql.Timestamp;

public class BDtoAddProduct {
//	pCode, pCategory, pName, pPrice, pExpirationDate, pProductEA
	// product Table
	int pCode;
	String pCategory;
	String pName;
	String pPrice;
	String pPriceDC;
	Timestamp pExpirationDate;
	String pProductEA;
	String pStatus;
	Timestamp pAddDate;
	String pFilePath;
	String filePathMain;
	String filePathDetail;
	
	// Rns table
	String sId;
	String rInsertDate;
	
	
	
	// ------------------------------------------------------------------------------
	public BDtoAddProduct() {
		// TODO Auto-generated constructor stub
	}
	
	
	public BDtoAddProduct(String pCategory, String pName, String pPrice, Timestamp pExpirationDate, String pProductEA,
			String pStatus) {
		super();
		this.pCategory = pCategory;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pExpirationDate = pExpirationDate;
		this.pProductEA = pProductEA;
		this.pStatus = pStatus;
	}


	public BDtoAddProduct(int pCode, String pCategory, String pName, String pPrice, Timestamp pExpirationDate, String pProductEA) {
		super();
		this.pCode = pCode;
		this.pCategory = pCategory;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pExpirationDate = pExpirationDate;
		this.pProductEA = pProductEA;
	}

	
	public BDtoAddProduct(int pCode, String pCategory, String pName, String pPrice, Timestamp pExpirationDate, String pProductEA,
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
	
	public BDtoAddProduct(int pCode, String sId, String rInsertDate) {
		super();
		this.pCode = pCode;
		this.sId = sId;
		this.rInsertDate = rInsertDate;
	}
	
	

	public BDtoAddProduct(String sId, String rInsertDate) {
		super();
		this.sId = sId;
		this.rInsertDate = rInsertDate;
	}


	// ------------------------------------------------------------------------------

	public int getpCode() {
		return pCode;
	}

	public void setpCode(int pCode) {
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

	public Timestamp getpExpirationDate() {
		return pExpirationDate;
	}

	public void setpExpirationDate(Timestamp pExpirationDate) {
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


	public String getsId() {
		return sId;
	}


	public void setsId(String sId) {
		this.sId = sId;
	}


	public String getrInsertDate() {
		return rInsertDate;
	}


	public void setrInsertDate(String rInsertDate) {
		this.rInsertDate = rInsertDate;
	}


	public String getpPriceDC() {
		return pPriceDC;
	}


	public void setpPriceDC(String pPriceDC) {
		this.pPriceDC = pPriceDC;
	}


	public Timestamp getpAddDate() {
		return pAddDate;
	}


	public void setpAddDate(Timestamp pAddDate) {
		this.pAddDate = pAddDate;
	}


	public String getpFilePath() {
		return pFilePath;
	}


	public void setpFilePath(String pFilePath) {
		this.pFilePath = pFilePath;
	}


	public String getFilePathMain() {
		return filePathMain;
	}


	public void setFilePathMain(String filePathMain) {
		this.filePathMain = filePathMain;
	}


	public String getFilePathDetail() {
		return filePathDetail;
	}


	public void setFilePathDetail(String filePathDetail) {
		this.filePathDetail = filePathDetail;
	}
	
	
	
	
	
}
