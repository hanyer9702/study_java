package com.urdomain.lecture.ch10;

public class TryCatchFinallyExample {

	public static void main(String[] args){
		
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
		
	}
	
//	public static void main(String[] args) throws ClassNotFoundException {
//		
//		Class clazz = Class.forName("java.lang.String2");
//	}
}
