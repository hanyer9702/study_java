package com.urdomain.lecture.ch13;

public class BoxExample {

	public static void main(String[] args) {

		Box<String> box = new Box<String>();
		// Box ��ü �߿��� �Ѱ� �� ���׸� Ÿ���� String ���� �� ���̴�.
		// String t;
		box.set("kate");
		String str = box.get();
		System.out.println("str: " + str);
		
		Box<Integer> box2 = new Box<Integer>();
		// t : Integer t;
		box2.set(11);
		int number = box2.get();
		System.out.println("number: " + number);
	}

}
