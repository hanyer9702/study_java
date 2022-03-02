package com.urdomain.lecture.ch07;

public class StudentExample {

	public static void main(String[] args) {

		Student student = new Student("kate", "1234-5678", 20150714);
		
		System.out.println(student.name);
		System.out.println(student.ssn);
		System.out.println(student.studentNo);
		
		Student student2 = new Student("happy", "1674-5678");
		
		System.out.println(student2.name);
		System.out.println(student2.ssn);
		System.out.println(student2.studentNo);
	}

}
