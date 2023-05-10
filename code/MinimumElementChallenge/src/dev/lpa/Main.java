package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers (separate by comma): ");
        String input = scanner.nextLine();
        int[] arr = readIntegers(input);
        System.out.println("You have entered: " + Arrays.toString(arr));
        int min = findMin(arr);
        System.out.println("The minimum element is: " + min);
    }

    private static int[] readIntegers(String input) {
        String[] raw = input.split(",");
        int len = raw.length;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = Integer.parseInt(raw[i].trim()); // we use trim() to remove trailing space, eg: 45, 23, 17, 21
        }
        return result;
    }

    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int element : arr) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }
}
