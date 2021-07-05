package com.jspproject.bbs.dto;

import java.sql.Timestamp;

public class BDtoBuy {
	String bNumber;
	String cId;
	int pCode;
	String pCategory;
	String pName;
	String pPrice;
	String pExpirationDate;
	String pQuantity;
	String pStatus;
	String pDelete;
	String bState;
	String bCancel;
	String bReviewContent;
	int bReviewScore;
	Timestamp bDate;
	Timestamp bReviewRegistrationDate;
	Timestamp bReviewEditDate;
	Timestamp bReviewCancelDate;
	Timestamp bCancelDate;
	String buyCancel;
	String bBuyDate;
	Timestamp bBuyCancelDate;
	Timestamp bReviewWriteDate;
	Timestamp bReviewDeleteDate;
	String cName;
	String cTel;
	int bQuantity;
	
	
	
	public BDtoBuy() {
		// TODO Auto-generated constructor stub
	}

	public BDtoBuy(String bNumber, String cId, int pCode, String pCategory, String pName, String pPrice,
			String pExpirationDate, String pQuantity, String pStatus, String pDelete, String bState, String bCancel) {
		super();
		this.bNumber = bNumber;
		this.cId = cId;
		this.pCode = pCode;
		this.pCategory = pCategory;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pExpirationDate = pExpirationDate;
		this.pQuantity = pQuantity;
		this.pStatus = pStatus;
		this.pDelete = pDelete;
		this.bState = bState;
		this.bCancel = bCancel;
	}
	
	

	public BDtoBuy(String bNumber, String pCategory, String pName, String buyCancel, String bBuyDate) {
		super();
		this.bNumber = bNumber;
		this.pCategory = pCategory;
		this.pName = pName;
		this.buyCancel = buyCancel;
		this.bBuyDate = bBuyDate;
	}

	public BDtoBuy(String bNumber, String pCategory, String pName, String bState, String bReviewContent, int bReviewScore,
			Timestamp bDate, Timestamp bReviewRegistrationDate, Timestamp bReviewEditDate, Timestamp bReviewCancelDate,
			Timestamp bCancelDate) {
		super();
		this.bNumber = bNumber;
		this.pCategory = pCategory;
		this.pName = pName;
		this.bState = bState;
		this.bReviewContent = bReviewContent;
		this.bReviewScore = bReviewScore;
		this.bDate = bDate;
		this.bReviewRegistrationDate = bReviewRegistrationDate;
		this.bReviewEditDate = bReviewEditDate;
		this.bReviewCancelDate = bReviewCancelDate;
		this.bCancelDate = bCancelDate;
	}

	
	

	public BDtoBuy(String pCategory, String pName, String buyCancel, int bQuantity) {
		super();
		this.pCategory = pCategory;
		this.pName = pName;
		this.buyCancel = buyCancel;
		this.bQuantity = bQuantity;
	}

	public BDtoBuy(String bNumber, String cId, String bReviewContent, int bReviewScore, String buyCancel,
			String bBuyDate, Timestamp bReviewWriteDate, Timestamp bReviewDeleteDate, String cName, String cTel) {
		super();
		this.bNumber = bNumber;
		this.cId = cId;
		this.bReviewContent = bReviewContent;
		this.bReviewScore = bReviewScore;
		this.buyCancel = buyCancel;
		this.bBuyDate = bBuyDate;
		this.bReviewWriteDate = bReviewWriteDate;
		this.bReviewDeleteDate = bReviewDeleteDate;
		this.cName = cName;
		this.cTel = cTel;
	}

	public BDtoBuy(String bNumber, String pCategory, String pName, String bReviewContent, int bReviewScore,
			String bBuyDate, Timestamp bBuyCancelDate, Timestamp bReviewWriteDate, Timestamp bReviewDeleteDate, String buyCancel) {
		super();
		this.bNumber = bNumber;
		this.pCategory = pCategory;
		this.pName = pName;
		this.bReviewContent = bReviewContent;
		this.bReviewScore = bReviewScore;
		this.bBuyDate = bBuyDate;
		this.bBuyCancelDate = bBuyCancelDate;
		this.bReviewWriteDate = bReviewWriteDate;
		this.bReviewDeleteDate = bReviewDeleteDate;
		this.buyCancel = buyCancel;
	}

	public String getbNumber() {
		return bNumber;
	}

	public void setbNumber(String bNumber) {
		this.bNumber = bNumber;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

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

	public String getpExpirationDate() {
		return pExpirationDate;
	}

	public void setpExpirationDate(String pExpirationDate) {
		this.pExpirationDate = pExpirationDate;
	}

	public String getpQuantity() {
		return pQuantity;
	}

	public void setpQuantity(String pQuantity) {
		this.pQuantity = pQuantity;
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

	public String getbState() {
		return bState;
	}

	public void setbState(String bState) {
		this.bState = bState;
	}

	public String getbCancel() {
		return bCancel;
	}

	public void setbCancel(String bCancel) {
		this.bCancel = bCancel;
	}

	public String getbReviewContent() {
		return bReviewContent;
	}

	public void setbReviewContent(String bReviewContent) {
		this.bReviewContent = bReviewContent;
	}

	public int getbReviewScore() {
		return bReviewScore;
	}

	public void setbReviewScore(int bReviewScore) {
		this.bReviewScore = bReviewScore;
	}

	public Timestamp getbDate() {
		return bDate;
	}

	public void setbDate(Timestamp bDate) {
		this.bDate = bDate;
	}

	public Timestamp getbReviewRegistrationDate() {
		return bReviewRegistrationDate;
	}

	public void setbReviewRegistrationDate(Timestamp bReviewRegistrationDate) {
		this.bReviewRegistrationDate = bReviewRegistrationDate;
	}

	public Timestamp getbReviewEditDate() {
		return bReviewEditDate;
	}

	public void setbReviewEditDate(Timestamp bReviewEditDate) {
		this.bReviewEditDate = bReviewEditDate;
	}

	public Timestamp getbReviewCancelDate() {
		return bReviewCancelDate;
	}

	public void setbReviewCancelDate(Timestamp bReviewCancelDate) {
		this.bReviewCancelDate = bReviewCancelDate;
	}

	public Timestamp getbCancelDate() {
		return bCancelDate;
	}

	public void setbCancelDate(Timestamp bCancelDate) {
		this.bCancelDate = bCancelDate;
	}

	public String getBuyCancel() {
		return buyCancel;
	}

	public void setBuyCancel(String buyCancel) {
		this.buyCancel = buyCancel;
	}

	public String getbBuyDate() {
		return bBuyDate;
	}

	public void setbBuyDate(String bBuyDate) {
		this.bBuyDate = bBuyDate;
	}

	public Timestamp getbBuyCancelDate() {
		return bBuyCancelDate;
	}

	public void setbBuyCancelDate(Timestamp bBuyCancelDate) {
		this.bBuyCancelDate = bBuyCancelDate;
	}

	public Timestamp getbReviewWriteDate() {
		return bReviewWriteDate;
	}

	public void setbReviewWriteDate(Timestamp bReviewWriteDate) {
		this.bReviewWriteDate = bReviewWriteDate;
	}

	public Timestamp getbReviewDeleteDate() {
		return bReviewDeleteDate;
	}

	public void setbReviewDeleteDate(Timestamp bReviewDeleteDate) {
		this.bReviewDeleteDate = bReviewDeleteDate;
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

	public int getbQuantity() {
		return bQuantity;
	}

	public void setbQuantity(int bQuantity) {
		this.bQuantity = bQuantity;
	}
	
	
	
	
}
