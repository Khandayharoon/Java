package com.numbers;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
//		To find out whether the given String is Palindrome or not.
		System.out.println("Enter Any String : ");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		s.close();
		
		if(isPalindrome(str)) {
			System.out.print("Entered string is palindrome");
		}else {
			System.out.print("Entered string is not palindrome");
		}
	}

	private static boolean isPalindrome(String str) {
//		with the help of two sliding windows
		int left = 0;
		int right = str.length()-1;
//		System.out.print(right);
		while(left < right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
