package oop;

public class StudentApp {

	public static void main(String[] args) {
		
		Student a1 = new Student("John", "12345678");
		
		a1.setCity("Sin City");
		a1.setPhone("+619373464");
		a1.setState("California");
		
		System.out.println(a1.toString());

	}

}
