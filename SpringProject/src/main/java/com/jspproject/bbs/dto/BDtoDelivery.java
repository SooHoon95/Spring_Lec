package com.jspproject.bbs.dto;

import java.sql.Timestamp;

public class BDtoDelivery {
//	dStartDate, dEndDate, cId, sId
	String bNumber;
	String pCategory;
	String pName;
	String dCondition;
	String dStartDate;
	String dEndDate;
	String cId;
	String sId;
	String cName;
	String cTel;
	String cAddress;
	String bBuyDate;
	String cPostalCode;
	String cAddress1;
	String cAddress2;
	int bQuantity;
	String bRecName;
	String bRecTel;
	String bRecPostalCode;
	String bRecAddress1;
	String bRecAddress2;
	
	
	
	
	public BDtoDelivery() {
		// TODO Auto-generated constructor stub
	}

	public BDtoDelivery(String bNumber, String pCategory, String pName, String dCondition, String dStartDate, String dEndDate,
			String cId, String sId) {
		super();
		this.bNumber = bNumber;
		this.pCategory = pCategory;
		this.pName = pName;
		this.dCondition = dCondition;
		this.dStartDate = dStartDate;
		this.dEndDate = dEndDate;
		this.cId = cId;
		this.sId = sId;
	}

	public BDtoDelivery(String bNumber, String pCategory, String pName, String dCondition) {
		super();
		this.bNumber = bNumber;
		this.pCategory = pCategory;
		this.pName = pName;
		this.dCondition = dCondition;
	}
	

	
	
	public BDtoDelivery(String bNumber, String dStartDate, String dEndDate, String bBuyDate, String bRecName,
			String bRecTel, String bRecPostalCode, String bRecAddress1, String bRecAddress2) {
		super();
		this.bNumber = bNumber;
		this.dStartDate = dStartDate;
		this.dEndDate = dEndDate;
		this.bBuyDate = bBuyDate;
		this.bRecName = bRecName;
		this.bRecTel = bRecTel;
		this.bRecPostalCode = bRecPostalCode;
		this.bRecAddress1 = bRecAddress1;
		this.bRecAddress2 = bRecAddress2;
	}

	public BDtoDelivery(String pCategory, String pName, int bQuantity) {
		super();
		this.pCategory = pCategory;
		this.pName = pName;
		this.bQuantity = bQuantity;
	}

	public BDtoDelivery(String bNumber, String dStartDate, String dEndDate, String cName, String cTel,
			String cAddress, String bBuyDate) {
		super();
		this.bNumber = bNumber;
		this.dStartDate = dStartDate;
		this.dEndDate = dEndDate;
		this.cName = cName;
		this.cTel = cTel;
		this.cAddress = cAddress;
		this.bBuyDate = bBuyDate;
	}
	


	public String getbNumber() {
		return bNumber;
	}

	public void setbNumber(String bNumber) {
		this.bNumber = bNumber;
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

	public String getdCondition() {
		return dCondition;
	}

	public void setdCondition(String dCondition) {
		this.dCondition = dCondition;
	}

	public String getdStartDate() {
		return dStartDate;
	}

	public void setdStartDate(String dStartDate) {
		this.dStartDate = dStartDate;
	}

	public String getdEndDate() {
		return dEndDate;
	}

	public void setdEndDate(String dEndDate) {
		this.dEndDate = dEndDate;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String getsId() {
		return sId;
	}

	public void setsId(String sId) {
		this.sId = sId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcTel() {
		return cTel;
	}

	public void setcTel(String cTel) {
		this.cTel = cTel;
	}

	public String getcAddress() {
		return cAddress;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

	public String getbBuyDate() {
		return bBuyDate;
	}

	public void setbBuyDate(String bBuyDate) {
		this.bBuyDate = bBuyDate;
	}

	public String getcPostalCode() {
		return cPostalCode;
	}

	public void setcPostalCode(String cPostalCode) {
		this.cPostalCode = cPostalCode;
	}

	public String getcAddress1() {
		return cAddress1;
	}

	public void setcAddress1(String cAddress1) {
		this.cAddress1 = cAddress1;
	}

	public String getcAddress2() {
		return cAddress2;
	}

	public void setcAddress2(String cAddress2) {
		this.cAddress2 = cAddress2;
	}

	public int getbQuantity() {
		return bQuantity;
	}

	public void setbQuantity(int bQuantity) {
		this.bQuantity = bQuantity;
	}

	public String getbRecName() {
		return bRecName;
	}

	public void setbRecName(String bRecName) {
		this.bRecName = bRecName;
	}

	public String getbRecTel() {
		return bRecTel;
	}

	public void setbRecTel(String bRecTel) {
		this.bRecTel = bRecTel;
	}

	public String getbRecPostalCode() {
		return bRecPostalCode;
	}

	public void setbRecPostalCode(String bRecPostalCode) {
		this.bRecPostalCode = bRecPostalCode;
	}

	public String getbRecAddress1() {
		return bRecAddress1;
	}

	public void setbRecAddress1(String bRecAddress1) {
		this.bRecAddress1 = bRecAddress1;
	}

	public String getbRecAddress2() {
		return bRecAddress2;
	}

	public void setbRecAddress2(String bRecAddress2) {
		this.bRecAddress2 = bRecAddress2;
	}
	
	
	
	
	

}
