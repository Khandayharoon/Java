package com.numbers;
import java.util.Scanner;
public class choice {

	public static void main(String args[])
	{
//		4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
//		(Use if conditions)

		System.out.println("Please Enter 2 numbers and a operator: ");
		int a,b;
		char c;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		c = s.next().charAt(0);
		s.close();

		if(c == '+') {
			System.out.println(a+b);
		}else if(c == '-') {
			System.out.println(a-b);
		}else if(c == '*') {
			System.out.println(a*b);
		}else if( c == '/') {
			System.out.println(a/b);
		}

	}
}
