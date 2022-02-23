package com.urdomain.lecture.ch06;

public class PersonExample {

	public static void main(String[] args) {

		Person person = new Person("022222-2222222", "È«ÁøÈ£");
		
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);
		
//		person.nation = "usa";
//		person.ssn = "123133-1231312";
		person.name = "ÄáÄáÄá";
	}

}
