package com.springlec.base0702.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.springlec.base0702.dto.BDto;
import com.springlec.base0702.util.Constant;

public class BDao {

	JdbcTemplate template;
	
	public BDao() {
		this.template = Constant.template;
	}
	
	public ArrayList<BDto> list(){
		
		String query = "SELECT bId, bName, bTitle, bDate from mvc_board";
		return (ArrayList<BDto>) template.query(query, new BeanPropertyRowMapper<BDto>(BDto.class));
	
	}
	
	
	public void write(final String bName, final String bTitle, final String bContent) {
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
	}
	
	
	public void delete (final String strID) {
		String query = "delete from mvc_board where bId =?";
		this.template.update(query, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				ps.setInt(1, Integer.parseInt(strID));
			}
		});
	}
	
	
	
}//=========================