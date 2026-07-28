package com.company.newsum;

import java.util.Scanner;

public class Mainsum {
    public static void main(String[] x)
    {
        Scanner input = new Scanner(System.in);
        Sumsub s = new Sumsub();


        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

//       int y = num1 + num2;

       int y = s.twoNumSum(num1,num2);

        System.out.print("Sum=  " + y);





    }


}
