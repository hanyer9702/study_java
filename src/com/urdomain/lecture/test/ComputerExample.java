package com.urdomain.lecture.test;

public class ComputerExample {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		Computer computer = new Computer();
		
		int r = 7;
		
		System.out.println("���� ������ : " + r);
		System.out.println();
		
		System.out.println("������: " + calculator.areaCircle(r));
		System.out.println();
		
		System.out.println("������: " + computer.areaCircle(r));
	}

}
