package com.numbers;
import java.util.Scanner;
public class Greeting {

	public static void main(String args[]) {
//		
//		2. Take name as input and print a greeting message for that particular name. 
//		Done on Same data above
		
		System.out.print("Please Enter you name: ");
		Scanner s = new Scanner(System.in);
		String name = s.next();
		s.close();

		System.out.println("Hi " + name + " Hope you are doing well!" );
	}
}
