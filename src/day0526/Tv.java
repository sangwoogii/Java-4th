package day0526;

public class Tv {

	boolean power; // Tv 전원에 대한 변수 선언
	int channel; // Tv 채널에 대한 변수 선언
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}
