package com.searching;

public class Binary {

	public static void main(String[] args) {
		
		int [] arr = {23,45,67,76,77,79,81,83,85,89,90,112,116};
		binarySearch(arr, 83);
	}

	private static void binarySearch(int[] arr, int num) {
		
		int left = 0;
		int right = arr.length;
		int mid = left + right /2;
		
		for(int i=0; i<=arr.length; i++) {
			if( arr[mid] < num) {
//				left++;
				right--;
				mid = left+right/2;
//				System.out.println(mid);
				
			}
			else if(arr[mid] > num) {
//				right--;
				left++;
				mid = left+right/2;
//				System.out.println(mid);
			}
//			else {
//				left++;
//				right--;
//				mid=left+right/2;
//			}
		}
		
		System.out.println(arr[mid] + " is present at index of " + mid);
		
	}

}
