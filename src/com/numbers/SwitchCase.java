package com.numbers;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		System.out.println("Please Enter a Fruit name: ");
		
		Scanner in = new Scanner(System.in);
		String fruit = in.next();
		
		switch(fruit) {
		
		case "Mango":
			System.out.println("King of Fruits");
			break;
		
		case "Apple":
			System.out.println("A sweet red fruit");
			break;
			
		case "Kiwi":
			System.out.println("Green fruit");
			break;
			
		case "Orange":
			System.out.println("A round fruit");
		
		default:
			System.out.println("Plese enter a vaild fruit");
		}
				
		in.close();
	}

}
