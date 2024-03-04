package com.numbers;
import java.util.Scanner;
public class NthFib {
	public static void main (String [] args) {
		System.out.print("Please Enter Any Number: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		
	 int p = 0;
	 int i = 1;
	 int count = 2;
	 
	 while(count <=n) {
		 int temp = i;
		 i = i + p;
		 p = temp;
		 count++;
	 }
	 System.out.println(i);
	}
}
