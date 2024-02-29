package com.numbers;
import java.util.Scanner;
public class SimpleInterest {

	public static void main(String args []) {
		int principal , rate , time;
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter the below Values: ");
		System.out.println("please Enter Principal: ");
		principal =  s.nextInt();
		System.out.println("please Enter rate: ");
		rate =  s.nextInt();
		System.out.println("please Enter time: ");
		time =  s.nextInt();
		s.close();
		 double si = (principal * rate * time) / 100.0; // Convert one operand to double
	        System.out.print("The Simple Interest is: " + si);
}
}