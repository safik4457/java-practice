package com.company.learningDataType;

public class DataType {

    public static void main(String[] x){


        int a;  //null support kore na
        Integer b; //eta null support kore..Integer er onk gulo method o ache jeta int er nai


        long c;
        Long d;

        String text = "30490";

        b = text.length();

        char ch;
        String s;

        boolean z = true;
        Boolean y;

        s = "Represents an immutable sequence of characters enclosed in double quotes";

        System.out.println(s.length());

        if(s.equals("Masud")){
            System.out.println("OK");
        }
        else System.out.println("NO");

        int f = 50;

        int g = 20;

        Math.abs(-400);

        Math.max(f,g);

        System.out.println(Math.abs(-400)); // |-400|

        System.out.println(Math.max(f,g));

        Math.pow(5,2); // five square ..output 25


        for (int i = 0; i < 10; i++) {

            if (i == 4) {
                break;
            }

            System.out.println(i);
        }





    }
}
