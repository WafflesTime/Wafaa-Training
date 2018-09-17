package Basics;

public class SalaryCalculator {

	public static void main(String[] args) {
		// Declare a variable
		String career;
		
		//Define a variable
		career = "Test Analyst";
		System.out.println("My career " + career);
		
		int hoursPerWeek = 40;
		int weeksPerYear = 48;
		double rate = 90.00;
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		
		System.out.println("My salary as a " + career + " at the rate of $" + rate +" per hour is $"+ salary + " per year.");
	}

}
