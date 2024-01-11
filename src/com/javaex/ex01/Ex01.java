package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {
	
		Object obj = new Object();
		
		System.out.println(obj.getClass());//클래스 정보
		System.out.println(obj.toString());//기본값 출력.java.lang.Object@58ceff1
		System.out.println(obj.hashCode());//주소. 일단 주소라고 알자
		System.out.println(obj.equals(obj));//비교

		System.out.println("=================================");
		
		//클래스 정보
		System.out.println(obj.getClass());
		
		//obj.toString()
		System.out.println(obj.toString());//클래스 정보		
		System.out.println(obj);//클래스 정보
		
		//hashCode()
		Object ob01 = new Object();
		Object ob02 = new Object();
		Object ob03 = new Object();
		
		System.out.println(ob01.hashCode());
		System.out.println(ob02.hashCode());
		System.out.println(ob03.hashCode());
		
		//equals()
		System.out.println(ob01.equals(ob01));
		System.out.println(ob01.equals(ob02));
		
		System.out.println(ob01==ob01);
		System.out.println(ob01==ob03);
	}

}
