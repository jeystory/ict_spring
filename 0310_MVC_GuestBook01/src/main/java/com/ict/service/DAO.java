package com.ict.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

// DB처리하는 클래스
public class DAO {
	
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
	public List<VO> getList(){
		
			String sql = "select * from guestbook order by idx";
			return jdbcTemplate.query(sql, new RowMapper() {
				@Override
				public VO mapRow(ResultSet rs, int rowNum) throws SQLException {
					VO vo = new VO();
					vo.setIdx(rs.getString(1));
					vo.setName(rs.getString(2));
					vo.setSubject(rs.getString(3));
					vo.setContent(rs.getString(4));
					vo.setEmail(rs.getString(5));
					vo.setPwd(rs.getString(6));
					vo.setRegdate(rs.getString(7));		
					return vo;
				}
			});		
	}
	
	// 삽입 
	// insert, delete, update는 jdbcTamplate.update(sql, ? 대신 들어갈 데이터)
	public int getWrite(VO vo) {
		int result = 0 ;
		try {		
			String sql = "insert into guestbook values(guestbook_seq.nextval,?,?,?,?,?,sysdate)";
			result = jdbcTemplate.update(sql, vo.getName(), vo.getSubject(), vo.getContent() , vo.getEmail(), vo.getPwd());
		}catch (Exception e) {
			// TODO: handle exception
		}
		return result;
			
	}
	
	public int getUpdate(VO vo) {
		int result = 0 ;
		try {
			String sql = "update guestbook set name=?, subject=?, content=?, email=? where idx=?";
			result = jdbcTemplate.update(sql, vo.getName(), vo.getSubject(), vo.getContent() , vo.getEmail(), vo.getIdx());
			
		} catch (Exception e) {
		}
		return result;
		
	}
		
	// 상세보기
	public List<VO> getOneList(String idx) {
		String sql = "select * from guestbook where idx = ?";
		return jdbcTemplate.query(sql, new RowMapper() {
			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				VO vo = new VO();
				vo.setIdx(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setSubject(rs.getString(3));
				vo.setContent(rs.getString(4));
				vo.setEmail(rs.getString(5));
				vo.setPwd(rs.getString(6));
				vo.setRegdate(rs.getString(7));
				return vo;
			}
		}, idx);	//조건이 있을 경우에 조건을 넣어주는 부분만 다름
	}
	//삭제
	public void getDelete(String idx) {
					
		String sql = "delete from guestbook where idx=?";
		jdbcTemplate.update(sql, idx);
	}
	
}





