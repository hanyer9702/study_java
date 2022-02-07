package com.urdomain.lecture.ch02;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		//byte < short < int < long
		// float < double
		
		int i = 127;
		
		System.out.println("Byte.MIN_VALUE : " + Byte.MIN_VALUE);	//���
		System.out.println("Byte.MAX_VALUE : " + Byte.MAX_VALUE);
		System.out.println("Short.MIN_VALUE : " + Short.MIN_VALUE);
		System.out.println("Short.MAX_VALUE : " + Short.MAX_VALUE);
		System.out.println("Integer.MIN_VALUE : " + Integer.MIN_VALUE);
		System.out.println("Integer.MAX_VALUE : " + Integer.MAX_VALUE);
		System.out.println("Long.MIN_VALUE : " + Long.MIN_VALUE);
		System.out.println("Long.MAX_VALUE : " + Long.MAX_VALUE);
		System.out.println("Float.MIN_VALUE : " + Float.MIN_VALUE);
		System.out.println("Float.MAX_VALUE : " + Float.MAX_VALUE);
		System.out.println("Double.MIN_VALUE : " + Double.MIN_VALUE);
		System.out.println("Double.MAX_VALUE : " + Double.MAX_VALUE);
		
//		if((i<-128) || (i>127)) {
		if((i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) {
			System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�.");
			System.out.println("���� �ٽ� Ȯ���� �ּ���.");
		} else {
			byte b = (byte) i;
			System.out.println(b);
			System.out.println("���������� ĳ���� �Ǿ����ϴ�.");
		}
	}

}
