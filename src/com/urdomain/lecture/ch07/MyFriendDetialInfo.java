package com.urdomain.lecture.ch07;

public class MyFriendDetialInfo extends MyFriendInfo{

	private String address = "";
	private String phoneNumber = "";
	
	public MyFriendDetialInfo(String name, int age, String address, String phoneNumber) {

		this.setName(name);
		this.setAge(age);
		this.setAddress(address);
		this.setPhoneNumber(phoneNumber);
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
