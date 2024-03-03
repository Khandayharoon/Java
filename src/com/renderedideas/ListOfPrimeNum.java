package com.renderedideas;

import java.util.Scanner;

public class ListOfPrimeNum {

	public static void main(String[] args) {
		System.out.print("Please enter a number:");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		s.close();
		for(int i=2; i<num; i++) {
			if(isPrime(i)) {
				System.out.println(i +" is Prime Number");
			}
		}
	}

	private static boolean isPrime(int num) {
			
		if(num < 1) {
			return false;
		}
		
		for(int i = 2; i<= Math.sqrt(num); i++) {
			if(num % i == 0 ) {
				return false;
			}
		}
		return true;
	}

}
