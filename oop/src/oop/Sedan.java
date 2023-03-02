package oop;

public class Sedan extends Car {
	
	int length;

	Sedan(int speed, double regularPrice, String color, int length) {
		super(length, regularPrice, color);
		this.length = length;		
	}
	
	double getSalePrice() {
		return (length > 20 ? regularPrice*0.05 : regularPrice*0.1);
	}
	
}
