package oop;

public class TestOverriding {
	public static void main (String []args) {
		KBZ k=new KBZ();
		System.out.println(k.interestRate());
		CB c=new CB();
		System.out.println(c.interestRate());
	}
}

class Bank{	
	public double interestRate() {
		return 8.0;
	}
}

class KBZ extends Bank{
	public double interestRate() {
		return 7.5;
	}
}

class CB extends Bank{	
	public double interestRate() {
		return 7.8 ;		
	}		
}
