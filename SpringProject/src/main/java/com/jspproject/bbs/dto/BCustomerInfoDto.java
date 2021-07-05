package com.jspproject.bbs.dto;

public class BCustomerInfoDto { // 2021.05.13 조혜지 - 회원 정보 수정 dto
	
	// Field
	String cId;
	String cName;
	String cEmail;
	String cBirth;
	String cTel;
	String cPostalCode;
	String cAddress1;
	String cAddress2;
	
	// Constructor
	public BCustomerInfoDto() {
		// TODO Auto-generated constructor stub
	}

	public BCustomerInfoDto(String cId, String cName, String cEmail, String cBirth, String cTel, String cPostalCode,
			String cAddress1, String cAddress2, String cPassword) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cEmail = cEmail;
		this.cBirth = cBirth;
		this.cTel = cTel;
		this.cPostalCode = cPostalCode;
		this.cAddress1 = cAddress1;
		this.cAddress2 = cAddress2;
	}

	// Method
	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcEmail() {
		return cEmail;
	}

	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}

	public String getcBirth() {
		return cBirth;
	}

	public void setcBirth(String cBirth) {
		this.cBirth = cBirth;
	}

	public String getcTel() {
		return cTel;
	}

	public void setcTel(String cTel) {
		this.cTel = cTel;
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
	
}
