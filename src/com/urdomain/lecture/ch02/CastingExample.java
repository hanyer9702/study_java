package com.urdomain.lecture.ch02;

public class CastingExample {

	public static void main(String[] args) {
		// byte < short < int < long
		// float < double
		
		// ���� ����ȯ : casting : (���ϴ� ��) ������
		
		int intValue = 44032;
		System.out.println("intValue : " + intValue);
		
		char charValue = (char) intValue; //44032 -> char //�� �� �� ��
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.1444;
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}

}
