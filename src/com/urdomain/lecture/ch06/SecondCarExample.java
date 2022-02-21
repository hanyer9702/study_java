package com.urdomain.lecture.ch06;

public class SecondCarExample {

	public static void main(String[] args) {

		SecondCar secondCar1 = new SecondCar();
		
		System.out.println("-----------------------");
		System.out.println("secondCar1.company: " + secondCar1.company);
		System.out.println("secondCar1.model: " + secondCar1.model);
		System.out.println("secondCar1.color: " + secondCar1.color);
		System.out.println("secondCar1.maxSpeed: " + secondCar1.maxSpeed);
		
		SecondCar secondCar2 = new SecondCar("PALISADE");
		
		System.out.println("-----------------------");
		System.out.println("secondCar2.company: " + secondCar2.company);
		System.out.println("secondCar2.model: " + secondCar2.model);
		System.out.println("secondCar2.color: " + secondCar2.color);
		System.out.println("secondCar2.maxSpeed: " + secondCar2.maxSpeed);

		SecondCar secondCar3 = new SecondCar("SANTA FE", "black");
		
		System.out.println("-----------------------");
		System.out.println("secondCar3.company: " + secondCar3.company);
		System.out.println("secondCar3.model: " + secondCar3.model);
		System.out.println("secondCar3.color: " + secondCar3.color);
		System.out.println("secondCar3.maxSpeed: " + secondCar3.maxSpeed);
		
		SecondCar secondCar4 = new SecondCar("TUCSON", "white", 200);
		
		System.out.println("-----------------------");
		System.out.println("secondCar4.company: " + secondCar4.company);
		System.out.println("secondCar4.model: " + secondCar4.model);
		System.out.println("secondCar4.color: " + secondCar4.color);
		System.out.println("secondCar4.maxSpeed: " + secondCar4.maxSpeed);
	}

}
