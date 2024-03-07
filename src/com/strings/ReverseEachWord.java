package com.strings;

public class ReverseEachWord {
	public static void main(String[] args) {
		String str = "abc def ghi";
		System.out.println( reverseEachWord(str) );
	}
	private static String reverseEachWord(String str) {
		//we will create an empty string
		String ans = "";
		int i=0;
		//current word index maintainer
		int currentWordStart = 0;
		for(; i<str.length(); i++) {
			
			if(str.charAt(i) == ' ') {
				int currentWordEnd = i -1;
				//now Reverse the current word;
				String reverseWord = "";
				for(int j =currentWordStart; j<=currentWordEnd; j++) {
					reverseWord =  str.charAt(j)+reverseWord;
				}
				ans += reverseWord + " ";
				currentWordStart = i+1;
			}
		}
		int currentWordEnd = i -1;
		//now Reverse the last word;
		String reverseWord = "";
		for(int j =currentWordStart; j<=currentWordEnd; j++) {
			reverseWord =  str.charAt(j)+reverseWord;
		}
		ans += reverseWord + " ";
		currentWordStart = i+1;
		
		return ans;
	}

}
