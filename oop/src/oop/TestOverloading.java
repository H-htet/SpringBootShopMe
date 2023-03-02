package oop;

public class TestOverloading {
	public static void main(String []args) {
		sum(4,5);
		sum(4,5,6);
		sum(4.3,5.6);
	}
	
	public static void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void sum(double a, double b) {
		System.out.println(a+b);
		sum(1,2);
	}
	
}
