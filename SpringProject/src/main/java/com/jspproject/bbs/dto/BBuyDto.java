package com.jspproject.bbs.dto;

public class BBuyDto { // 2021.05.16 조혜지 - 주문서 작성/결제 dto
	
	// Field
	int datediff;
	String bNumber;
	String bBuyDate;
	String bBuyCancelDate;
	String cName;
	String cTel;
	String cEmail;
	String pName;
	int wQuantity;
	String pExpirationDate;
	int pPriceDC;
	int bQuantity;
	String dCondition;
	int wId;
	int pCode;
	String bRecName;
	String bRecPostalCode;
	String bRecAddress1;
	String bRecAddress2;
	String bRecTel;
	String bRecContent;
	
	// Constructor
	public BBuyDto() {
		// TODO Auto-generated constructor stub
	}

	public BBuyDto(String cName, String cTel, String cEmail) {
		super();
		this.cName = cName;
		this.cTel = cTel;
		this.cEmail = cEmail;
	}

	public BBuyDto(int datediff, String bNumber, String bBuyDate, String pName, int bQuantity, String dCondition) {
		super();
		this.datediff = datediff;
		this.bNumber = bNumber;
		this.bBuyDate = bBuyDate;
		this.pName = pName;
		this.bQuantity = bQuantity;
		this.dCondition = dCondition;
	}

	public BBuyDto(String pName, int wQuantity, String pExpirationDate, int pPriceDC, int pCode) {
		super();
		this.pName = pName;
		this.wQuantity = wQuantity;
		this.pExpirationDate = pExpirationDate;
		this.pPriceDC = pPriceDC;
		this.pCode = pCode;
	}

	public BBuyDto(String bNumber) {
		super();
		this.bNumber = bNumber;
	}

	public BBuyDto(String bNumber, String pName, String pExpirationDate, int pPriceDC, int bQuantity) {
		super();
		this.bNumber = bNumber;
		this.pName = pName;
		this.pExpirationDate = pExpirationDate;
		this.pPriceDC = pPriceDC;
		this.bQuantity = bQuantity;
	}

	public BBuyDto(String bRecName, String bRecPostalCode, String bRecAddress1, String bRecAddress2, String bRecTel,
			String bRecContent) {
		super();
		this.bRecName = bRecName;
		this.bRecPostalCode = bRecPostalCode;
		this.bRecAddress1 = bRecAddress1;
		this.bRecAddress2 = bRecAddress2;
		this.bRecTel = bRecTel;
		this.bRecContent = bRecContent;
	}

	public BBuyDto(String pName, int wQuantity, String pExpirationDate, int pPriceDC, int wId, int pCode) {
		super();
		this.pName = pName;
		this.wQuantity = wQuantity;
		this.pExpirationDate = pExpirationDate;
		this.pPriceDC = pPriceDC;
		this.wId = wId;
		this.pCode = pCode;
	}

	public BBuyDto(String bNumber, String bBuyDate, String bBuyCancelDate, String pName, int bQuantity) {
		super();
		this.bNumber = bNumber;
		this.bBuyDate = bBuyDate;
		this.bBuyCancelDate = bBuyCancelDate;
		this.pName = pName;
		this.bQuantity = bQuantity;
	}

	public BBuyDto(int pCode) {
		super();
		this.pCode = pCode;
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

	public String getcEmail() {
		return cEmail;
	}

	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}

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

	public int getbQuantity() {
		return bQuantity;
	}

	public void setbQuantity(int bQuantity) {
		this.bQuantity = bQuantity;
	}

	public String getdCondition() {
		return dCondition;
	}

	public void setdCondition(String dCondition) {
		this.dCondition = dCondition;
	}

	public int getpCode() {
		return pCode;
	}

	public void setpCode(int pCode) {
		this.pCode = pCode;
	}

	public String getbRecName() {
		return bRecName;
	}

	public void setbRecName(String bRecName) {
		this.bRecName = bRecName;
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

	public String getbRecTel() {
		return bRecTel;
	}

	public void setbRecTel(String bRecTel) {
		this.bRecTel = bRecTel;
	}

	public String getbRecContent() {
		return bRecContent;
	}

	public void setbRecContent(String bRecContent) {
		this.bRecContent = bRecContent;
	}

	public int getwId() {
		return wId;
	}

	public void setwId(int wId) {
		this.wId = wId;
	}

	public String getbBuyCancelDate() {
		return bBuyCancelDate;
	}

	public void setbBuyCancelDate(String bBuyCancelDate) {
		this.bBuyCancelDate = bBuyCancelDate;
	}

	public int getDatediff() {
		return datediff;
	}

	public void setDatediff(int datediff) {
		this.datediff = datediff;
	}

}
