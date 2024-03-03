package com.numbers;
import java.util.Scanner;
public class LargestAmong {
	public static void main(String [] args) {

		//5. Take 2 numbers as input and print the largest number.

		System.out.println("Please enter two numbers: ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int num2 = s.nextInt();
		s.close();
		if(num>num2) {
			System.out.println(num +" is the Largest Number");
		}else {
			System.out.println(num2 +" is the Largest Number");
		}
	}
}
