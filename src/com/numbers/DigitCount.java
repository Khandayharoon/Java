package com.numbers;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = s.nextInt();
		System.out.println("Enter a Digit from Above Number");
		int d = s.nextInt();
		s.close();
		int count = 0;
		while(num>0) {
			int rem = num % 10;
			if(rem == d) {
				count ++;
			  }

			num = num /10;
		}

		System.out.println(d + " is in Entered number " + count + " times!!" );
	}

}
