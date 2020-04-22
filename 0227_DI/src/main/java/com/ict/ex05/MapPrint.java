package com.ict.ex05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapPrint {
	Map<String, String> map1 = new HashMap<String, String>();
	Map<Integer, String> map2 = new HashMap<Integer, String>();
	

	public Map<String, String> getMap1() {
		return map1;
	}




	public void setMap1(Map<String, String> map1) {
		this.map1 = map1;
	}




	public Map<Integer, String> getMap2() {
		return map2;
	}




	public void setMap2(Map<Integer, String> map2) {
		this.map2 = map2;
	}




	public void input() {
		map1.put("id", "aaaa");
		map1.put("pw", "1111");
		map1.put("name", "희동이");
		map1.put("age", "5");
		map1.put("addr", "seoul");
		
		map2.put(1, "cccc");
		map2.put(2, "3333");
		map2.put(3, "둘리");
		map2.put(4, "1000");
		map2.put(5, "south pole");
	}
	
	public void s_print() {
		Iterator<String> it = map1.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(map1.get(key));
		}
	
	}
	
	public void i_print() {
		Iterator<Integer> it = map2.keySet().iterator();
		
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println(map2.get(key));
		}
	}
}
