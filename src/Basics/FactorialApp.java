package Basics;

public class FactorialApp {

	public static void main(String[] args) {
		System.out.println(fact(0));

	}

	public static int fact(int n) {
		if (n==0) {
			return 1;
		}
		else if (n == 1) {
			return 1 * 1;
		}
		return (n * fact(n-1));
	}
}
