package com.strings;

public class FaultyKeyboard {

	public static void main(String[] args) {
		String org  = "string";
		String str = faultyword(org);
		System.out.println(str);
	}

	private static String faultyword(String org) {
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<org.length();i++) {
			if(org.charAt(i)==('i')) {
				sb.reverse();
			}
			else {
				sb.append(org.charAt(i));
			}
		}
		return sb.toString();
	}

	

}
