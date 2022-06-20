package day0526;

public class RacingCar extends Car {
	
	private int course;
	
	// 생성자, 초기화블럭은 상속받지 않음
	public RacingCar() { // RacingCar의 생성자
		course = 0;
		System.out.println("레이싱카가 만들어졌어요 !");
	}
	
	public void setCourse(int c) { // 매개변수가 있는 RacingCar의 메서드
		course = c;
		System.out.println("코스 번호를 " + course + "로 설정했어요 !");
	}
}
