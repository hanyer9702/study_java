package com.urdomain.lecture.ch08;

public interface RemoteControl {

	//���
	int MAX_VOLUME = 10;			//public static final �����Ǿ� ����
	int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ� : ���� Ŭ�������� ������ �������̵� �ؾ� �ȴ�.
	void turnOn();					// public abstract
	void turnOff();
	void setVolume(int volume);
	
	//����Ʈ �޼ҵ� : public ���� ����
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	//���� �޼ҵ� : public ���� ����
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
