package com.company;

public class Main {

    public static void main(String[] args) {

        int x;
        int y;

        x = 5;
        y = 10;

        Sumation s = new Sumation();  // s name ekta object create

        int c = s.sumOfTwoNo(x,y);  // s object er maddhome method call kortechi

        int d = s.sumOfThreeNo(2,3,6);

        System.out.println(c);
        System.out.println(d);
    }
}
