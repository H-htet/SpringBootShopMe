package oop;

public class MyOwnAutoShop {	
	public static void main(String[] args) {
		Sedan s = new Sedan(60, 86800, "Black", 17);
		Ford f1 = new Ford(64, 30975, "Gray", 2019, 8000);
		Ford f2 = new Ford(63, 32765, "Silver", 2020, 6000);
		Car c = new Car(65, 33500, "White");		
		System.out.println("$" + s.getSalePrice());
		System.out.println("$" + f1.getSalePrice());
		System.out.println("$" + f2.getSalePrice());
		System.out.println("$" + c.getSalePrice());		
	}	
	
	/*public static void main(String[] args) {
		Car obj1 = new Sedan(60, 86800, "Black", 17);
		System.out.println(obj1.getSalePrice());		
		Car obj2 = new Ford(64, 30975, "Gray", 2019, 8000);
		System.out.println(obj2.getSalePrice());
		Car obj3 = new Ford(63, 32765, "Silver", 2020, 6000);
		System.out.println(obj3.getSalePrice());
		Car obj4 = new Truck(61, 40000, "Blue", 2000);
		System.out.println(obj4.getSalePrice());
		
		Sedan s = new Sedan(1211, 21111, "apple", 11100);
		Ford f1 = new Ford(111, 1111, "poo", 250000, 10);
		Ford f2 = new Ford(1141, 11611, "pooe", 300000, 20);
		Truck t = new Truck(113,50000,"bee",41126);
		Car c = new Car(65, 20000, "White");	
		System.out.println(s.getSalePrice());
		System.out.println(f1.getSalePrice());
		System.out.println(f2.getSalePrice());
		System.out.println(t.getSalePrice());	
		System.out.println(c.getSalePrice());	
	
	}*/	
}
