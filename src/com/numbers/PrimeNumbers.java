package com.numbers;
import java.util.Scanner;
public class PrimeNumbers {

	public static void main (String [] args) {

		int num;
		boolean isPrime = true;
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		s.close();

		for( int i=2; i<= Math.sqrt(num); i++) {
//			 here we use num/2 and for more efficiacny we can use Math.sqrt(num)
			if(num % i == 0) {
//				System.out.println(num + " is not a Prime Number");
				isPrime = false;
				break;
			}
		}
		if(isPrime && num > 1) {
			System.out.println(num + " : is a Prime Number");
		}else {
			System.out.println(num + " : is a not Prime Number");
		}
	
	
	}
}
