package com.urdomain.lecture.ch06;

public class ThirdCalculatorExample {

	public static void main(String[] args) {

		ThirdCalculator thirdCalculator = new ThirdCalculator();
		
		double result1 = thirdCalculator.areaRectangle(5.2);	// ���簢��
		
		double result2 = thirdCalculator.areaRectangle(5.3, 5.2);	// ���簢��
		
		System.out.println("�簢���� ���� : " + result1);
		System.out.println("�簢���� ���� : " + result2);
	}

}
