package com.jspproject.bbs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jspproject.bbs.util.Share;

public class Dao_findIdAction {
	DataSource dataSource;
	
	public Dao_findIdAction() {
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
	
	
	public int findcId(String findName, String findEmail, int findchk) {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select cId from customer where cName='" + findName + "' and cEmail='" + findEmail + "'";
			
			preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			findchk = 0; // 찾기 결과 없음
			
			while (resultSet.next()) {
				String findId = resultSet.getString(1);
				findchk = 1;
				System.out.println(findId);
				Share.findId = findId;
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
	
	
	public int findsId(String findName, String findEmail, int findchk) {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select sId from seller where sName='" + findName + "' and sEmail='" + findEmail + "'";
			
			preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			findchk = 0; // 찾기 결과 없음
			
			while (resultSet.next()){
				String findId = resultSet.getString(1);
				findchk = 1; // 찾기 결과 있음
				Share.findId = findId;
			}
			System.out.println("다오테스트" + Share.findId);
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
