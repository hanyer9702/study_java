package com.urdomain.lecture.test2;

public interface RemoteControl {
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
	public default void setMute(boolean mute) {
		if(mute == true) {
			System.out.println("����ó���մϴ�.");
		} else {
			System.out.println("���������մϴ�.");
		}
	}
	public static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
	
}
