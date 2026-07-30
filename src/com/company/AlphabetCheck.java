package com.company;

public class AlphabetCheck {
    public static void main(String[] args) {

        char ch = '*';

        int val =  (int) ch; // cast korlam .....char to int

//        System.out.print(val);

        if (val >= 65 && val <= 90){
            System.out.print("This is an Alphabet");
        }
        else if (val >= 97 && val <= 122){
            System.out.print("This is an Alphabet");
        }
        else {
            System.out.print("This is not an Alphabet");
        }




    }
}
