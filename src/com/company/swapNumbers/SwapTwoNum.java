package com.company.swapNumbers;

public class SwapTwoNum {
    public static void main(String[] args) {

        float a = 5.20f;
        float b = 9.45f;
//        Long abc = 10L;
//        int a = 5;
//        double b = 1.29;
//        char ch = 'a';

        System.out.println("--Before swap--");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);


        float c = a;
        a = b;
        b = c;

        System.out.println("--After swap--");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
    }
}
