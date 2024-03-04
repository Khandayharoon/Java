package com.numbers;
import java.util.Scanner;
public class CalculatorProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//		Creating infinity while until User press 'X' or 'x'
		int result =0;
		while(true) {
			System.out.print("Enter a Operator: ");
			char op = input.next().trim().charAt(0);
			if(op == '+' || op == '-' || op =='*' || op =='%' || op=='/') {

				System.out.print("Enter two numbers: ");
				int num1 = input.nextInt();
				int num2 = input.nextInt();

				if(op == '+') {
					result = num1+num2;
				}
				if(op == '-') {
					result = num1-num2;
				}
				if(op == '*') {
					result = num1*num2;
				}
				if(op == '%') {
					result = num1%num2;
				}if(op == '/') {
					if(num2 ==0) {
						System.out.println("Denomirator can't be  Zero");
						result = 0;
					}else {
						result = num1 / num2;
					}
				}
			}else if(op == 'X' || op == 'x') {
				System.out.println("Calculator has been closed");
				break;
			}else {
				System.out.println("Invail operation");
			}

			System.out.println(result);
		}

	}

}
