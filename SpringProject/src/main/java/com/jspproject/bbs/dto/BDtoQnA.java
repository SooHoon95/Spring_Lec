package com.jspproject.bbs.dto;

import java.sql.Timestamp;

public class BDtoQnA {
	
	int qnaCode;
	String customer_cId;
	String qTitle;
	String qContent;
	String qAddDate;
	String aAddDate;
	String aContent;
	String answer;
	String qFilePath;
	String cId;
	String sId;
	String bCondition;
	String bNumber;
	String qAnswerStatus;
	String cName;
	String aTitle;
	String pName;
	Timestamp aDeleteDate;
	String qnACode;
	
	
	public BDtoQnA() {
		// TODO Auto-generated constructor stub
	}

	public BDtoQnA(String qnACode, String customer_cId, String qTitle, String qContent, String qAddDate, String aAddDate,
			String aContent, String answer, String qFilePath) {
		super();
		this.qnACode = qnACode;
		this.customer_cId = customer_cId;
		this.qTitle = qTitle;
		this.qContent = qContent;
		this.qAddDate = qAddDate;
		this.aAddDate = aAddDate;
		this.aContent = aContent;
		this.answer = answer;
		this.qFilePath = qFilePath;
	}
	
	public BDtoQnA(String cId, String sId, String bCondition, String qContent, String qAddDate, String bNumber) {
		super();
		this.cId = cId;
		this.sId = sId;
		this.bCondition = bCondition;
		this.qContent = qContent;
		this.qAddDate = qAddDate;
		this.bNumber = bNumber;
	}

	public BDtoQnA(int qnaCode, String qAddDate, String bNumber, String qTitle, String qAnswerStatus) {
		super();
		this.qnaCode = qnaCode;
		this.qAddDate = qAddDate;
		this.bNumber = bNumber;
		this.qTitle = qTitle;
		this.qAnswerStatus = qAnswerStatus;
	}

	public BDtoQnA(String qAddDate, String qTitle, String qAnswerStatus) {
		super();
		this.qAddDate = qAddDate;
		this.qTitle = qTitle;
		this.qAnswerStatus = qAnswerStatus;
	}

	public BDtoQnA(String qContent, String qAddDate, String bNumber, String qTitle, String cName, String aContent,
			String pName) {
		super();
		this.qContent = qContent;
		this.qAddDate = qAddDate;
		this.bNumber = bNumber;
		this.qTitle = qTitle;
		this.cName = cName;
		this.aContent = aContent;
		this.pName = pName;
	}

	public BDtoQnA(String qnACode, String qContent, String qAddDate, String bNumber, String qTitle, String qAnswerStatus,
			String cName, String aContent, Timestamp aDeleteDate, String aAddDate) {
		super();
		this.qnACode = qnACode;
		this.qContent = qContent;
		this.qAddDate = qAddDate;
		this.bNumber = bNumber;
		this.qTitle = qTitle;
		this.qAnswerStatus = qAnswerStatus;
		this.cName = cName;
		this.aContent = aContent;
		this.aDeleteDate = aDeleteDate;
		this.aAddDate = aAddDate;
	}

	
	public BDtoQnA(String qnACode, String qTitle, String qAddDate, String qAnswerStatus) {
		super();
		this.qTitle = qTitle;
		this.qAddDate = qAddDate;
		this.qnACode = qnACode;
		this.qAnswerStatus = qAnswerStatus;
	}

	public int getQnaCode() {
		return qnaCode;
	}

	public void setQnaCode(int qnaCode) {
		this.qnaCode = qnaCode;
	}

	public String getCustomer_cId() {
		return customer_cId;
	}

	public void setCustomer_cId(String customer_cId) {
		this.customer_cId = customer_cId;
	}

	public String getqTitle() {
		return qTitle;
	}

	public void setqTitle(String qTitle) {
		this.qTitle = qTitle;
	}

	public String getqContent() {
		return qContent;
	}

	public void setqContent(String qContent) {
		this.qContent = qContent;
	}

	public String getqAddDate() {
		return qAddDate;
	}

	public void setqAddDate(String qAddDate) {
		this.qAddDate = qAddDate;
	}

	public String getaAddDate() {
		return aAddDate;
	}

	public void setaAddDate(String aAddDate) {
		this.aAddDate = aAddDate;
	}

	public String getaContent() {
		return aContent;
	}

	public void setaContent(String aContent) {
		this.aContent = aContent;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getqFilePath() {
		return qFilePath;
	}

	public void setqFilePath(String qFilePath) {
		this.qFilePath = qFilePath;
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

	public String getbCondition() {
		return bCondition;
	}

	public void setbCondition(String bCondition) {
		this.bCondition = bCondition;
	}

	public String getbNumber() {
		return bNumber;
	}

	public void setbNumber(String bNumber) {
		this.bNumber = bNumber;
	}

	public String getqAnswerStatus() {
		return qAnswerStatus;
	}

	public void setqAnswerStatus(String qAnswerStatus) {
		this.qAnswerStatus = qAnswerStatus;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getaTitle() {
		return aTitle;
	}

	public void setaTitle(String aTitle) {
		this.aTitle = aTitle;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Timestamp getaDeleteDate() {
		return aDeleteDate;
	}

	public void setaDeleteDate(Timestamp aDeleteDate) {
		this.aDeleteDate = aDeleteDate;
	}

	public String getQnACode() {
		return qnACode;
	}

	public void setQnACode(String qnACode) {
		this.qnACode = qnACode;
	}
	
}
