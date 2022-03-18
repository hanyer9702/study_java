package com.urdomain.lecture.ch15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		//Map �÷��� ����
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//��ü ����
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
//		map.put("ȫ�浿", 95);
		System.out.println("�� Entry ��: " + map.size());
		
		//��ü ã��
//		System.out.println("\tȫ�浿 : " + map.get("ȫ�浿"));
//		System.out.println();
		
		//��ü�� �ϳ��� ó��
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		//��ü ����
//		map.remove("ȫ�浿");
//		System.out.println("�� Entry ��: " + map.size());
		
		Map<String, Integer> map2 = new LinkedHashMap<>();
		
		map2.put("�ſ��", 85);
		map2.put("ȫ�浿", 90);
		map2.put("���屺", 80);
		
		Set<String> keySet2 = map2.keySet();
		Iterator<String> keyIterator2 = keySet2.iterator();
		while(keyIterator2.hasNext()) {
			String key = keyIterator2.next();
			Integer value = map2.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
	}

}
