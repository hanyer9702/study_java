package com.urdomain.lecture.ch05;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		
		// ������ �켱 ���ϰ� �����ʹ� ���߿�
		String[] strArray = new String[3];
		
		strArray[0] = "������";
		strArray[1] = "������";
		strArray[2] = new String("������");

		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);
		
		System.out.println(strArray[0].equals(strArray[1]));
		System.out.println(strArray[0].equals(strArray[2]));
		
//		equals : String ��ü�� �Լ� : ���ڿ���
		
		int[] score = {77,88,99};
		
//		System.out.println(score[0].equals(score[0]));
	}

}
