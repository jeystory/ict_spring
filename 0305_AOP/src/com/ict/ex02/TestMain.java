package com.ict.ex02;

public class TestMain {
	public static void main(String[] args) {
		Boy boy = new Boy();
		Girl girl = new Girl();
	    Before before = new Before();
	    After after =  new After();
		
	    PersonProxy proxy = new PersonProxy();
		proxy.setPerson(boy);
		
		proxy.setBefore(before);
		proxy.setAfter(after);
		
		// proxy.setBefor(new Before());
		// proxy.setAfter(new After());
		
		proxy.Play();
	}
}
