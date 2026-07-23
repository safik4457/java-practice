package com.company;

class Problem5 {
    int dividend;
    int divisor;

    Problem5(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    int getQuotient() {
        return dividend / divisor;
    }

    int getRemainder() {
        return dividend % divisor;
    }
}