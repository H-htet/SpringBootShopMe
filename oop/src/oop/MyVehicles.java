package oop;

public class MyVehicles {
	public static void main(String[] args) {
		Vehicles obj = new Cars();
		obj.getType();
		obj.getColor();
		obj.getBrandName();
		obj = new Bicycles();
		obj.getType();
		obj.getColor();
		obj.getBrandName();
	}
}
