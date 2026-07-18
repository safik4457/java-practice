package com.company;

public class Problem11 {

//    Java Program to Check Leap Year
    String isLeapYear(int year) {

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return "Leap year.";
                } else {
                    return "Not a leap year.";
                }
            } else {
                return "Leap year.";
            }
        } else {
            return "Not a leap year.";
        }
    }

}
