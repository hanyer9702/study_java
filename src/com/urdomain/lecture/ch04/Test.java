package com.urdomain.lecture.ch04;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		if(x > 0) {
			if(y > 0) {
				System.out.println("제 1 사분면");
			} else if(y < 0) {
				System.out.println("제 4 사분면");
			} else {
				System.out.println("범위 외");
			}
		} else if (x < 0) {
			if(y > 0) {
				System.out.println("제 2 사분면");
			} else if(y < 0) {
				System.out.println("제 3 사분면");
			} else {
				System.out.println("범위 외");
			}
		} else{
			System.out.println("범위 외");
		}

	}

}
