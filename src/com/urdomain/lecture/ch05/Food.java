package com.urdomain.lecture.ch05;

import java.util.Scanner;

public class Food {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�԰� ���� ������ ������ : �ѽ� �߽� �Ͻ� ���");
		
		String myFood = scan.nextLine();
		
		food(myFood);
	}

	public static void food(String myFood) {
		
		String[] korean = {"������","���","�����","������","��ġ�","�����","��ġ������"};
		String[] chinese = {"¥���","«��","������","������","���","������ä"};
		String[] western = {"�Ľ�Ÿ","������","����","�ܹ���","������ũ","������"};
		String[] japanese = {"�ʹ�","���","�쵿","Ÿ���߳�","��ù�"};
		String[] food = null;
		
		switch(myFood) {
			case "�ѽ�":
				food = korean;
				break;
			case "�߽�":
				food = chinese;
				break;
			case "���":
				food = western;
				break;
			case "�Ͻ�":
				food = japanese;
				break;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				System.exit(0);
		}
		
		int num = (int) (Math.random() * (food.length + 1));
		
		println(food[num]);
	}
	
	public static void println(String a) {
		System.out.println("���� ��õ �帮�� �޴��� " + a + "�Դϴ�.");
	}	
}
