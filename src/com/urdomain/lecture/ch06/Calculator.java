package com.urdomain.lecture.ch06;

public class Calculator {

	public void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public int plus(int x, int y) {
		int result = x + y; 
		return result;
	}
	
	public double divide(int x, int y) {
		double result = (double) x / (double) y;
		return result;
	}
	
	public void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
}
