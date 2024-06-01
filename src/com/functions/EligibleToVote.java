package com.functions;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        eligibletovote(s);
        eligibletovote(s);
        s.close();
    }

    private static void eligibletovote(Scanner s) {
        System.out.println("Please enter your Name and age :- ");
        String name = s.next();
        int age = s.nextInt();
        if(age >= 18) {
            System.out.println(name + " is Eligible to vote");
            System.out.println();
        } else {
            System.out.println(name + " is not Eligible to vote");
            System.out.println();
        }
    }
}
