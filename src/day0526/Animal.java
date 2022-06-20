package day0526;

public class Animal extends Object { // 부모는 무조건 extends Object클래스 포함
	
	void eat() {
		System.out.println("밥을 먹어요");
	}
	
	void sleep() {
		System.out.println("잠을 자요");
	}
	
	// 이 클래스를 상속받는 메인생성 (Lion, Eagle, AnimalMain)
}
