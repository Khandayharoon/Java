package com.numbers;

public class EXTransports {

	public static void main(String[] args) {
//		int arr []= {100,100,50,100,100,50,50,50,50,50,50};
//		int arr [] = {100,50,50,50,50,50,50,50,50,100,100,100,100,50,50,50,50,50,50};
//		int arr[]= {100,100,100};
		int arr []= {50,50,50,50,50,50,50};
		int kg50 =0;
		int kg100 =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==50) {
				kg50++;
			}else if(arr[i]==100) {
				kg100++;
			}
		}
		
		System.out.println("100kg:= " + kg100 + " and 50kg: = " + kg50);
		 int done = kg50 - kg100;
		 int pending = (done * 50)/150;
		 System.out.println(pending + kg100);
	}

}
