package com.ict.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class DAO {
	Connection conn;
	private JdbcTemplate jdbcTemplate;

	public DAO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public DAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//JdbcTamplet 사용법은 select만 문법이 틀리고 나머지는 PreparedStatement 사용법과 같다.
	// list : select의 결과는 무조건 List<VO> (return이 하나든 여러개든 상관없이 )
	public List<VO> getList() {
		List<VO> list = null;
		
		try {
			String sql = "select * from guestbook2 order by idx";
			list =  jdbcTemplate.query(sql, new RowMapper() {
				@Override
				public VO mapRow(ResultSet rs, int rowNum) throws SQLException {
					VO vo = new VO();
					vo.setIdx(rs.getString(1));
					vo.setName(rs.getString(2));
					vo.setSubject(rs.getString(3));
					vo.setContent(rs.getString(4));
					vo.setEmail(rs.getString(5));
					vo.setPwd(rs.getString(6));
					vo.setFile_name(rs.getString(7));
					vo.setRegdate(rs.getString(8));
					return vo;
				}
			});
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return list;
		
	}
	
	// 삽입
	// insert, delete, update는 jdbcTamplate.update(sql, ? 대신 들어갈 데이터)
	/*
	public int getInsert(VO vo) {
		int result = 0;
		try {
			System.out.println("DAO file" + vo.getFile_name());
			String sql = "insert into guestbook2 values(guestbook2_seq.nextval,?,?,?,?,?,?,sysdate)";
			result = jdbcTemplate.update(sql, vo.getName(), vo.getSubject(), vo.getContent(), vo.getEmail(),
					vo.getPwd(),vo.getFile_name());
				
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;

	}
	*/
	
	public int getInsert(VO2 vo) {
		int result = 0;
		try {
			String sql = "insert into guestbook2 values(guestbook2_seq.nextval,?,?,?,?,?,?,sysdate)";
			result = jdbcTemplate.update(sql, vo.getName(), vo.getSubject(), vo.getContent(), vo.getEmail(),
					vo.getPwd(),vo.getFile_name());
				
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}

	// 상세보기
	public List<VO> getOneList(String idx) {
		List<VO> list = null;
		String sql = "select * from guestbook2 where idx = ?";

		try {
			list = jdbcTemplate.query(sql, new RowMapper() {
				@Override
				public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
					VO vo = new VO();
					vo.setIdx(rs.getString(1));
					vo.setName(rs.getString(2));
					vo.setSubject(rs.getString(3));
					vo.setContent(rs.getString(4));
					vo.setEmail(rs.getString(5));
					vo.setPwd(rs.getString(6));
					vo.setFile_name(rs.getString(7));
					vo.setRegdate(rs.getString(8));
					return vo;
				}
			}, idx); // 조건이 있을 경우에 조건을 넣어주는 부분만 다름
		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;
	}
	
	  
	// 삭제
	public int  getDelete(String idx) {
		int result = 0;
		String sql = "delete from guestbook2 where idx = ? ";
		result = jdbcTemplate.update(sql, idx);
		
		return result;
	}
		
	public int getUpdate(VO2 vo) {
		int result = 0 ;
		try {
			String sql = "update guestbook2 set name=?, subject=?, "
					+ "content=?, email=?, f_name=? where idx= ?" ;
			result = jdbcTemplate.update(sql, vo.getName(), vo.getSubject(), vo.getContent(),
					vo.getEmail(), vo.getFile_name(), vo.getIdx());
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		return result;
	}
}
