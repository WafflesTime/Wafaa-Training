package oop;

public class BankAccount implements IRate{

	/*Attributes */
	
	/*static variables*/
	//static: belongs to the class, not the individual objects.
	//final: constant (static and void often used together)
	//private: belongs to the class and can't be accessed from outside.
	private static final String routingNumber = "4456";
	private static int id = 100;
	//instance variables
	String accountNumber;
	String name;
	String accountType;
	String ssn;
	double balance = 0;
	
	/*Constructs*/
	BankAccount(){
		System.out.println("New Account Created");
		id++;
	}
	
	BankAccount(String accountType){
		this.accountType= accountType;
		System.out.println("New Account Created, Account Type: "+ accountType);
		id++;
		
	}
	BankAccount(String accountType, double initDeposit){
		
	}
	
	
	/* methods */
	public void deposit(double value) {
		balance=balance+value;
		showActivity("DEPOSIT");
	}
	public void withdraw(double value) {
		balance=balance - value;
		showActivity("WITHDRAW");
	}
	
	public void checkBalance() {
		System.out.println(balance);
		showActivity("CHECK BALANCE");
	}
	
	private void showActivity(String activity) {
		
		System.out.println("Your recent transaction: "+activity);
		System.out.println("Your new balance = "+ balance);
		
	}
	// get and set methods (used for Encapsulation)
	
	public void setName(String name) {
		this.name=name;
		
	}
	public String getName() {
		return name;
	}
	
	//demo override: overriding a public method from the parent class (default parent calls is 'Object')
	public String toString() {
		return "[Name: " + name + ", Account#: "+ accountNumber + ", Rounting#: " + routingNumber +", Balance: "+ balance + ", Account Type: " + accountType +"]";
	}

	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void increateRate() {
		// TODO Auto-generated method stub
		
	}
}
