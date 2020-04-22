package com.ict.ex07;

import org.springframework.stereotype.Component;

//@Component("dao")
@Component("OracleDAO")
public class OracleDAO implements DAO{
	public OracleDAO() {
		System.out.println("OracleDAO 생성자");
	}
	
	@Override
	public void prn() {
		System.out.println("OracleDAO 메소드");
	}
}
