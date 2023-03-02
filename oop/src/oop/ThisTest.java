package oop;

public class ThisTest {
	int modelYear;
	String modelName;

	ThisTest(int year, String name) {
		this.modelYear = year;
		this.modelName = name;
	}
	
	public static void main(String []args) {
		ThisTest myThisTest = new ThisTest(1969, "Mastang");
		System.out.println(myThisTest.modelYear + " " + myThisTest.modelName);
	}

}
