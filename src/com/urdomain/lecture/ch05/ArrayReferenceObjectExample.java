package com.urdomain.lecture.ch05;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		
		// 갯수만 우선 정하고 데이터는 나중에
		String[] strArray = new String[3];
		
		strArray[0] = "강낭콩";
		strArray[1] = "강낭콩";
		strArray[2] = new String("강낭콩");

		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);
		
		System.out.println(strArray[0].equals(strArray[1]));
		System.out.println(strArray[0].equals(strArray[2]));
		
//		equals : String 객체의 함수 : 문자열비교
		
		int[] score = {77,88,99};
		
//		System.out.println(score[0].equals(score[0]));
	}

}
