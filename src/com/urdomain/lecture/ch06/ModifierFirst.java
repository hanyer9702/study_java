package com.urdomain.lecture.ch06;

class ModifierFirst {		// class : public, (default) �� ����

	
	public String name = "";	// field : public, protected, (default), private ��ü ����
	public String ssn = "";
	
	public ModifierFirst(String ssn) {	// constructor : public, protected, (default), private ��ü ����
		this.ssn = ssn;
	}
	
	public int add(int x, int y) {		// method : public, protected, (default), private ��ü ����
		return x + y;
	}
	
}
