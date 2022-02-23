package com.urdomain.lecture.ch06;

public class TelevisionExample {

	public static void main(String[] args) {

		System.out.println("Television.company: " + Television.company);
		System.out.println("Television.model: " + Television.model);
		System.out.println("Television.info: " + Television.info);
//		System.out.println("Television.desc: " + Television.version);	//error
		
		Television television = new Television();
		
		System.out.println("television.company: " + television.company);
		System.out.println("television.model: " + television.model);
		System.out.println("television.info: " + television.info);
	}

}
