package com.urdomain.lecture.ch06;

public class SixthCarExample {
	
	static String name = "한예린";

	public static void main(String[] args) {
		
		name = "고구마";

		SixthCar myCar = new SixthCar("포르쉐");
		SixthCar yourCar = new SixthCar("벤츠");
		
		myCar.run();
		yourCar.run();
		
		print("가나라다");
	}

	public static void print(String msg) {
		System.out.println(msg);
	}
}
