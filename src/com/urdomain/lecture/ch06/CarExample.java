package com.urdomain.lecture.ch06;

public class CarExample {

	public static void main(String[] args) {

		Car car = new Car();
		
//		객체 접근 연산자(.)를 사용하여 car 객체변수의 값을 참조
		
		System.out.println("company: " + car.company);
		System.out.println("model: " + car.model);
		System.out.println("color: " + car.color);
		System.out.println("maxSpeed: " + car.maxSpeed);
		System.out.println("speed: " + car.speed);
		
		car.speed = 100;
		
		System.out.println("speed: " + car.speed);
		
//		speed가 maxSpeed 보다 속도가 높은지 낮은지를 출력해 주는 함수를 만들어서 출력 하시오
		speedOk(car.maxSpeed, car.speed);
	}

	public static void speedOk(int maxSpeed, int speed) {
		if(maxSpeed > speed) {
			System.out.println("한계 속도보다 느립니다.");
		} else if(maxSpeed < speed) {
			System.out.println("한계 속도보다 빠릅니다.");
		} else {
			System.out.println("한계속도입니다.");
		}
	}
}
