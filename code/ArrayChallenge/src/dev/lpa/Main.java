package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of your array: ");
        int len = Integer.parseInt(scanner.nextLine());
        int[] intArray = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.printf("Enter number %d: ", i+1);
            int element = Integer.parseInt(scanner.nextLine());
            intArray[i] = element;
        }
        System.out.println("Your unsorted array is: " + Arrays.toString(intArray));

        int[] ascArray = Arrays.copyOf(intArray, len);
        Arrays.sort(ascArray);
        int[] descArray = reverseArray(ascArray);

        System.out.println("Your ascending sorted array is: " + Arrays.toString(ascArray));
        System.out.println("Your descending sorted array is: " + Arrays.toString(descArray));
    }

    private static int[] reverseArray(int[] originalArray) {
        int len = originalArray.length;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = originalArray[len - 1 - i];
        }
        return result;
    }
}
