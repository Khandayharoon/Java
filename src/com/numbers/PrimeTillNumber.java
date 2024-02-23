package com.numbers;
import java.util.Scanner;
public class PrimeTillNumber {

	public static void main(String[] args) {
		int num;
		System.out.print("Please Enter Any Number:");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		s.close();
		
		for(int i=2; i<=num; i++) {
			//here for each ith value we will isprime for that ith value 
			//isprime will check is that value is prime or not
			if(isPrime(i)) {
				System.out.println(i + " : is prime number ");
			}else {
				System.out.println(i + " : is not prime number ");
			}
		}


	}

	//	this Method will check Each i value is Prime or not and return true/False
	private static boolean isPrime(int n) {
		if(n <=1) {
			return false;
		}

		for(int i=2; i<= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}

		return true;
	}

}
