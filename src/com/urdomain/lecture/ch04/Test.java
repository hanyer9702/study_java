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
//				System.out.println("�� 1 ��и�");
//			} else if(y < 0) {
//				System.out.println("�� 4 ��и�");
//			} else {
//				System.out.println("���� ��");
//			}
//		} else if (x < 0) {
//			if(y > 0) {
//				System.out.println("�� 2 ��и�");
//			} else if(y < 0) {
//				System.out.println("�� 3 ��и�");
//			} else {
//				System.out.println("���� ��");
//			}
//		} else{
//			System.out.println("���� ��");
//		}
		
		int eSum = 0; //¦��
		int oSum = 0; //Ȧ��
		
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
		System.out.println("������ ¦���� ���� " + eSum + " �Դϴ�.");
		System.out.println("������ Ȧ���� ���� " + oSum + " �Դϴ�.");
	}

}
