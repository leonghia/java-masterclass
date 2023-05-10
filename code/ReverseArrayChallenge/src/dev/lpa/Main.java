package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers, separating by comma: ");
        String input = scanner.nextLine();
        int[] arr = readIntegers(input);
        System.out.println("Reversed: " + Arrays.toString(reverseCopy(arr)));
        System.out.println("Original: " + Arrays.toString(arr));
    }

    private static int[] readIntegers(String input) {
        String[] raw = input.split(",");
        int len = raw.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(raw[i].trim()); // we use trim() to remove any trailing space, eg: 15, 23, 41, 38
        }
        return arr;
    }

    private static void reverse(int[] arr) {
        int len = arr.length;
        int temp;
        int limit = len / 2;
        for (int i = 0; i < limit; i++) {
            temp = arr[i];
            arr[i] = arr[len - 1 - i];
            arr[len - 1 - i] = temp;
        }
    }

    private static int[] reverseCopy(int[] arr) {
        int[] copiedArr = Arrays.copyOf(arr, arr.length);
        reverse(copiedArr);
        return copiedArr;
    }
}
