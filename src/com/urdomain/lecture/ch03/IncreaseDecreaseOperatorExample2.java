package com.urdomain.lecture.ch03;

public class IncreaseDecreaseOperatorExample2 {

	public static void main(String[] args) {
		
//		++ : 1���� 
//		-- : 1����
//		++x; : �ǿ����ڸ� 1���� ��Ű�� �ٸ� ���� ����
//		x++; : �ٸ� ���� ���� �� �ǿ����� 1 ����
//		�ٸ������ڰ� ������ �տ� �ֳ� �ڿ� �ֳ� ����� ����
		
		int x = 10;
		int y = 10;
		int a = 0;
		int b = 0;
		
		++x;
		System.out.println(x);
		
		y++;
		System.out.println(y);

		a = ++x;	// x 12
					// x 12
		b = x++;	// x 12
					// x 13
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
	}

}
