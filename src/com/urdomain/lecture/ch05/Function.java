package com.urdomain.lecture.ch05;

import java.util.Scanner;

public class Function {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		
//		Function function = new Function();
//		
//		function.calculator(function, num1, num2);
		
		String result = addString("고구마와 감자는 ","친구다.");
		
		System.out.println(result);
	}

//	public 리턴자료형 메소드명 (입력자료형1 입력변수, 입력자료형2 입력변수2, ...) {
//		...
//		return 리턴값;	// 리턴자료형이 void인 경우에는 return 문이 필요없다.
//	}
	
//	함수선언
	public int add (int a, int b) {
		
		int sum = a + b;
		
		return sum;
	}
	
	public int aaa (int a, int b, int c, String d, boolean e) {
		System.out.println(a);
		return 1;
	}
	
	public int minus (int a, int b) {
		
		int min = a - b;
		
		return min;
	}
	
	public int mulitply (int a, int b) {
		
		int mul = a * b;
		
		return mul;
	}
	
	public double divide (int a, int b) {
		
		double div = (double) a / b;
		
		return div;
	}
	
	public int divideN (int a, int b) {
		
		int divN = a % b;
		
		return divN;
	}
	
	public void calculator (Function function, int a, int b) {
		
		int add = function.add(a, b);
		int minus = function.minus(a, b);
		int mul = function.mulitply(a, b);
		double div = function.divide(a, b);
		int divN = function.divideN(a, b);
		
		System.out.println(a + " + " + b + " = " + add);
		System.out.println(a + " - " + b + " = " + minus);
		System.out.println(a + " * " + b + " = " + mul);
		System.out.println(a + " / " + b + " = " + div);
		System.out.println(a + " % " + b + " = " + divN);
	}
	
	public static String addString (String a, String b) {
		
		String c = a + b;
		
		return c;
	}
}
