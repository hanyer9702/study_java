package com.urdomain.lecture.ch07;

public class MyFriendDetialInfoExample {

	public static void main(String[] args) {

		MyFriendDetialInfo myFriendDetialInfo = new MyFriendDetialInfo("�̼���", 100, "���հ�", "010-1000-8888");
		
//		myFriendDetialInfo.setName("�̼���");
//		myFriendDetialInfo.setAge(100);
//		myFriendDetialInfo.setAddress("���հ�");
//		myFriendDetialInfo.setPhoneNumber("010-1000-8888");
		
		System.out.println("�̸�: " + myFriendDetialInfo.getName());
		System.out.println("����: " + myFriendDetialInfo.getAge());
		System.out.println("�ּ�: " + myFriendDetialInfo.getAddress());
		System.out.println("��ȭ: " + myFriendDetialInfo.getPhoneNumber());
	}

}
