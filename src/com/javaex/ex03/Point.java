package com.javaex.ex03;

public class Point {
	
	// 필드
		private int x;
		private int y;

		// 생성자
		
		public Point() {
			super();
		}
		
		
		public Point(int x, int y) {
			super();//object 디폴트 부름
			this.x = x;
			this.y = y;

		// 메소드 gs

		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}


		@Override
		public String toString() {
			return "Point [x=" + x + ", y=" + y + "]";
		}


		@Override
		
		public boolean equals(Object obj) {//시선이 부모까지

			Point p = (Point)obj;
			boolean result;
			
			if(this.x == p.x && this.y == p.y) {
				result =  true;
			}else {
				result = false;
				
			}
			
			return result;
			
			
		}
		
		

}
