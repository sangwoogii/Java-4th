package day0526;

public class Netflex {

	boolean power; // 전원에 해당 (켜고, 끄고)
	int counter = 0;
	
	void power() {
		power = !power; // 켜져있으면 켜고 끄고있으면 끄고 값이 반대로 설정
	}
	
	void play() {
		System.out.println("재생중입니다.");
	}
	
	void stop() {
		System.out.println("정지하였습니다.");
	}
	
	void rew() {
		System.out.println("<< 되감기");
	}
	
	void ff() {
		System.out.println(">> 빨리감기");
	}
}
