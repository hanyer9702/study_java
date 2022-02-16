package com.urdomain.lecture.ch05;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int a = 0;
		for(int score : scores) {
			System.out.println(a + ": score: " + score);
			a++;
		}
		
//		for(int i = 0; i < scores.length; i++) {
//			System.out.println(scores[i]);
//		}
	}

}
