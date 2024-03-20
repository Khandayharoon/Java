package com.numbers;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

			System.out.print("Enter any Number:");
			Scanner s = new Scanner(System.in);
			int num = s.nextInt();
			s.close();
			
			int fact = 1;
			for(int i=1; i<=num; i++) {
				fact = fact * i;
			}
			
			System.out.println("Factorial of "+ num + " is : " + fact);
	}

}
