package day0526;

public class SmartTv extends Tv {

	// Tv와 Netflix 둘다 사용하고 싶음
	// 둘 중 비중이 더 큰 것을 상속을 받고 나머지를 포함하면 된다.
	
	Netflex net = new Netflex();
	
	int counter = net.counter;
	
	void play() {
		net.play();
	}
	
	void stop() {
		net.stop();
	}
	
	void rew() {
		net.rew();
	}
	
	void ff() {
		net.ff();
	}

}
