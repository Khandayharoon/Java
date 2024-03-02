package com.numbers;

public class ArmstrongTenNumber {

    public static void main(String[] args) {
        int count = 0;
        int number = 0;

        System.out.println("First 10 Armstrong numbers are:");

        while (count < 30) {
            if (isArmstrong(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    private static boolean isArmstrong(int num) {
        int originalNumber, remainder, result = 0, n = 0;

        originalNumber = num;

        // number of digits calculation
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        originalNumber = num;

        // result contains sum of nth power of its digits
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        // check if number is equal to the sum of nth power of its digits
        return result == num;
    }
}
