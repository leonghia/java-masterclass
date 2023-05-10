package dev.nghia3;

import com.example.numbers.Series;

public class Main {

    public static void main(String[] args) {

        System.out.println("=".repeat(10) + " nSum " + "=".repeat(10));
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.nSum(i));
        }

        System.out.println("=".repeat(10) + " Factorials " + "=".repeat(10));
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.factorial(i));
        }

        System.out.println("=".repeat(10) + " Fibonacci numbers " + "=".repeat(10));
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.fibonacci(i));
        }
    }
}
