package com.javaex.ex06;

public class Ex03 {

	public static void main(String[] args) {
		
		int a =3; // 문제 없음 //a. 안됨 주소 없음. 그자체 값으로 넣어줘야함// 기본형 참조형 구분
		
		 Integer i = new Integer(3);
		 System.out.println(i.toString());
		 
		Integer sum = new Integer(3) + new Integer(3);
		System.out.println(sum.toString());
		
		Integer v01 =3;
		System.out.println(v01.toString());// 참조타입이라 자동으로 박싱됨. 
		
		
		int v02 = i ;
		System.out.println(v02); //자동 언박싱
		
		/*
		Integer r01 =100;
		int result = r01.parseInt("1234567");
		System.out.println(result +3);
		*/
		
		//문자열 --> 정수 
		int result = Integer.parseInt("12345");
		System.out.println(result +3 );
		
		/*
		String str = "안녕하세요";
		String rsult02 = str.valueOf(555);
		System.out.println(rsult02 +2);
		*/
		
		String result02 = String.valueOf(999);
		System.out.println(result02 +2);
	}
}
