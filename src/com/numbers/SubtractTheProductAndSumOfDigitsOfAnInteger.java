package com.numbers;
import java.util.Scanner;
public class SubtractTheProductAndSumOfDigitsOfAnInteger {
	/**
	 	Question:
		Input: n = 234
		Output: 15 
		Explanation: 
		Product of digits = 2 * 3 * 4 = 24 
		Sum of digits = 2 + 3 + 4 = 9 
		Result = 24 - 9 = 15
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter Any Number");
		int num = s.nextInt();
		theProductAndSumOfDigitsOfAnInteger(num);
		s.close();
	}
	private static void theProductAndSumOfDigitsOfAnInteger(int num) {
		int copy = num;
		int Sum = 0;
		int product = 1;
		int result = 0;
		while (num > 0) {
			int rem = num % 10;
			Sum += rem;
			product *= rem;
			num /= 10;
		}
		result = product - Sum;
		System.out.println("Sum of digits of " + copy +" is  : " + Sum);
		System.out.println("Product of digits of " + copy +" is  : " + product);
		System.out.println("Result " + copy +" is  : " + result);
	}
}
