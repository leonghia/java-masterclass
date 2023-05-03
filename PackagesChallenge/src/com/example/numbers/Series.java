package com.example.numbers;

public class Series {

    public static long nSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + nSum(n - 1);
    }

    public static long factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
       int a = 0;
       int b = 1;
       int i = 1;
       while (i < n) {
           int temp = a;
           a = b;
           b += temp;
           i++;
       }
       return b;
    }
}
