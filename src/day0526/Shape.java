package day0526;

// 상속과 포함을 두 개 전부 사용해서 두 개의 차이점을 알아보자
// 부모가 없으면 그 클래스는 Object (최고조상)를 받음

class Point extends Object { // 부모클래스
	int x;
	int y;
}

//// 상속
//class Circle extends Point { // Circle - 자식, Point - 부모
//	int r;
//}


// 포함
class Circle {
	Point p = new Point();
	int r;
}



	public class Shape {
		public static void main(String[] args) {
			Circle c = new Circle();
			
			System.out.println(c.toString());
			
			Circle c1 = new Circle();
			System.out.println(c1.toString());
			
			System.out.println(c1);
		
		
// 		상속의 방법
//		c.x = 1;
//		c.y = 2;
//		c.r = 3;
//		
//		System.out.println("c.x = " + c.x);
//		System.out.println("c.y = " + c.y);
//		System.out.println("c.r = " + c.r);
		
		
//		포함의 방법
		c.p.x = 10;
		c.p.y = 20;
		c.r = 30;
		
		System.out.println("c.p.x = " + c.p.x);
		System.out.println("c.p.y = " + c.p.y);
		System.out.println("c.r = " + c.r);
		
	}
}
