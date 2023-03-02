package oop;

public class Car {
	
	int speed;
	double regularPrice;
	String color;
	
	Car(int speed, double regularPrice, String color) {
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
		//System.out.println("Speed: " + speed + " Regular Price: " + regularPrice + " color: " + color);
	}
	
	double getSalePrice() {		
		return regularPrice;
	}	
	
}
