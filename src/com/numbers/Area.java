package com.numbers;

public class Area {

	public static void main(String[] args) {
/**
		 Area Of Rectangle Program  Formula: Area=Length×Width
		 Area Of Isosceles Triangle Formula: 0.5 *base * height
		 Area Of Parallelogram Formula: base * height
		 Area Of Rhombus Formula: 0.5 * digonal1 * digonal2
		 Area Of Equilateral Triangle Formula: root 3 / 4 * a(Side)^2
*/
		
		AreaOfRectangle();
		AreaOfIsoscelesTriangle();
		AreaOfParallelogram();
		AreaOfRhombus();
		AreaOfEquilateralTriangle();

	}
	public static void  AreaOfRectangle() {
		int lenght = 5;
		int width = 9 ;
		int Area = lenght * width;
		System.out.println(" Area Of Rectangle is: " + Area);
	}

	public static void AreaOfIsoscelesTriangle() {
		
		int base = 6; 
		int height = 9;
		
		double area = 0.5 * base * height;
		System.out.println(" Area Of Isosceles Triangle is: " + area);
	}
	
	public static void AreaOfParallelogram() {
		int base = 7;
		int height = 89;
		System.out.println(" Area Of Parallelogram is : " + (base*height));
	}
	
	public static void AreaOfRhombus() {
		int d1 =34;
		int d2 = 45;
		
		double area = 0.5 * d1 * d2;
		System.out.println(" Area Of Rhombus is : " +  area);
	}

	public static void AreaOfEquilateralTriangle() {
		int side = 4;
		double area = Math.sqrt(3)/4 * side * side ;
		System.out.println(" Area Of Equilateral Triangle is :" + area);
	}
}
