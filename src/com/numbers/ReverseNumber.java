package com.numbers;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num = 12345;
		int org = 0;
		
		while(num > 0) {
			int rem =  num % 10;
			org = org * 10 + rem;
			num /= 10;
		}
		System.out.println(org);
	}

}
