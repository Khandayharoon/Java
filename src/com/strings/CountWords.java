package com.strings;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		
		System.out.println("Please enter any string");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		countWordsInString(str);

	}

	private static void countWordsInString(String str) {
//		int spaces = 0;
//		if(str.length()==0) {
//			System.out.println("Empty String");
//		}
//		for(int i=0; i<str.length(); i++) {
//			if(str.charAt(i) == ' ') {
//				++spaces;
//			}
//		}
		String [] words = str.trim().split("\s+");
		
		
		System.out.println("Number of words: "+ (words.length));
	}

}
