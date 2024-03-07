package com.numbers;

import java.util.Scanner;

public class EnhancedSwitchCaseSyntax {

	public static void main(String[] args) {
		
		System.out.print("Please enter any fruit:");
		
		Scanner scan = new Scanner(System.in);
		String fruit = scan.next();
		
		
		switch(fruit) {
		case "Mango"-> System.out.println("A king of fruits");
		case "Apple" -> System.out.println("A sweet red fruit");
		case "Kiwi" -> System.out.println("A green fruit");
		case "Grapes" -> System.out.println("A small fruit");
		case "orange" -> System.out.println("A roung fruit");
		default -> System.out.println("Please enter a vaild fruit");
		}
		System.out.println();
		System.out.print("Please enter a day of week: ");
		int day = scan.nextInt();
		scan.close();
		
		switch (day) {
		
		case 1 ->System.out.println("Modnay");
		case 2 ->System.out.println("Tuesday");
		case 3 ->System.out.println("Wednesday");
		case 4 ->System.out.println("Thursday");
		case 5 ->System.out.println("Friday");
		case 6 ->System.out.println("Saturday");
		case 7 ->System.out.println("Sunday");
		default -> System.out.println("please Enter vaild weekday");
		
		}
		
		
		switch(day) {
		case 1,2,3,4,5 -> System.out.println("Weekday");
		case 6,7 -> System.out.println("Weekend");
		}
	}

}
