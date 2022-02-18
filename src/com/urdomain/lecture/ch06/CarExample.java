package com.urdomain.lecture.ch06;

public class CarExample {

	public static void main(String[] args) {

		Car car = new Car();
		
//		��ü ���� ������(.)�� ����Ͽ� car ��ü������ ���� ����
		
		System.out.println("company: " + car.company);
		System.out.println("model: " + car.model);
		System.out.println("color: " + car.color);
		System.out.println("maxSpeed: " + car.maxSpeed);
		System.out.println("speed: " + car.speed);
		
		car.speed = 100;
		
		System.out.println("speed: " + car.speed);
		
//		speed�� maxSpeed ���� �ӵ��� ������ �������� ����� �ִ� �Լ��� ���� ��� �Ͻÿ�
		speedOk(car.maxSpeed, car.speed);
	}

	public static void speedOk(int maxSpeed, int speed) {
		if(maxSpeed > speed) {
			System.out.println("�Ѱ� �ӵ����� �����ϴ�.");
		} else if(maxSpeed < speed) {
			System.out.println("�Ѱ� �ӵ����� �����ϴ�.");
		} else {
			System.out.println("�Ѱ�ӵ��Դϴ�.");
		}
	}
}
