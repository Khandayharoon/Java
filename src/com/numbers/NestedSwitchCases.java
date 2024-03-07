package com.numbers;

import java.util.Scanner;

public class NestedSwitchCases {

	public static void main(String[] args) {
		System.out.println("Enter the ID");
		Scanner in = new Scanner(System.in);
		int id = in.nextInt();
		System.out.println("enter the department");
		String dep = in.next();
		in.close();
		
		switch(id){
			
		case 1:
			System.out.println("Hk");
			break;
			
		case 2:
			System.out.println("Khan");
			break;
	
		case 3:
			System.out.println("Alexa");
			break;
			
		case 4:
			switch(dep) {
			
			case "IT" -> System.out.println("IT Deparment");
			case "HR" -> System.out.println("HR Deparment");
			case "SR" -> System.out.println("Sr Deparment");
			
			}
		}
	}

}
