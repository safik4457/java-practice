package com.company.collectionFramwork;

import java.util.*;

public class SetHashSetList {
    public static void main(String[] asd){

        Set<Integer> numbers = new LinkedHashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);


        System.out.println(numbers);




        List<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(20);
        nums.add(10);
        nums.add(30);


        System.out.println(nums);



    }
}
