package com.numbers;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		//9. To find Armstrong Number between two given number.

		System.out.print("Please Enter any number: ");
		Scanner s = new Scanner (System.in);
		int num = s.nextInt();
		s.close();

		isArmstrong(num);
	}

	private static void isArmstrong(int num) {

		int copy = num;
		int result = 0;
		String numStr = String.valueOf(num);
		int  count  = numStr.length();
		while(num>0) {
			//		here will get reminder
			int rem = num % 10;

			//			here will get get the  result;
			result =  (int) (result + Math.pow(rem,count));

			num = num /10;
		}
		if(result == copy) {
			System.out.print(copy + " is ArmStrong Number");
		}
		else {
			System.out.print(copy + " is not ArmStrong Number");
		}
	}

}
