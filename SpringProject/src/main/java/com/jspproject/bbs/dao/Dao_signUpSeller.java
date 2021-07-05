package com.jspproject.bbs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class Dao_signUpSeller {
	DataSource dataSource;
	
	public Dao_signUpSeller() {
		try {
			/*javax.naming*/
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Market"); //env까지 쓴거만 보면 context에 들어간 거/저 경로로 가서 찾아와라 라는 뜻
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void writeSeller(String sId , String sPw, String sName, String sBirth, String sTel, String sAddress1, String sAddress2, String sEmail, String sShopName, String sNumber, String sPostalCode)	{
		//java.sql
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
		
			String A = "insert into seller (sId, sPw, sName, sBirth, sTel, sAddress1, sAddress2, sEmail, sShopName, sNumber, sPostalCode, sJoinDate";
			String B = ") values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, now())";
			
			preparedStatement = connection.prepareStatement(A+B);
			
			preparedStatement.setString(1, sId);
			preparedStatement.setString(2, sPw);
			preparedStatement.setString(3, sName);
			preparedStatement.setString(4, sBirth);
			preparedStatement.setString(5, sTel);
			preparedStatement.setString(6, sAddress1);
			preparedStatement.setString(7, sAddress2);
			preparedStatement.setString(8, sEmail);
			preparedStatement.setString(9, sShopName);
			preparedStatement.setString(10, sNumber);
			preparedStatement.setString(11, sPostalCode);
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
