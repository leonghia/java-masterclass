import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number;
        int n;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        n = Integer.parseInt(scanner.nextLine());
        number = n;

        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }

        System.out.printf("Sum digits of %d = %d", number, sum);
    }
}
