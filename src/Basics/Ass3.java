package Basics;

public class Ass3 {
/*
 * 3 functions that take an array as a parameter and return the minimum, 
 * average, and maximum values of that array.
 * Hint: this should be static functions with a return type of the same 
 * data type as the array declaration.
 */
	public static void main(String[] args) {
		double[] dataArray = {4.0, 6.0, 10.0, 12.0, 2.0};
		
		System.out.println("The minimum is: " + minNum(dataArray));
		System.out.println("The average is: " + aveNum(dataArray));
		System.out.println("The maximum is: " + maxNum(dataArray));
	}

	public static double minNum(double[] x) {
		double min = 0.0;
		
		min = x[0];
		for(int i=0; i< x.length; i++ ) {
			if (x[i] < min) {
				min = x[i];
			}
		}	
		return min;
	}
	public static double aveNum(double[] x) {
		double total = 0.0;
		double ave = 0.0;
		
		for(int i=0; i< x.length;i++) {
			total = total + (double)(x[i]);
		}

		ave = total/(double)(x.length);
		
		return ave;
	}
	public static double maxNum(double[] x) {
		double max = 0;
		
		max = x[0];
		for(int i=0; i< x.length; i++ ) {
			if (x[i] > max) {
				max = x[i];
			}
		}	
		return max;
	}
}
