package com.javaex.ex06;

public class Ex02 {

	public static void main(String[] args) {
	
		
		String a = new String(" abcd");
		String b = new String(", efg ");
		
		/*
		System.out.println(a.concat(b));
		System.out.println(b.concat(a));
		System.out.println(a+b);
		System.out.println(b+a);
		*/
		
		System.out.println(a.concat(b));
		a = a.concat(b);
		System.out.println(a);
		
		a = a.trim(); //가장자리 공백을 없애주는 기능 //Ex)회원가입시 공백 없애줄 수 o
		System.out.println(a);
		
		a = a.replace("ab", "12");// 앞의 것을 뒤의 것으로 대체해줌.
		System.out.println(a);
		
		System.out.println("-------------------------------");
		
		String[]sArray = a.split(",");
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
			
			System.out.println(a);
			
			System.out.println("-----------------------------");
			
			String str = "Hello JAVA!";
			
			String result01 = str.substring(3);
			String result02 = str.substring(1,7);
			
			System.out.println(str.substring(6));
			System.out.println(str.substring(3));
			System.out.println(str.substring(1,7));//a부터 b전까지
			
			char result03 = str.charAt(8);
			System.out.println(result03);
			System.out.println(str.toString());
			
			System.out.println("---------------------------");
			
			String s01 = new String("안녕");// 안녕 주소 받기 
			String s02 = new String("안녕");
			
			if(s01==s02) {
				System.out.println("주소 같음");
			}else {
				System.out.println("주소 다름");
			}
			
			if(s01.equals(s02)) {
				System.out.println("글자 같음");
			}else {
				System.out.println("글자 다름");
			}
			
			System.out.println("--------------------------");
			String s03 = "안녕";
			if("안녕".equals("s03")){
					
			
			
			
		}
		

	}

}
