package com.urdomain.lecture.ch04;

import java.util.Scanner;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

//		int score = 75;
//		
//		if(score >= 90) {
//			System.out.println("점수가 100~90 사이 입니다.");
//			System.out.println("등급은 A 입니다.");
//		} else if (score >= 80) {
//			System.out.println("점수가 80~89 사이 입니다.");
//			System.out.println("등급은 B 입니다.");
//		} else if (score >= 70) {
//			System.out.println("점수가 70~79 사이 입니다.");
//			System.out.println("등급은 C 입니다.");
//		} else if (score >= 60) {
//			System.out.println("점수가 60~69 사이 입니다.");
//			System.out.println("등급은 D 입니다.");
//		} else {
//			System.out.println("점수가 60 미만 입니다.");
//			System.out.println("등급은 F 입니다.");
//		}
//		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if (a > b) {
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
		} else if (a == b) {
			System.out.println("==");
		}
		
	}

}
