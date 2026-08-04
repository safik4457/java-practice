package com.company.javaArray;

public class JavaArray {
    public static void main(String[] x){


        String car = "BMW";
        String car2 = "Mazda";
        String car3 = "Fort";

        String[] cars = {"BMW","Mazda","Fort","XYZ"};

        cars[0] = "MND";

        System.out.println(cars.length);

        for(int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }



        int a = 5;
        int b = 6;
        int c = 7;


        int[] nums = {5,6,7,8};

        System.out.println(nums[3]);



    }
}
