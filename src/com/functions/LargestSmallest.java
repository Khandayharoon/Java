package com.functions;

import java.util.Scanner;

public class LargestSmallest {

	public static void main(String[] args) {
		largestSmallest();

	}

	private static void largestSmallest() {
		System.out.println("Please Enter the three Numbers");
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 =  in.nextInt();
		
		int max = Math.max(num1, Math.max(num2, num3));
		int min = Math.min(num1,Math.min(num2, num3));
		System.out.println("Largest Number is : " + max);
		System.out.println("Smallest Number is : " + min);
		in.close();
	}

}
