package com.urdomain.lecture.ch06;

public class FinalCarExample {

	public static void main(String[] args) {

		FinalCar finalCar = new FinalCar();
		
		//�߸��� �ӵ� ����
		finalCar.setSpeed(-50);
		
		System.out.println("���� �ӵ�: " + finalCar.getSpeed());
		
		//�ùٸ� �ӵ� ����
		finalCar.setSpeed(60);
		
		//����
		if(!finalCar.isStop()) {
			finalCar.setStop(true);
		}
		
		System.out.println("���� �ӵ�: " + finalCar.getSpeed());
	}

}
