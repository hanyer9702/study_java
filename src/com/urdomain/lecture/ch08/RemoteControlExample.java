package com.urdomain.lecture.ch08;

public class RemoteControlExample {

	public static void main(String[] args) {

//		Audio audio = new Audio();
		Television television = new Television();
		
//		audio.turnOn();
//		audio.turnOff();
		television.turnOn();
		television.turnOff();
		
		System.out.println();
		
//		�������̽��� ������ Ŭ������ ���� ó�� �Ϲ�Ŭ���� ��ü ������� �ϸ� �ȵȴ�.
		
////		�������̽��� ������ Ŭ������ ����ؾ� �ȴ�. �Ҷ���
//		RemoteControl remoteControl;	// �������̽� ���� ����
//		remoteControl = new Audio();	// ������ü�� �ʱ�ȭ
		
//		RemoteControl remoteControl = new Audio();
		RemoteControl remoteControl = new Television();
		
		remoteControl.turnOn();
		remoteControl.turnOff();
	}

}
