package com.urdomain.lecture.ch04;

public class WhilePrintFrom1To10Example {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		while(i <= 10) {
			sum += i;
			i++;
		}
		System.out.println("1부터 10까지의 합은 " + sum + " 입니다. ");
	}

}
