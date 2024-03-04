package com.numbers;
import java.util.Scanner;
public class MaxNum {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		s.close();

		int max =a;
		if(b>max) {
			max = b;
		}
		if(c>max) {
			max=c;
		}

		System.out.println(max);
	}

}
