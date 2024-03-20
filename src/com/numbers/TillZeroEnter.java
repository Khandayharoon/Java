package com.numbers;

import java.util.Scanner;

public class TillZeroEnter {

	public static void main(String[] args) {
// Take integer inputs till the user enters 0 and print the largest number from
//		all.
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number when you want to stop press zero");
		int num;
		int per = 0;
		while (true) {
			num = s.nextInt();
			if (num == 0) {
				break;
			}
			if (num >  per) {
				per =  num;
			}
				
		}

		System.out.println("largest Number entered so far : " + per);
	s.close();
	}

}
