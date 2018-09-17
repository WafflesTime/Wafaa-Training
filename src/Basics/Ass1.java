package Basics;

public class Ass1 {

	public static void main(String[] args) {
		System.out.println(computeSum(5));
	}

	public static int computeSum(int n) {
		if (n==0) {
			return 0;
		}else if (n ==1) {
			return 1;
		}
		
		return n + computeSum(n-1);
	}
}
