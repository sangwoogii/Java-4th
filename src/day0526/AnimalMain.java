package day0526;

public class AnimalMain {

	public static void main(String[] args) {
		
		// 상속일 때
//		Lion lion = new Lion();
//		lion.roar();
//		lion.eat();
//		lion.sleep();
//		
//		System.out.println();
//		
//		Eagle eagle = new Eagle();
//		eagle.fly();
//		eagle.eat();
//		eagle.sleep();
		
		
		// 포함일 때
		Lion lion = new Lion();
		lion.roar();
		lion.an.eat();
		lion.an.sleep();
		
		System.out.println();
		
		Eagle eagle = new Eagle();
		eagle.fly();
		eagle.an.eat();
		eagle.an.sleep();
	}

}
