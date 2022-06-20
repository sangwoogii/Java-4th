package day0526;

class Parent {
	
	String name;
	
	void PrintInfo() { // name을 확인하는 메서드 생성
		System.out.println("name : " + name);
	}
}


class Child extends Parent { // Parent를 상속받은 Child 클래스 생성
	String hobby; // 취미는 수가 아니기 때문에 String
	
	// 오버라이딩
	void printInfo() {
		System.out.println("name : " + name);
		System.out.println("hobby : " + hobby); // 값 추가
	}
	
	public String getHobby() {
		return hobby;
	}
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
}


public class ParentMain {

	public static void main(String[] args) {
	
		Parent p = new Parent();
		p.name = "parent";
		p.PrintInfo();
		
		System.out.println("-------------");
		
		Child c = new Child();
		c.name = "child";
		c.setHobby("swimming");
//		c.hobby = "swimming";
		c.printInfo();
	}

}
