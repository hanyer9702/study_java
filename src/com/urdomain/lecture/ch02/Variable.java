package com.urdomain.lecture.ch02;

public class Variable {

	public static void main(String[] args) {
		
//		���� ����
//		ù���� �ҹ��� �׸��� ���� ���ڿ� ���ʹ� �빮��
//		��� �������� �ٿ��� ���
		String fullName = "Yerin Han";
		String name = "Yerin";		
		
//		��ҹ��� ������
		
		int roomNumber = 1;
		int roomnumber = 2;
		
		System.out.println("roomNumber: " + roomNumber);
		System.out.println("roomnumber: " + roomnumber);
				
//		������ ��� �� �� ����.
//		int int = 2; error
		
//		���� 1. ���� �� 2. ��� (2.1.���� 2.2�б�)
//		��������
//		���� �ʱ�ȭ (������ ó������ �� ����)
		int a; // ���� : ��� �� �� ����
		a = 1; // ����
		int b = 1; // ����� �ʱ�ȭ
		
		int c = 0;
		
		c= a + b;
//		���� �ʱ�ȭ �Ͽ��� �޸𸮿� ���� �ǰ� ���꿡 �̿� �� �� �ִ�.
		
//		---------------------------------------------
		
//		�׷��� ��������� �ʱ�ȭ�� �ϴ� ������ ������

//		�������� 0
//		�Ǽ����� 0.0
//		�������� '' �Ǵ� ""
		
		boolean defaultNy = false;
		byte aa = 0;
		short bb = 0;
		int cc = 0;
		long dd = 0;
		
		float ee = 0.0f;
		double ff = 0.0;
		
		char gg = ' ';
		
		String hh = "";
		
		
//		���� ��� (������ ���� & ������ ����)
		
//		���ͷ� = ������
//		ex)���������ͷ� = ������������
		
//		�̽������� ����
		System.out.println(c);
		System.out.println("Yerin Han");
		System.out.println("Yerin Han : " + c + "cool");
		
		System.out.println("��ĭ�鿩����");
		System.out.println("\t��ĭ�鿩����");
		
		System.out.println("���ٹٲ�1");
		System.out.println("\n���ٹٲ�1");
		
		System.out.println("���ٹٲ�2");
		System.out.println("\r���ٹٲ�2");
		
		System.out.println("\'���� �����Ѵ�\'");
		System.out.println("��ũ���׽��� ���ߴ� \"���� �����Ѵ�.\"");
		System.out.println("\\");
		
		//������ ����
		//������ ����� �� �������� ��� �����ϴ�.
		
		if(a == 1) {
			int aaa = 10;
			int bbb = aaa + a;
			System.out.println("bbb: " + bbb);
		} else {
			
		}
		
//		System.out.println("bbb: " + bbb); //error
		
	}

}
