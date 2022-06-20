package day0526;

public class TvMain {

	public static void main(String[] args) {
		
		SmartTv sTv = new SmartTv();
		// 상속을 받은 클래스를 객체로 생성

		if (sTv.power != true) {
			sTv.power();
			System.out.println("SmartTv 전원을 켭니다.");
		}
		
		System.out.println();
		
		sTv.channel = 10;
		sTv.channelUp();
		sTv.channelUp();
		System.out.println("현재 채널은 " + sTv.channel + "입니다.");
		
		sTv.channelDown();
		System.out.println("현재 채널은 " + sTv.channel + "입니다.");
		
		System.out.println();
		
		if (sTv.net.power != true) { // Netflex클래스 포함
			sTv.net.power();
			System.out.println("넷플릭스를 켭니다.");
		}
		
		System.out.println();
		
		sTv.play();
		sTv.rew();
		sTv.ff();
		sTv.stop();
		
		System.out.println();
		
		if (sTv.net.power == true) {
			sTv.net.power();
			System.out.println("넷플릭스를 끕니다.");
		}
		
		System.out.println();
		
		if (sTv.power == true) {
			sTv.power();
			System.out.println("Tv를 끕니다.");
		}
	}

}
