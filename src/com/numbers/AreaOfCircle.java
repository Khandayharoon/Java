package com.numbers;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
//		Q:- Area Of Circle Java Program 
//		Formula :- PI * Radius square
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the radius of Circle:");
		double radius = s.nextDouble();
		s.close();
		calculateAreaOfCiclre(radius);
	}

	private static void calculateAreaOfCiclre(double radius) {
		
		System.out.println( Math.PI * radius * radius);
		
	}

}
