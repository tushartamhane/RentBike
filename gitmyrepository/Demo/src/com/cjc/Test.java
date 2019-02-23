package com.cjc;

public class Test {
	
	int i=10;
	static int y=20;
	
	public void m1() {
		
		System.out.println("Hello welcome");
	}
	
	static {
		
		System.out.println("Sumit sawant");
		
	}
	
	public static void main(String[] args) {
		
		Test t=new Test();
		t.m1();
		
		System.out.println(y);
	}

}
