package com.urdomain.lecture.ch04;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		if(x > 0) {
			if(y > 0) {
				System.out.println("�� 1 ��и�");
			} else if(y < 0) {
				System.out.println("�� 4 ��и�");
			} else {
				System.out.println("y�� ��");
			}
		} else if (x < 0) {
			if(y > 0) {
				System.out.println("�� 2 ��и�");
			} else if(y < 0) {
				System.out.println("�� 3 ��и�");
			} else {
				System.out.println("y�� ��");
			}
		} else if (x == 0) {
			if(y == 0) {
				System.out.println("0,0");
			} else {
				System.out.println("y�� ��");
			}
		}

	}

}
