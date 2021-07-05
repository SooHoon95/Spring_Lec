package com.jspproject.bbs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jspproject.bbs.util.Share;

public class Dao_findPwAction {

DataSource dataSource;
	
	public Dao_findPwAction() {
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
	
	
	public int findcPw(String inputId, String inputName, String inputEmail, int findchk) {
		

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select cPw from customer where cId= '" + inputId + 
							"' and cName='" + inputName + "' and cEmail='" + inputEmail + "'";
			
			preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			findchk = 0; // 찾기 결과 없음
			
			while (resultSet.next()) {
				String findPw = resultSet.getString(1);
				findchk = 1;
				System.out.println(findPw);
				Share.findPw = findPw;
			}
			System.out.println("다오 테스트" + Share.findId);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (preparedStatement != null) preparedStatement.close();
				if (connection!= null) connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return findchk;
	}
	
		
	
	
	public int findsPw(String inputId, String inputName, String inputEmail, int findchk) {
		

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select ㄴPw from seller where sId= '" + inputId + 
					"' and sName='" + inputName + "' and sEmail='" + inputEmail + "'";
			
			preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			findchk = 0; // 찾기 결과 없음
			
			while (resultSet.next()) {
				String findPw = resultSet.getString(1);
				findchk = 1;
				System.out.println(findPw);
				Share.findPw = findPw;
			}
			System.out.println("다오 테스트" + Share.findId);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (preparedStatement != null) preparedStatement.close();
				if (connection!= null) connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return findchk;
	}
	
}
