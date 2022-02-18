package com.urdomain.lecture.ch06.exc;

public class Car {
	
//	field
	String company = "포르쉐";
	String model = "포르쉐2";
	String color = "gray";

	int maxSpeed = 240;
	int speed = 0;
	
	int a = 1;
	int b = 2;
	int c = 3;

//	method

//	액셀밟기
	public int aaa(int a) {
		
		return 1;
	}
	
//	속도올리기
	public int speedUp(int a) {
		int finalSpeed = a;
		return finalSpeed;
	}
	
	
//	기어변경하기
	public String Gear(String a) {
		
//		여기에 기어가 변경되는 알고리즘
		String finalGear = "";
		
		return finalGear;
	}
}
