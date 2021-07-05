package com.springlec.base0802.dto;

public class ContentDto {

	private int mId;
	private String mName;
	private String mContent;
	private String mAddress;
	private String mEmail;
	private String mRelation;
	
	public ContentDto() {
		// TODO Auto-generated constructor stub
	}

	public ContentDto(int mId, String mName, String mContent, String mAddress, String mEmail, String mRelation) {
		super();
		this.mId = mId;
		this.mName = mName;
		this.mContent = mContent;
		this.mAddress = mAddress;
		this.mEmail = mEmail;
		this.mRelation = mRelation;
	}
	
	
	//Getters and Stters

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmContent() {
		return mContent;
	}

	public void setmContent(String mContent) {
		this.mContent = mContent;
	}

	public String getmAddress() {
		return mAddress;
	}

	public void setmAddress(String mAddress) {
		this.mAddress = mAddress;
	}

	public String getmEmail() {
		return mEmail;
	}

	public void setmEmail(String mEmail) {
		this.mEmail = mEmail;
	}

	public String getmRelation() {
		return mRelation;
	}

	public void setmRelation(String mRelation) {
		this.mRelation = mRelation;
	}




}
