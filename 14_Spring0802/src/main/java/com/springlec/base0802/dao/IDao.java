package com.springlec.base0802.dao;

import java.util.ArrayList;

import com.springlec.base0802.dto.ContentDto;

public interface IDao {

	//전체검색
	public ArrayList<ContentDto> listDao();
	//자세히 보기
	public ContentDto contentDao(int mId);
	//추가
	public void writeDao(String mName, String mContent, String mAddress, String mEmail, String mRelation);
	//삭제
	public void deleteDao(int mId);
	//수정하기	
	public void modifyDao(String mName, String mContent, String mAddress, String mEmail, String mRelation, int mId);
	//조건 검색
	public ArrayList<ContentDto> listQuery(String query, String content); //어떤 쿼리 썼는지, 뭐라고 검색했는지
	
}
