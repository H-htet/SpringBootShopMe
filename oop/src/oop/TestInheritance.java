package oop;

public class TestInheritance {
	public static void main (String []args) {
		Dog d=new Dog();
		d.bark();
		d.eat(); d.sleep();
		Cat c=new Cat();
		c.meow();
		c.eat(); c.sleep();
		Animal a= new Animal();
		a.eat(); a.sleep();
	}
}

class Animal{
	public void eat() {
		System.out.println("eating...");
	}
	
	public void sleep() {
		System.out.println("sleeping...");
	}
}

class Dog extends Animal{
	public void bark() {
		System.out.println("barking...");
	}
}

class Cat extends Animal{
	public void meow() {
		System.out.println("meowing");
	}
}
