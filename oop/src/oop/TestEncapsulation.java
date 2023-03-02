package oop;

public class TestEncapsulation {
	public static void main(String[] args) {
		StudentBean s = new StudentBean();
		s.setId(1);
		s.setName("David");
		System.out.println(s.getId());
		System.out.println(s.getName());
	}
}
