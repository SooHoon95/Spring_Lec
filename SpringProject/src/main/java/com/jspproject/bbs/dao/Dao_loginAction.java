package com.jspproject.bbs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jspproject.bbs.util.Share;

public class Dao_loginAction {
DataSource dataSource;
	
	public Dao_loginAction() {
		// TODO Auto-generated constructor stub
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Market");
			// 이제 데이터 베이스 연결한 것
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}
	
	public int customerLoginAction(String loginId,  String loginPw, int loginChk) {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select cId, cPw from customer where cId= '" + loginId + "' and cPw= '" + loginPw + "'";
			
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			loginChk = 0; // DB확인 결과 아이디 없음

			while (resultSet.next()){
				loginChk = 1;	// 아이디 있음
				Share.userId = loginId;
				Share.userPw = loginPw;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (preparedStatement != null) preparedStatement.close();
				if (connection!= null) connection.close();
				if (resultSet != null) resultSet.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return loginChk;
	}
	
	
	public int sellerLoginAction(String loginId,  String loginPw, int loginChk) {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select sId, sPw from seller where sId= '" + loginId + "' and sPw= '" + loginPw + "'";
			
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			loginChk = 0; // DB확인 결과 아이디 없음
			
			while (resultSet.next()){
				loginChk = 1;
				Share.userId = loginId;
				Share.userPw = loginPw;

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (preparedStatement != null) preparedStatement.close();
				if (connection!= null) connection.close();
				if (resultSet != null) resultSet.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return loginChk;
	}
}
