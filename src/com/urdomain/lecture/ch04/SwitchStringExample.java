package com.urdomain.lecture.ch04;

public class SwitchStringExample {

	public static void main(String[] args) {

		String position = "����";
		
		switch (position) {
			case "���":
				System.out.println("���� 300����");
				break;
			case "�븮":
				System.out.println("���� 400����");
				break;
			case "����":
				System.out.println("���� 500����");
				break;
			case "����":
				System.out.println("���� 600����");
				break;
			default:
				System.out.println("�⺻������");
				break;
		}

	}

}
