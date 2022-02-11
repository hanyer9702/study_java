package com.urdomain.lecture.ch04;

public class ForPrintFrom1To10Example {

	public static void main(String[] args) {
		
//		초기화식
//		조건식
//		증감식
		
//		int sum = 0;
//		
//		for(int i = 0 ; i < 10 ; i++) {	//	2 3 .... 11
////			System.out.println(i+1);
//			sum += i;
//		}
//
//		System.out.println(sum);
	
//		-----------------------------------------
		
//		for(int i = 1 ; i <= 10 ; i++) {
//			System.out.println(i);
//			for(int j = 1 ; j <= 10 ; j++) {
//				System.out.println(j);
//			}
//		}
//		
//		-------------------------------------------
		
		for(int i = 1 ; i <= 9 ; i++) {
			for(int j = 2 ; j <= 9 ; j++) {
				System.out.print(j + " * " + i + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
		
	}

}
