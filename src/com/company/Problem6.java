package com.company;

class Problem6 {
    int num;

    Problem6(int num) {
        this.num = num;
    }

    String checkEvenOdd() {
        if(num % 2 == 0)
            return num + " is even";
        else
            return num + " is odd";
    }
}