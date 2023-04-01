import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int sum = 0;
        double sum = 0;
        int i = 1;
        String input;
        Scanner scanner = new Scanner(System.in);

        while (i <= 5) {
            System.out.println("Enter number #" + i + " ");
            input = scanner.nextLine();
            try {
//                sum += Integer.parseInt(input);
                sum += Double.parseDouble(input);
                i++;
            } catch (NumberFormatException badInput) {
                System.out.println("Invalid number. Please enter again.");
            }
        }

        System.out.println("Sum = " + sum);
    }
}
