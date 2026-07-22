package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner reader = new Scanner(System.in);
//        Problem11 problem11 = new Problem11();
//
//        System.out.print("Enter a year: ");
//        int yr = reader.nextInt();
//
//        String result = problem11.isLeapYear(yr);
//
//        System.out.println(result);



//        Problem1 problem1 = new Problem1();
//
//        System.out.print("Enter a Sentence: ");
//        String abc = reader.next();
//
//        String r = problem1.solution1(abc);
//
//        System.out.println(r);


        int x;
        int y;

        x = 589044;
        y = 189034030;

        Problem2 problem2 = new Problem2();

        problem2.solution2(x,y);  // method call kortechi

        int c = problem2.solution2(x,y);

        System.out.println("The sum of " + x + " and " + y + " is: " + c);
    }
}
