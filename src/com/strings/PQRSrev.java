package com.strings;

public class PQRSrev {

	public static void main(String[] args) {
		String str = "pqrs";
		
		for (int i=0; i<str.length(); i++) {
			for(int j=i; j<str.length(); j++) {
				System.out.println(str.substring(i,j+1));
			}
		}

	}

}


//for(int i=str.length(); i>=0; i--) {
//System.out.println(str.substring(0,i));

//pqrs
//pqr
//pq
//p

//}
//for( int i=0; i<str.length(); i++) {
//System.out.println(str.substring(i,str.length()));
//}
