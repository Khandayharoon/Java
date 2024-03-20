package com.numbers;

public class Perimeter {

	public static void main(String[] args) {
		
		/** 
		 Perimeter Of Circle P=2πr (r=radius);
		 Perimeter Of Equilateral Triangle P=3s (s=side);
		 Perimeter Of Parallelogram P=2(a+b) (a,b are 2 adjuecnt sides)
		 Perimeter Of Rectangle  P=2(l+w) 
		 Perimeter Of Square P=4s (s=side)
		 Perimeter Of Rhombus P=4s (s=side)

		 */
		PerimeterofCircle();
		PerimeterOfEquilateralTriangle();
		PerimeterOfParallelogram();
		PerimeterOfRectangle();
		PerimeterOfSquare();
		PerimeterOfRhombus();
	}

	private static void PerimeterOfRhombus() {
		 int side = 12;
		 int perimeter = 4 * side;
		 System.out.println("Perimeter Of Rhombus is : " + perimeter);
		
	}

	private static void PerimeterOfSquare() {

		 int side = 12;
		 int perimeter = 4 * side;
		 System.out.println("Perimeter Of Square is : " + perimeter);
	}

	private static void PerimeterOfRectangle() {
		 int length = 67;
		 int width = 34;
		 int perimerter = 2 * (length + width);
		 System.out.println("Perimeter Of Rectangle is :" + perimerter);
	}

	private static void PerimeterOfParallelogram() {
		 int sideA = 45;
		 int sideB = 34;
		int  perimeter = 2 * (sideA + sideB);
		 System.out.println("Perimeter Of Parallelogram is :" + perimeter);
		
	}

	private static void PerimeterOfEquilateralTriangle() {
		int side = 56;
		int perimeter = 3 * side;
		System.out.println("Perimeter Of Equilateral Triangle is :"+perimeter);;
		
	}

	private static void PerimeterofCircle() {

		int radius = 5;
		double perimeter = 2 * Math.PI * radius;
		System.out.println("Perimeter of Circle  is : " + perimeter);
		
	}

	
	 
	
	
	
	
	
}
