package com.urdomain.lecture.ch04;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		int x = scan.nextInt();
//		int y = scan.nextInt();
//		
//		if(x > 0) {
//			if(y > 0) {
//				System.out.println("제 1 사분면");
//			} else if(y < 0) {
//				System.out.println("제 4 사분면");
//			} else {
//				System.out.println("범위 외");
//			}
//		} else if (x < 0) {
//			if(y > 0) {
//				System.out.println("제 2 사분면");
//			} else if(y < 0) {
//				System.out.println("제 3 사분면");
//			} else {
//				System.out.println("범위 외");
//			}
//		} else{
//			System.out.println("범위 외");
//		}
		
		int eSum = 0; //짝수
		int oSum = 0; //홀수
		
		for(int i = 1 ; i <= 9 ; i++) {
			for(int j = 2 ; j <= 9 ; j++) {
				int xNum = i * j;
				System.out.print(j + " * " + i + " = " + xNum + "\t");
				if(xNum % 2 == 0) {
					eSum += xNum;
				} else {
					oSum += xNum;
				}
			}
			System.out.println();
		}
		System.out.println("구구단 짝수의 합은 " + eSum + " 입니다.");
		System.out.println("구구단 홀수의 합은 " + oSum + " 입니다.");
	}

}
