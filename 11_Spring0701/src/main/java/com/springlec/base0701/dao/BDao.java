package com.springlec.base0701.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.springlec.base0701.dto.BDto;
import com.springlec.base0701.util.Constant;

public class BDao {
	
//	DataSource dataSource;
	JdbcTemplate template;
	
	
	public BDao() {
		// TODO Auto-generated constructor stub
		this.template = Constant.template;
		
//		try {
//			Context context = new InitialContext();
//			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
//		}catch(Exception e){
//			e.printStackTrace();
//		}
	}
	
	// 초기화면(검색)
	
	public ArrayList<BDto> list(){
		
		String query = "select bId, bName, bTitle, bContent, bDate from mvc_board";
		return (ArrayList<BDto>) template.query(query, new BeanPropertyRowMapper<BDto>(BDto.class));
		
		
		
//		System.out.println("dao");
//		ArrayList<BDto> dtos = null;
//		String query = "select bId, bName, bTitle, bContent, bDate from mvc_board";
//		dtos = (ArrayList<BDto>) template.query(query, new BeanPropertyRowMapper<BDto>(BDto.class));
//		return dtos;
		
		
		
//		ArrayList<BDto> dtos = new ArrayList<BDto>();
//		Connection connection = null;
//		PreparedStatement preparedStatement = null;
//		ResultSet resultSet = null;
//		
//		try {
//			connection = dataSource.getConnection();
//			
//			String query = "select bId, bName, bTitle, bContent, bDate from mvc_board";
//			preparedStatement = connection.prepareStatement(query);
//			resultSet = preparedStatement.executeQuery();
//			
//			while(resultSet.next()) {
//				int bId = resultSet.getInt("bId");
//				String bName = resultSet.getString("bName");
//				String bTitle = resultSet.getString("bTitle");
//				String bContent = resultSet.getString("bContent");
//				Timestamp bDate = resultSet.getTimestamp("bDate");
//				
//				BDto dto = new BDto(bId, bName, bTitle, bContent, bDate);
//				dtos.add(dto);
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				if(resultSet != null) resultSet.close();
//				if(preparedStatement != null) preparedStatement.close();
//				if(connection != null) connection.close();
//			}catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//		return dtos;
	}
	
	
	
	
	
public void write(final String bName, final String bTitle, final String bContent) {
		//final을 사용하는 이유? command에서 넘긴 데이터를 dao에서 바꿀 수 없도록 하기 위함!(보안상의 이유)
		
		// PreparedStatementCreator 사용하여 새로 줄인 문장
		// executeUpdate 안적음 이미 들어있음
		// 보안 때문에 무조건 들어온 data는 final을 사용하여 값을 바꿀 수 없게 함
		this.template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				// TODO Auto-generated method stub
				String query = "insert into mvc_board (bName, bTitle, bContent, bDate) values (?,?,?,now())";
				PreparedStatement preparedStatement = con.prepareStatement(query);
				
				preparedStatement.setString(1, bName);
				preparedStatement.setString(2, bTitle);
				preparedStatement.setString(3, bContent);
				
				return preparedStatement;
				
			}
		});
	
		
		
		
		// 원래 쓰던 문장
//		Connection connection = null;
//		PreparedStatement preparedStatement = null;
//		
//		try {
//			connection = dataSource.getConnection();
//			
//			String query = "insert into mvc_board (bName, bTitle, bContent, bDate) values (?,?,?,now())";
//			preparedStatement = connection.prepareStatement(query);
//			
//			preparedStatement.setString(1, bName);
//			preparedStatement.setString(2, bTitle);
//			preparedStatement.setString(3, bContent);
//			
//			preparedStatement.executeUpdate();
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				if(preparedStatement != null) preparedStatement.close();
//				if(connection != null) connection.close();
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
	}
	
	
	
	
	public BDto contentView(String strID) {
		
		// 사용하기 위해서 bean에서 mysql 순서 맞춰주기!
			String query = "select * from mvc_board where bId = " + Integer.parseInt(strID);
		//하나만 불러올경우 쿼리ㅠㅗ오브젝트 사용
			return template.queryForObject(query, new BeanPropertyRowMapper<BDto>(BDto.class)); // 오브젝트는 데이터 하나짜리 불러오겠다!
		
		
//		BDto dto = null;
//		Connection connection = null;
//		PreparedStatement preparedStatement = null;
//		ResultSet resultset = null;
//		
//		try {
//			connection = dataSource.getConnection();
//			
//			String query = "select * from mvc_board where bId = ?";
//			preparedStatement = connection.prepareStatement(query);
//			preparedStatement.setInt(1, Integer.parseInt(strID));
//			resultset = preparedStatement.executeQuery();
//			
//			if(resultset.next()) {
//				int bId = resultset.getInt("bId");
//				String bName = resultset.getString("bName");
//				String bTitle = resultset.getString("bTitle");
//				String bContent = resultset.getString("bContent");
//				Timestamp bDate = resultset.getTimestamp("bDate");
//				
//				dto = new BDto(bId, bName, bTitle, bContent, bDate);
//				
//			}
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				//정리 다시 거꾸로 정리해주는것
//				if(resultset != null) resultset.close();
//				if(preparedStatement != null) preparedStatement.close();
//				if(connection != null) connection.close();
//			}catch(Exception e){
//				e.printStackTrace();
//				
//			}
//		}
//		return dto;
	}
	
	
	
	
	public void delete(final String strID) {
		String query = "delete from mvc_board where bId = ?";
		this.template.update(query, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				ps.setInt(1, Integer.parseInt(strID));
				
			}
		});
		
		
		
		
		
//		Connection connection = null;
//		PreparedStatement preparedStatement = null;
//		
//		try {
//			connection = dataSource.getConnection();
//			
//			String query = "delete from mvc_board where bId = ?";
//			preparedStatement = connection.prepareStatement(query);
//			preparedStatement.setInt(1, Integer.parseInt(strID));
//			preparedStatement.executeUpdate();
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				//정리 다시 거꾸로 정리해주는것
//				if(preparedStatement != null) preparedStatement.close();
//				if(connection != null) connection.close();
//			}catch(Exception e){
//				e.printStackTrace();
//				
//			}
//		}
	}
//	
	public void modiey(final String bId,final String bName,final String bTitle,final String bContent) {
		
			String query = "update mvc_board set bName = ?, bTitle = ?, bContent = ?, bDate = now() where bId = ?";
		
			this.template.update(query, new PreparedStatementSetter() {
				
				@Override
				//setter의 메소드는 setValue
				public void setValues(PreparedStatement ps) throws SQLException {
					// TODO Auto-generated method stub
					ps.setString(1, bName);
					ps.setString(2, bTitle);
					ps.setString(3, bContent);
					ps.setString(4, bId);
					
				}
			});
		
		
		
//		Connection connection = null;
//		PreparedStatement preparedStatement = null;
//		
//		try {
//			connection = dataSource.getConnection();
//			String query = "update mvc_board set bName = ?, bTitle = ?, bContent = ?, bDate = now() where bId = ?";
//			preparedStatement = connection.prepareStatement(query);
//			
//			preparedStatement.setString(1, bName);
//			preparedStatement.setString(2, bTitle);
//			preparedStatement.setString(3, bContent);
//			preparedStatement.setString(4, bId);
//			
//			preparedStatement.executeUpdate();
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				//정리 다시 거꾸로 정리해주는것
//				if(preparedStatement != null) preparedStatement.close();
//				if(connection != null) connection.close();
//			}catch(Exception e){
//				e.printStackTrace();
//				
//			}
//		}
	}
	

	
} // BDao
