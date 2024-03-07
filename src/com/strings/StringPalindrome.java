package com.strings;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		System.out.print("Enter String: ");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		s.close();
		isStringPalindrome(str);
	}

	private static void isStringPalindrome(String str) {
		
		String rev = "";
		for(int i=0; i<str.length(); i++) {
			rev = str.charAt(i) + rev;
		}
		if(str.equals(rev)) {
			System.out.println("String is Plindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}

}
