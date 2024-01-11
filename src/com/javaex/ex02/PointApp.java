package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		
		Point p00 = new Point(3,5);
		Point p01 = new Point(3,5);
		Point p02 = new Point(13,15);//메모리에 새롭게 올라간것
		Point p03 = p02;// 메모리에 새롭게 올라간것은 아니고 주소값만 빌림
		
		//클래스 정보보기
		System.out.println(p00.getClass());
		System.out.println(p01.getClass());
		System.out.println(p02.getClass());
		
		System.out.println("=================================");
		
		//toString()
		System.out.println(p00.toString());
		System.out.println(p01.toString());
		System.out.println(p02);//println 은 당연히 toString 찾기 때문에
		
		//hashCode()
		System.out.println(p00.hashCode());
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		
		System.out.println("=================================");
		
		//equals()
		System.out.println(p00.equals(p01)); //p00의 부모의 메소드 사용(로직은 같다)
		System.out.println(p01.equals(00)); //p01 부모의 메소드 사용(로직은 같다)
		
		System.out.println(p02.equals(p03)); //같다라는 결과값 나옴.

	}

}
