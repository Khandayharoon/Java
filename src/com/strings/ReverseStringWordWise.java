package com.strings;
public class ReverseStringWordWise {
	public static void main(String[] args) {
		String str = "Welcome to Coding Classes";
		System.out.println( reverseStringWordWise(str) );		
	}
	//	Q:- Reverse String Word wise  "Welcome to Coding Classes"
	//	A:- Classes Coding to Welcome
	private static String  reverseStringWordWise(String str) {
		//create an empty String
		String ans ="";
		//create start and end 
		int start = 0;
		int end;
		//loop over string length check where is delimiter(word end)
		for(int i=0; i<str.length(); i++) {
			// create a String a string to store a single world;
			String word ="";
			if(str.charAt(i) == ' ') {
				end = i - 1;
				for(int j =start; j<=end; j++) {
					word += str.charAt(j);
				}
				ans = word + " " + ans;
				start = i+1;
			}
		}
		//now with above code we are missing last word for that 
		end = str.length() - 1;
		String lastWord = "";
		for(int i = start; i<=end ; i++) {
			lastWord += str.charAt(i);
		}
		ans = lastWord + " " + ans;
		return ans;
	}

}
