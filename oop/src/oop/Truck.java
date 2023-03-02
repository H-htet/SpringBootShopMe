package oop;

public class Truck extends Car {	
	int weight;	
	Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}
	
	double getSalePrice() {		
		return (weight > 2000 ? regularPrice*0.1 : regularPrice*0.2);
	}	
}
