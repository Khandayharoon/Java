package com.numbers;

import java.util.Scanner;

public class CaseCheck {

	public static void main(String[] args) {
//		Acsii value of az = 97-122 and value of 65-90
		  System.out.print("Please Enter a char : ");
		  Scanner s  = new Scanner(System.in);
		  char c = s.next().charAt(0);
		  s.close();
//		  if(c >=97 && c<=122) {
//			  System.out.println( c + " : Entered text Lower-Case ");
//		  }
//		  if(c>=65 && c<=90) {
//			  System.out.println( c + " : Entered text Upper-Case ");
//		  }
		  
		  if(c >='a' && c<='z') {
			  System.out.println( c + " : Entered text Lower-Case ");
		  }
		  if(c>='A' && c<='Z') {
			  System.out.println( c + " : Entered text Upper-Case ");
		  }
	}

}
