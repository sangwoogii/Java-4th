package day0526;

public class CarMain {

	public static void main(String[] args) {
		
		RacingCar rc = new RacingCar();
		// 상속받은 클래스로 객체 생성하기
		
		rc.setCar(1234, 20.3d);
		rc.setCourse(7);
		
		// 객체를 생성하고 출력하면 생성자를 먼저 찾아가기 때문에
		// 자동차가 만들어졌어요 ! 라고 출력문이 보이고,
		// num 0, gas 0.0이라는 값이 먼저 저장이 됨
		// RacingCar의 생성자인 course 0의 값이 저장되고,
		// 레이싱카가 만들어졌어요 ! 라는 출력물이 화면에 출력됨
		// 그 다음 Main클래스에서 출력하고싶은 메서드를 출력하게 되면
		// 그 값에 따라 화면에 출력이 됨
	}

}
