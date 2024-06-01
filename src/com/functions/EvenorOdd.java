package com.functions;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		System.out.println("Please Enter any Number:- ");
		Scanner s = new Scanner(System.in);
		int num  = s.nextInt();
		evenorodd(num);
		s.close();
	}

	private static void evenorodd(int num) {
		if(num % 2 == 0) {
			System.out.println("Entered Number " + num +" is Even Number");
		}else {
			System.out.println("Entered Number " + num +" is Odd Number");
		}
	}

}
