package com.urdomain.lecture.ch04;

public class Test2 {

	public static void main(String[] args) {
		int[] num = new int[6];
		
		for(int i = 0; i < 6 ; i++) {
			num[i] = (int) (Math.random() * 45 + 1);
		}
		
		while(true) {
			int count = 0;
			for(int i = 0; i < 6 ; i++) {
				for(int j = 0; j < i ; j++) {
					if(num[i]==num[j]) {
						count +=1;
						num[i] = (int) (Math.random() * 45 + 1);
					}
				}
			}
			
			if(count == 0) {
				break;
			}
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.print(num[i] + "\t");
		}
		System.out.println();
		
		for(int i = 5 ; i >= 0; i--) {
			for(int j = 0; j < i ; j++) {
				if(num[j]>num[j+1]) {
					int wnum = num[j];
					num[j] = num[j+1];
					num[j+1] = wnum;
				}
			}
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.print(num[i] + "\t");
		}
	}

}
