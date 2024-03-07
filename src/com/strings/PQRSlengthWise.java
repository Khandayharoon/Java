package com.strings;

public class PQRSlengthWise {

	public static void main(String[] args) {
		
		String str = "PQRS";
        for (int len = 1; len <=str.length(); len++) {
            for (int start = 0; start<=str.length()-len; start++) {
            	int end = start+len;
            	System.out.println(str.substring(start,end));
                
            }
        }
	}

}
