package com.urdomain.lecture.ch06;

public class SixthCarExample {
	
	static String name = "�ѿ���";

	public static void main(String[] args) {
		
		name = "����";

		SixthCar myCar = new SixthCar("������");
		SixthCar yourCar = new SixthCar("����");
		
		myCar.run();
		yourCar.run();
		
		print("�������");
	}

	public static void print(String msg) {
		System.out.println(msg);
	}
}
