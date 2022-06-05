package com.urdomain.lecture.ch07;

public abstract class Animal {

	public String kind;
	
	public void breathe() {
		System.out.println("동물 숨 쉼");
	}
	
	public abstract void sound();
}
