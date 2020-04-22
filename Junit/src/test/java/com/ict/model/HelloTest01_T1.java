package com.ict.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//하나의 클래스의 있는 여러개의 메소드를 한번 테스트 
public class HelloTest01_T1 {
	HelloTest01 t1;
	@Before
	public void testBefore() {
		System.out.println("테스트 이전");
		t1 = new HelloTest01();
	}
	//실제 테스트 메소드
	//블랙 박스 테스트 : 입력값을 넣어서 결과가 예상값과 일치하면 성공
	@Test
	public void test() {
		System.out.println("테스트 1");
		int result = t1.add(10, 30);
		//assertArrayEquals(a,b) : 배열 a와 b가 일치하면 성공
		//assertFalse(a) : a가 거짓이면 성공
		//assertTrue(a) : a가 참이면 성공
		//assertNotNull : 객체가 not null이면 성공
		//assertNull : 객체가 null이면 성공
		//assertSame : 두 객체의 주소가 같으면 (두 객체가 같은 객체이면) 성공
		//assertEquals : 기본 자료형 변수에서 두개의 값이 같으면 성공
		assertEquals(40, result);
	}
	@After
	public void testAfter() {
		System.out.println("테스트 이후");
	}
	
	@Test
	public void test2() {
		System.out.println("Test 2");
		t1.sub(10, 30);
		assertEquals(-20, t1.getRes());
		
	}

}
