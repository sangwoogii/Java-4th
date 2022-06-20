package day0526;

// 오버로딩과 오버라이딩의 차이점


class Parent1 {
	void print() {
		System.out.println("부모 클래스의 print()메서드입니다.");
	}
}

class Child1 extends Parent1 {
	
	// 오버라이딩 -> 선언부가 똑같아야함 (void print()는 무조건 똑같아야함
	void print() {
		System.out.println("자식 클래스의 print()메서드입니다.");
	}
	
	// 매개변수 1개짜리로 오버로딩 -> 매개변수 차이가 있으면 오버로딩
	String name;
	void print(String name) {
		System.out.println(name + " 클래스의 Print()메서드입니다.");
	}
}


public class OverOver {

	public static void main(String[] args) {
		
		Parent1 p = new Parent1();
		p.print();
		
		Child1 c1 = new Child1();
		c1.print();
		c1.print("욱");
		// 매개변수 메서드를 입력했기 때문에 매개변수 값을 넣어주어야 함
	}

}
