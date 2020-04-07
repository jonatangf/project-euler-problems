package com.jgarfer.euler.problem1;

public class Problem1 {

    public int solve(int number1, int number2, int numberBelow) {
        int result = 0;
        for (int i = 0; i < numberBelow; i++) {
            if (isMultipleOf(i, number1) || isMultipleOf(i, number2)) {
                result += i;
            }
        }
        return result;
    }

    private boolean isMultipleOf(int number, int divider) {
        return number % divider == 0;
    }
}
