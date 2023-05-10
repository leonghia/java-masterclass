import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        boolean isFirstIteration = true;

        while (true) {
            System.out.println("Please enter an integer ");
            String input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input);
                if (isFirstIteration) {
                    min = number;
                    max = number;
                } else {
                    if (number < min) {
                        min = number;
                    }
                    if (number > max) {
                        max = number;
                    }
                }
                System.out.println("Max = " + max);
                System.out.println("Min = " + min);
                isFirstIteration = false;

            } catch (NumberFormatException nfe) {
                System.out.println("Quitting the loop");
                break;
            }

        }
    }
}
