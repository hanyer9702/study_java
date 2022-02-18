package com.urdomain.lecture.ch06.exc;

import java.util.Date;

public class Book {

	int seq;
	String name;
	Date purchaseDate; // 구매일
	Date lastReturnDate; //마지막으로 반납받은 날짜
	String userName; // 대출한 사람
	int returnDate; // 도서 대여일 수
	
	// 도서 대출
	public void borrowBook() {
		
	}
	
	// 도서 반납
	public void returnBook() {
		
	}
	
	// 도서구입
	public void purchaseBook() {
		
	}
	
	// 연체자에게 자동 연락
	public void messageUser() {
		
	}
}
