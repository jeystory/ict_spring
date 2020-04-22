package com.ict.ex02;

public class PersonProxy {
    private Person person;
    private Before before;
    private After after ;
    
	public Before getBefore() {	return before;	}
	public void setBefore(Before before) {		this.before = before;	}
	public After getAfter() {		return after;	}
	public void setAfter(After after) {		this.after = after;	}
	public Person getPerson() {		return person;	}
	public void setPerson(Person person) {		this.person = person;	}
	
	public void Play() {
		before.pre();                              // 공통관심   
		try {
			person.doSometing();                   // 핵심관심
			person.doPlaying();                   // 핵심관심
	   	//  Integer.parseInt("s");                // 강제로 예외처리 
		} catch (Exception e) {
		   System.out.println("컴퓨터를 종료한다.");
		} finally {
			after.next();                         // 공통관심   
		}
	
	}
}
