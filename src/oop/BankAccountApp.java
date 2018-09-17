package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// polymorphism through overloading
		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount("Checking Account");
		
		//good practice is to not let clients define variables like that. 
		//Instead use get and set methods.
		//This is called Encapsulation e.g:
		//acc1.name="Mary Jones"; (bad)
		acc1.setName("Mary Jones");
		System.out.println(acc1.getName());
		
		acc1.accountNumber = "23415345256";
		acc1.deposit(1000);
		acc1.accountType = "Saving Account";
		
		//polymorphism through overriding
		System.out.println(acc1.toString());
		
		
		//acc2.accountNumber = "43524354355";
		
		
		/* demo inheritance */
		//will also inherit the parent object's construct
	/*	CDAccount demo = new CDAccount();
		demo.name="Sam";
		demo.accountType = "CD Account";
		demo.deposit(4000);
		demo.deposit(1500);
		demo.withdraw(500);
		demo.interestRate = 3.9;
		System.out.println(demo.toString()); */
	}

}
