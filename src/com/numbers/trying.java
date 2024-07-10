package com.numbers;

public class trying {

    public static void main(String[] args) {
        boolean result = isPrime(10);
        System.out.println("Is 29 prime? " + result);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        
        boolean isprime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isprime = false;
                break;
            }
        }
        return isprime;
    }
}
