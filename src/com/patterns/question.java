package com.patterns;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class question {

	public static void main(String[] args) {

			List <Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
			List<Integer> oddnumbers = number.stream().filter(n->n%2==1).collect(Collectors.toList());
			System.out.println(oddnumbers);
			

	}

}
