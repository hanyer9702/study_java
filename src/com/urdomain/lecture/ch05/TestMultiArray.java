package com.urdomain.lecture.ch05;

public class TestMultiArray {

	public static void main(String[] args) {
		
		String[][] words = {{"공지", "내차 보험료 확인만해도 스타벅스 아메리카노 1잔 지급!", "중나트벤이군", "2022.02.14.", "3,113"},
				{"공지", "[돈뉴 #3] 쉽고 빠른 돈 이야기 '돈뉴' - 물가=오르고 주가=떨어지고.. new", "중나에디터", "12:20", "242"}, 
				{"공지", "[꽝없는100%당첨] ★로또 대박★ 당첨금이 터지는 이벤트 진행!", "중나트벤이군", "2022.01.04.", "4.9만"}, 
				{"공지", "[스프마켓]에어팟 3세대를 온라인 최저가 보다 싸게 만나는 방법 new", "중나트벤이군", "2022.02.15.", "516"}, 
				{"공지", "하다 맞지 말자! 신학기 아카데미 삼성노트북9 메탈 49만원 [21]", "중나트벤이군", "2022.02.07.", "1.6만"}}; 
		
		for(int i = 0; i < words.length ; i++) {
			for(int j = 0; j < words[i].length ; j++) {
				System.out.print(words[i][j] + " \t");
			}
			System.out.println();
		}
		
	}

}
