package com.urdomain.lecture.ch07;

public class ComputerExample {

	public static void main(String[] args) {
		
		int r = 10;
		
		Calculator calculator = new Calculator();

		
		System.out.println("������: " + calculator.areaCircle(2));
		
		Computer computer = new Computer();
		
		System.out.println("������: " + computer.areaCircle(2));
	}

}
