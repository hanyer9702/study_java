package com.urdomain.lecture.ch02;

public class CharExample {

	public static void main(String[] args) {
		char c1 = 'A';	//문자를 직접 저장
		char c2 = 65;	//십진수로 저장
		char c3 = '\u0041';	//16진수로 저장 : \\u : 16진수를 나타내는 이스케이프
		
		char c4 = '가';	//문자를 직접 저장
		char c5 = 44032;	//십진수로 저장
		char c6 = '\uac00';	//16진수로 저장
		
		int uniCode = c1;	//유니코드 얻기
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(uniCode);
	}

}
