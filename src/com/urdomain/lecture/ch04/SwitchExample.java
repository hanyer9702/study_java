package com.urdomain.lecture.ch04;

public class SwitchExample {

	public static void main(String[] args) {
		
//		int num = 5;
		
//		Math.random() : 0.0 ~ 1.0에 가까운 double 형 값 보내줌
//		int num = Math.random() * (max - min + 1) + min
		
//		double num = Math.random();
//		System.out.println(num);
		
		int num1 = (int) (Math.random() * (6 - 1 + 1) + 1);
		int num2 = (int) (Math.random() * (6 - 1 + 1) + 1);
		

		System.out.println("첫번째 주사위는 " + num1 + "번 입니다.");
		System.out.println("두번째 주사위는 " + num2 + "번 입니다.");
		System.out.println("두수의 합은 " + (num1 + num2) + " 입니다.");

		
//		switch (num) { 
//			
//			case 1:
//				System.out.println("1번");
//				break;
//			case 2:
//				System.out.println("2번");
//				break;
//			case 3:
//				System.out.println("3번");
//				break;
//			case 4:
//				System.out.println("4번");
//				break;
//			case 5:
//				System.out.println("5번");
//				break;
//			default:
//				System.out.println("6번");
//				break;
//		
//		}
//		
	}

}
