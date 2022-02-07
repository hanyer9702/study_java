package com.urdomain.lecture.ch02;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		// ���� : + - * / %
		
		// ���� Ʋ�� ��쿡�� ū ������ �ڵ� ����ȯ
		
		int a = 10;
		double b = 10.0;
//		int c = (a + b); //Type mismatch: cannot convert from double to int
		int d = (int) (a + b);
		int e = a + (int) b;
		double f = a + b;

		System.out.println("d : " + d);
		System.out.println("e : " + e);
		System.out.println("f : " + f);
		
		// ������ ����(byte,short,int)�� int�� �ڵ� ����ȯ, long�� ����
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2; //������ ����b 10 + 20 = 30
		int intValue1 = byteValue1 + byteValue2;
		System.out.println("intValue : " + intValue1);
		
//		char�� int�� ������ �Ǹ� int�� �ڵ� ����ȯ�� �Ǿ� ���� ����
		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2; //������ ����
		int intValue2 = charValue1 + charValue2;
		System.out.println("�����ڵ� = " + intValue2);
		System.out.println("��¹��� = " + (char) intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
//		int intValue6 = (int) 10 / 4.0; //������ ����
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
//		--------------------
		
		long aa = 1;
		long bb = 2;
		long cc = aa + bb;
		
		System.out.println("cc : " + cc);
		
		short aaa = 1;
		short bbb = 2;
//		short ccc = aaa + bbb;
	}

}
