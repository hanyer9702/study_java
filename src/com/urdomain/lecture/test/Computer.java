package com.urdomain.lecture.test;

public class Computer extends Calculator{

	@Override
	public double areaCircle(int param) {
		
		System.out.println("Computer ��ü�� ������ ���ϴ� ���α׷� ����");
		
		return Constants.PAI_2 * param * param;
	}
}
