package com.urdomain.lecture.test2;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl television = new Television();
		int volume = -10;
		
		television.turnOn();
		
		television.setMute(true);
		television.setMute(false);
		
		television.setVolume(volume);
		
		RemoteControl.changeBattery();
		
		television.turnOff();
		
	}

}
