package com.jspproject.bbs.dto;

public class BDtoReview {
	
	String bReviewContent;
	int bReviewScore;
	String bReviewWriteDate;
	String customer_cId;
	String rFilePath;
	// 평균별점
	String star;
	// 리뷰 갯수
	int count;
	
	
	
	public BDtoReview() {
		// TODO Auto-generated constructor stub
	}
	//리뷰 리스트
	public BDtoReview(String bReviewContent, int bReviewScore, String bReviewWriteDate, String customer_cId,
			String rFilePath) {
		super();
		this.bReviewContent = bReviewContent;
		this.bReviewScore = bReviewScore;
		this.bReviewWriteDate = bReviewWriteDate;
		this.customer_cId = customer_cId;
		this.rFilePath = rFilePath;
	}
	// 평균 별점, 리뷰 갯수
	public BDtoReview(String star, int count) {
		super();
		this.star = star;
		this.count = count;
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
	public String getbReviewWriteDate() {
		return bReviewWriteDate;
	}
	public void setbReviewWriteDate(String bReviewWriteDate) {
		this.bReviewWriteDate = bReviewWriteDate;
	}
	public String getCustomer_cId() {
		return customer_cId;
	}
	public void setCustomer_cId(String customer_cId) {
		this.customer_cId = customer_cId;
	}
	public String getStar() {
		return star;
	}
	public void setStar(String star) {
		this.star = star;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getrFilePath() {
		return rFilePath;
	}
	public void setrFilePath(String rFilePath) {
		this.rFilePath = rFilePath;
	}
	
}
