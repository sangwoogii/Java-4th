package day0526;

public class Lion {
//	extends Animal
	// Lion이라는 클래스 바로 뒤에 extends Animal을 쓰면
	// Lion 클래스가 Animal 클래스를 상속받음
	
	// 포함으로 바꿀 때
	Animal an = new Animal();
	
	void roar() {
		System.out.println("Lion의 roar()가 호출되었음");
	}
}
