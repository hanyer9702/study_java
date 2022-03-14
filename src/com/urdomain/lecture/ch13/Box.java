package com.urdomain.lecture.ch13;

public class Box<T> {

	private T t;	// 지금 데잍 타입 정하지 않고 나중에 사용할때 정함.

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
	
}
