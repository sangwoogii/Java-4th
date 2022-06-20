package day0526;

public class Car {

	private int num;
	// private : 접근제한자, private을 사용하면 class Car안에서만 사용가능함
	private double gas;
	
	Car (){ // Car의 생성자
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌어요 !");
		// 기본값 저장, 메서드가 호출되면 이거부터 화면에 보여짐
	}
	
	public void setCar(int num, double gas) { // public도 접근제한자
		this.num = num;
		this.gas = gas;
		System.out.println("차량 번호는 " + num + ", 연료량은 " + gas + "(으)로 변경");
	}
	
	public void show() { // 값을 출력할 메서드 생성
		System.out.println("차량 번호는 " + num);
		System.out.println("연료량은 " + gas);
	}
	
	// Car라는 것을 상속받기 위한 RacingCar 생성
}