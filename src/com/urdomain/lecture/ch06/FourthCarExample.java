package com.urdomain.lecture.ch06;

public class FourthCarExample {

	public static void main(String[] args) {

		FourthCar fourthCar = new FourthCar();
		
		fourthCar.setGas(5);	//Car�� setCas() �޼ҵ� ȣ��
		
		boolean gasState = fourthCar.isLeftGas();	//Car�� isLeftGas() �޼ҵ� ȣ��
		if(gasState) {
			System.out.println("����մϴ�.");
			fourthCar.run(); //Car�� run() �޼ҵ� ȣ��
		}
		
		if(fourthCar.isLeftGas()) {	//Car�� isLeftGas() �޼ҵ� ȣ��
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("gas�� �����ϼ���.");
		}
	}

}
