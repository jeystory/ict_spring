package com.ict.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class DAO {
	// Oracle에 접근하기 위한 정보를 가지고 있는 클래스
	// 쿼리를 사용할 수 있는 클래스
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
	public List<VO>  getList(){
		String sql = "select * from members order by idx";
		return jdbcTemplate.query(sql, new RowMapper() {
			
			@Override
			public VO mapRow(ResultSet rs, int rowNum) throws SQLException {
				VO vo = new VO();
				vo.setIdx(rs.getString("idx"));
				vo.setId(rs.getString("id"));
				vo.setPassword(rs.getString("password"));
				vo.setName(rs.getString("name"));
				vo.setAge(rs.getString("age"));
				vo.setAddr(rs.getString("addr"));
				return vo;
			}
		});
	}
	
	// 삽입 
	// insert, delete, update는 jdbcTamplate.update(sql, ? 대신 들어갈 데이터)
	public int getWrite(VO vo) {
		int result = 0;
		
		try {
			String sql = "insert into members values(?,?,?,?,?,?)";
			result = jdbcTemplate.update(sql, vo.getIdx(), vo.getId(), vo.getPassword(), vo.getName(), vo.getAge(), vo.getAddr());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return result;
	}
	
	// 한명의 정보 상세보기(select에 where조건이 있는 경우)
	public List<VO> getOneList(String idx){
		
		String sql = "select * from members where idx = ?";
		return jdbcTemplate.query(sql, new RowMapper() {
			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				VO vo = new VO();
				vo.setIdx(rs.getString("idx"));
				vo.setId(rs.getString("id"));
				vo.setPassword(rs.getString("password"));
				vo.setName(rs.getString("name"));
				vo.setAge(rs.getString("age"));
				vo.setAddr(rs.getString("addr"));
				return vo;
			}
		}, idx);	//조건이 있을 경우에 조건을 넣어주는 부분만 다름
	}
	
	public int getDelete(String idx) {
		int result = 0;
		
		
			String sql = "delete from members where idx=?";
			result = jdbcTemplate.update(sql, idx);
		
		return result;
	}

}
