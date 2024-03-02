package com.numbers;
import java.util.Scanner;
public class Fibseries {

	//	7. To calculate Fibonacci Series up to n numbers.
	public static void main(String args []) {
		System.out.println("Please Enter Any number: ");
		int num;
		Scanner s  = new Scanner(System.in);
		num =  s.nextInt();
		s.close();
		fibseries(num);
	}

	private static void fibseries(int num) {

		int a = 0;
		int b = 1;
		// Start from 2 as we have already 
		//	printed first two numbers (0 and 1)
		int i = 2;
		System.out.print(a +" " +b+" ");
		while(i <= num) {
			int c = a + b;
			System.out.print(c+" ");
			a =  b;
			b = c;
			i++;
		}
	}	

}
