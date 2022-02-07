package com.urdomain.lecture.ch02;

public class CastingExample {

	public static void main(String[] args) {
		// byte < short < int < long
		// float < double
		
		// 강제 형변환 : casting : (원하는 형) 변수명
		
		int intValue = 44032;
		System.out.println("intValue : " + intValue);
		
		char charValue = (char) intValue; //44032 -> char //가 나 다 라
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.1444;
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}

}
