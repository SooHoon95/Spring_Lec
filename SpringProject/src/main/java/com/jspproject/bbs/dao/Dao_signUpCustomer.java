package com.jspproject.bbs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class Dao_signUpCustomer {
	DataSource dataSource;
	
	public Dao_signUpCustomer() {
		try {
			/*javax.naming*/
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Market"); //env까지 쓴거만 보면 context에 들어간 거/저 경로로 가서 찾아와라 라는 뜻
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void writeCustomer(String cId, String cPw, String cName, String cBirth, String cTel, String cAddress1, String cAddress2, String cEmail, String cPostalCode)	{
		//java.sql
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
		
			String A = "insert into customer (cId, cPw, cName, cBirth, cTel, cAddress1, cAddress2, cEmail, cPostalCode, cJoinDate";
			String B = ") values(?, ?, ?, ?, ?, ?, ?, ?, ?, now())";
			
			preparedStatement = connection.prepareStatement(A+B);
			
			preparedStatement.setString(1, cId);
			preparedStatement.setString(2, cPw);
			preparedStatement.setString(3, cName);
			preparedStatement.setString(4, cBirth);
			preparedStatement.setString(5, cTel);
			preparedStatement.setString(6, cAddress1);
			preparedStatement.setString(7, cAddress2);
			preparedStatement.setString(8, cEmail);
			preparedStatement.setString(9, cPostalCode);
			preparedStatement.executeUpdate();
			
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
	}
}
