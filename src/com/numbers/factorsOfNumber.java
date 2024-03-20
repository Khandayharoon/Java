package com.numbers;

import java.util.ArrayList;
import java.util.Scanner;

public class factorsOfNumber {

	public static void main(String[] args) {
		System.out.println("Please Enter any Number");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for( int i=1; i<=num; i++) {
			if(num % i ==0) {
				factors.add(i);
			}
		}
		System.out.println(factors);
	}

}
