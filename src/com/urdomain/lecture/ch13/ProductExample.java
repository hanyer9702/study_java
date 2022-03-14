package com.urdomain.lecture.ch13;

public class ProductExample {

	public static void main(String[] args) {
		Product<String, Integer> product = new Product<>();
		
		product.setKind("����");
		product.setModel(400);
		
		System.out.println("���� �������� ����: " + product.getKind() + " : " + product.getModel() + "�Դϴ�.");
		
		Product<Tv, String> product2 = new Product<>();
		product2.setKind(new Tv());
		product2.setModel("OLED TV");
		
		Tv rtTv = product2.getKind();
		String rtString = product2.getModel();
		
		System.out.println(rtTv + " : " + rtString);
		
		// product2 -> setKind -> field �� ����
		
		Product<Car, String> product3 = new Product<>();
		product3.setKind(new Car());
		product3.setModel("KIA");
		
		Car rtCar = product3.getKind();
		String rtStringCar = product3.getModel();
		
		System.out.println(rtCar + " : " + rtStringCar);
	}

}
