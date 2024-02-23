package com.numbers;
import java.util.Scanner;
public class EvenAndOdd {
	public static void main(String args []) {
		int num;
		System.out.print("Enter Any Number :");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		System.out.println();
		int evenIndex = 0;
		int oddIndex = 0;
		int evenArray [] = new int [num/2];
		int oddArray [] = new int [num/2];
		for(int i=1; i<=num; i++) {
			if(i % 2 == 0) {
				//	System.out.println( i + " is Even Number");
				evenArray[evenIndex] = i;
				evenIndex++;
			}else {
				//	System.out.println(i + " is Odd Number");
				oddArray[oddIndex] = i;
				oddIndex++;
			}
		}

		for(int i=0; i<evenArray.length ;i++) {
			System.out.println(" Even number Array " + evenArray[i]);
		}
		System.out.println();
		for(int i=0; i<oddArray.length;i++) {
			System.out.println(" Odd number Array " + oddArray[i]);
		}
		s.close();	
	}
}
