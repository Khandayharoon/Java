package com.numbers;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// Area Of Triangle
		//formula is Area = 1/2 (base*height);

		System.out.println("Enter the Base and Height of triangle");
		Scanner s = new Scanner(System.in);
		
		int base = s.nextInt();
		int height = s.nextInt();
		s.close();
		
		calculateAreaOfTriangle(base,height);
	}

	private static void calculateAreaOfTriangle(int base, int height) {
		
		double area = 0.5 * base * height;
	    System.out.println(area);
		
	}

}
