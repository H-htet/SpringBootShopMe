package oop;

public class TestAbstractClass {
	public static void main(String []args) {
		Programmer p = new Programmer();
		p.task(); p.officeRules();
		Tester t = new Tester();
		t.task(); t.officeRules();
		
		Staff s = new Programmer();
		s.task(); s.officeRules();
	}
}

abstract class Staff{
	public void officeRules() {
		System.out.println("Start Time 9:00");
		System.out.println("End Time 6:00");
		System.out.println("Lunch Time 12:00-1:00");
	}
	
	public abstract void task();
}

class Programmer extends Staff{
	public void task() {
		System.out.println("coding....");
	}
}

class Tester extends Staff{

	@Override
	public void task() {
		System.out.println("testing....");
		
	}

}


