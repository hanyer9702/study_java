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
		
		String result = addString("������ ���ڴ� ","ģ����.");
		
		System.out.println(result);
	}

//	public �����ڷ��� �޼ҵ�� (�Է��ڷ���1 �Էº���, �Է��ڷ���2 �Էº���2, ...) {
//		...
//		return ���ϰ�;	// �����ڷ����� void�� ��쿡�� return ���� �ʿ����.
//	}
	
//	�Լ�����
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
