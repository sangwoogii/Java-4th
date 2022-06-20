package day0526;

class A { // 임의의 A 클래스 생성
	void hello() { // 메서드 생성
		System.out.println("A를 출력합니다 !");
	}
}


class B extends A { // A를 상속받는 B클래스 생성
	// 아무것도 적지 않았지만 A를 상속받았기 때문에 A의 내용이 저장되어있음
	
	// 오버라이딩 - 부모것을 그대로 받아서 선언부는 그대로 실행하지만 안에 내용이 달라지는 것
	void hello() {
		System.out.println("B를 출력합니다.");
	}
}


public class OverMain {

	public static void main(String[] args) {
		A aa = new A();
		aa.hello();
		
		B bb = new B();
		bb.hello();
	}

}
