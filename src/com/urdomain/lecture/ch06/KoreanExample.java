package com.urdomain.lecture.ch06;

public class KoreanExample {

	public static void main(String[] args) {
		
		Korean korean = new Korean();
		
		System.out.println("korean.nation: " + korean.nation);
		System.out.println("korean.name: " + korean.name);
		System.out.println("korean.ssn: " + korean.ssn);
		
		korean.name = "한예린";
		korean.ssn = "12313123124124";
		
		System.out.println("-----------------------");
		System.out.println("korean.nation: " + korean.nation);
		System.out.println("korean.name: " + korean.name);
		System.out.println("korean.ssn: " + korean.ssn);
		
		Korean korean2 = new Korean("꼬부기", "12312412415");
		
		System.out.println("-----------------------");
		System.out.println("korean2.nation: " + korean2.nation);
		System.out.println("korean2.name: " + korean2.name);
		System.out.println("korean2.ssn: " + korean2.ssn);
		
		Korean korean3 = new Korean("파이리", "256365472412415");
		
		System.out.println("-----------------------");
		System.out.println("korean3.nation: " + korean3.nation);
		System.out.println("korean3.name: " + korean3.name);
		System.out.println("korean3.ssn: " + korean3.ssn);
	}

}
