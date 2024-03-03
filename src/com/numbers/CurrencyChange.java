package com.numbers;

import java.util.Scanner;

public class CurrencyChange {

	public static void main(String args []) {
//		6. Input currency in Rupees and output in USD.
	
		System.out.println("Please enter your Currency in IND:");
		Scanner s = new Scanner(System.in);
		float inr = s.nextInt();
		s.close();
		
		System.out.println("Curreny in Dollar's :" + (inr / 82.91));
	}
}
