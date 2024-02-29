package com.renderedideas;

public class BooFoo {

    public static void main(String[] args) {
        int num = 100; // Represents the maximum number to loop up to

        // Iterate from 1 to num
        for (int i = 1; i <= num; i++) {
            // Check if the current number is divisible by both 5 and 7
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("FOO-BOO");
            } else if (i % 7 == 0) { // Check if the current number is divisible by 7
                System.out.println("BOO");
            } else if (i % 5 == 0) { // Check if the current number is divisible by 5
                System.out.println("FOO");
            } else {
                System.out.println(i); // Print the current number if none of the conditions are met
            }
        }
    }
}
