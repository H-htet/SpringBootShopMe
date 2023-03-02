package oop;

public class TestInterface {
	public static void main(String []args) {
		Drawable d = new Circle();
		d.draw();
		d = new Rectangle();
		d.draw();		
		
	}
}

interface Drawable{
	//cant create normal method
	//abstract key cannot consist in abstract meathod
	//Use with implements keyword
	
	public void draw();
}

class Circle implements Drawable {

	@Override
	public void draw() {
		System.out.println("Draw circle");		
	}
	
}

class Rectangle implements Drawable{

	@Override
	public void draw() {
		System.out.println("Draw rectangle");
		
	}
	
}