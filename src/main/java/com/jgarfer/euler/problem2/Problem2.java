package com.jgarfer.euler.problem2;

public class Problem2 {

    public int solve() {
        int result = 0;
        int first = 1;
        int second = 2;
        int operationResult;
        while (second < 4000000) {
            operationResult = first + second;
            result += operationResult;
            first = second;
            second = operationResult;
        }
        return result;
    }
}
