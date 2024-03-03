package com.numbers;
import java.util.Scanner;
public class EvenOdd {
	public static void main(String args[]) {
//		1. Write a program to print whether a number is even or odd, also take
//		input from the user.  – Done(29-02-2024)

		System.out.print("Please enter any number: ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		s.close();
		int i = 0;
		while(i <= num) {
			if(i % 2  == 0) {
				System.out.println ( i + " is Even number");
			}else {
				System.out.println( i + "  is Odd number");
			}
//			 i++;
//			 i = i+1;
			i+=1;
		}
	}
}
