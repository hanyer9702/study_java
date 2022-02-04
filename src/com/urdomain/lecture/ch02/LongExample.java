package com.urdomain.lecture.ch02;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		
		//컴파일 에러
		// int 범위를 벗어나는 리터럴인 경우에는 뒤에 'L'을 붙여주어야 된다.
		// int -2147483648 ~ 2147483647
		// long -9223372036854775808 ~ 9223372036854775807
		long var3 = 1000000000;	
		long var4 = 10000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
