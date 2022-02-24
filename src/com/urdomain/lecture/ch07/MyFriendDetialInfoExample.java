package com.urdomain.lecture.ch07;

public class MyFriendDetialInfoExample {

	public static void main(String[] args) {

		MyFriendDetialInfo myFriendDetialInfo = new MyFriendDetialInfo("이순신", 100, "성균관", "010-1000-8888");
		
//		myFriendDetialInfo.setName("이순신");
//		myFriendDetialInfo.setAge(100);
//		myFriendDetialInfo.setAddress("성균관");
//		myFriendDetialInfo.setPhoneNumber("010-1000-8888");
		
		System.out.println("이름: " + myFriendDetialInfo.getName());
		System.out.println("나이: " + myFriendDetialInfo.getAge());
		System.out.println("주소: " + myFriendDetialInfo.getAddress());
		System.out.println("전화: " + myFriendDetialInfo.getPhoneNumber());
	}

}
