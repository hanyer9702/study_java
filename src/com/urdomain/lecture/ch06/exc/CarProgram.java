package com.urdomain.lecture.ch06.exc;

public class CarProgram {

	public static void main(String[] args) {
		int a = 1;
		
		Car car = new Car();
		
		Car car2;
		car2 = new Car();
		
//		��ü���ٿ�����
//		car.company;
		
		System.out.println("car.company: " + car.company);
		
		car.c = car.a + car.b;
		
		System.out.println("car.c : " + car.c);
		
		car.c = car.speedUp(10);
		
		System.out.println("car.c: " + car.c);
	}

}
