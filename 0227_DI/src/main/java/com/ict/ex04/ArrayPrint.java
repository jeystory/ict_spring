package com.ict.ex04;

public class ArrayPrint {
	public String[] arr1 = {"100", "200", "300", "400"};
	public int[] arr2 = {100,200,300,400};
	
	public ArrayPrint() {
		// TODO Auto-generated constructor stub
	}
		
	public ArrayPrint(String[] arr1, int[] arr2) {
		super();
		this.arr1 = arr1;
		this.arr2 = arr2;
	}

	public String[] getArr1() {
		return arr1;
	}

	public void setArr1(String[] arr1) {
		this.arr1 = arr1;
	}

	public int[] getArr2() {
		return arr2;
	}

	public void setArr2(int[] arr2) {
		this.arr2 = arr2;
	}

	public void s_prn() {
		for (String k : arr1) {
			System.out.println(k +10);
		}
	}
	
	public void p_prn() {
		for(int k : arr2) {
			System.out.println(k+10);
		}
	}	
}
