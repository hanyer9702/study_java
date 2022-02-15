package com.urdomain.lecture.ch05;

public class Reference {

	public static void main(String[] args) {
		
//		변수
//		1. 기본(원시)
//		2. 참조
//			2.1 배열
//			2.2 열거
//			2.3 클래스
//			2.4 인터페이스
		
//		참조 : 냄비안에 데이터가 있는 것이 아니라 데이터가 저장되어 있는 주소를 넣어둔다.
//		참조형도 초기화 null
//		nullpointexception : npe
//		사용(대입, 호출(접근))이 불가
//		==, != 과 같은 관계 연산자는 사용할 수 있다.
		
//		String : 문자열 저장을 위한 객체
		String str1 = null;
		String str2 = "";
		String str3;
		
		if(str1 == str2) {	// 주소값
			
		}
		str1.equals(str2);	//	문자열
		
//		배열 : 동일 데이터들의 집합
//			예) 1학년 2반 학생들의 수학 성적 (15명)
//			78, 44, 90, 97, 100, ...
//			int mathScore010201 = 78;
//			int mathScore010202 = 44;
//			int mathScore010203 = 90;
//			int mathScore010204 = 97;
//			int mathScore010205 = 100;
//			.....
//			int mathScore010205 = 88;
//			
//			int mathScore0102 = {78, 44, 90, 97, ...., 100};
//			int mathScore0102 = {{78,78},{44,97},{90,70},...,{100,100}};
			
//			선언
	}

}
