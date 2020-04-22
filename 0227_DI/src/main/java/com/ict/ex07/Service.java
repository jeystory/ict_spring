package com.ict.ex07;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// @Component("myService") : 아이디
@Component("myService")
//@org.springframework.stereotype.Service("myService")
public class Service {
	// 1.참조하는 클래스 id와 변수 이름이 같을 경우
	//@Autowired
	
	// 2. 참조하는 클래스 id와 변수 이름이 다른 경우 
	//@Autowired
	//@Qualifier("mySqlDAO")
	// @Autowired +  @Qualifier("oracleDAO") 을 한번에 처리 
	@Resource(name="mySqlDAO")
	private DAO dao ;
	
	public Service() {
		System.out.println("service 생성자");
	}

	public Service(DAO dao) {
		this.dao = dao;
		System.out.println("service 생성자");
	}

	public DAO getDao() {
		return dao;
	}

	public void setDao(DAO dao) {
		this.dao = dao;
	}
	
	// 메인에서 실행하고 싶은 메소드 
	public void biz() {
		
		dao.prn();
		
	}
}
