package com.urdomain.lecture.ch05;

public class Exc {

	public static void main(String[] args) {
		int[] num1 = {2,3,4,5,6,7,8,9};
		int[] num2 = {1,2,3,4,5,6,7,8,9};
		
		for(int i = 0; i < num2.length ; i++) {
			for(int j = 0; j < num1.length ; j++) {
				int result = num1[j] * num2[i];
				System.out.print(num1[j] + " * " + num2[i] + " = " + result +"\t");
			}
			System.out.println();
		}
	}

}
