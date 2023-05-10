import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] agr) {

        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        System.out.print("Enter an integer value: ");
        int intNumber = input.nextInt();
        System.out.print("Enter a string: ");
        String str = input.next();
        System.out.print("Enter a float value: ");
        float fNumber = input.nextFloat();
        System.out.print("Enter a double value: ");
        double doubleValue = input.nextDouble();
        System.out.printf("intNumber=%d, str=%s, fNumber=%f,doubleValue=%f", intNumber, str, fNumber, doubleValue);
    }
}