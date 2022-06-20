package day0526;

class A1 { // 1번
	int num1;
	int num2;
	
	String print() { // String을 메서드로 사용하면 return 입력 
		return "num1 : " + num1 + " num2 : " + num2;
	}
}


class B1 extends A1 { // 1번
	int num3;

// 오버라이딩
	
// 오버라이딩을 할 땐 상속받은 자식 클래스에서 메서드를 그대로 들고와서
// 원하는 값만 추가하면 됨
	String print() {
		return "num1 : " + num1 + " num2 : " + num2 + " num3 : " + num3;
	}
}


public class OverMain2 { // 1번
	public static void main(String[] args) {
		
		B1 bb = new B1();
		
		bb.num1 = 10;
		bb.num2 = 20;
		bb.num3 = 30;
		
		System.out.println(bb.print());
	}
	
}





//부모의 부모는 오브젝트 / 오브젝트의 오버라이딩
//class A1 extends Object {
//	int num1;
//	int num2;
//
//	A1 (int num1, int num2) { // 매개변수가 있는 생성자 생성
//		this.num1 = num1;
//		this.num2 = num2;
//	}


//	// Object의 toString() : 문자열을 반환시켜주는 것
//	// toString을 오버라이딩
//	public String toString() {
//		return "num1 : " + num1 + ", num2 : " + num2;
//	}


//public class OverMain2 {
//
//	public static void main(String[] args) {
//		
//		A1 a1 = new A1(10, 20);
//		
//		System.out.println(a1.toString());
//		
//		}
//	}
//}
	