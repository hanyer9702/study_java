package com.urdomain.lecture.ch05;

import java.util.Scanner;

public class KingOfKing {

	public static void main(String[] args) {
		
		recommendMenu();
	}
	
	public static void recommendMenu() {
		Scanner sca = new Scanner(System.in);
		System.out.println("���Ͻô� ī�װ��� ������ �ּ���.");
		System.out.println("�߽� = 1" + " �ѽ� = 2" + " ��� = 3" + " �Ͻ� = 4" + " ���Ͻô� ī�װ��� ���ڷ� �Է����ּ���");
		int category = sca.nextInt();
		printMenu(category);
		
	}
	
	public static void printMenu(int cate) {
		String food[] = new String[5];
		String category[] = {"", "�߽�", "�ѽ�", "���", "�Ͻ�"};
		food[1] = "¥���";
		food[2] = "��������";
		food[3] = "�˸����ø���";
		food[4] = "��Ÿ��";
		System.out.println("���� ��õ �帮�� " + category[cate] + "�޴��� " + food[cate] + " �Դϴ�.");
	}

}
