public class Main {

    public static void main(String[] args) {

        int counter = 0;

        for (int number = 26; number <= 10000; number++) {
            if (isPrime(number)) {
                System.out.println(number + " is a prime number");
                counter++;
                if (counter == 3)
                    break;
            }

        }
    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor < wholeNumber; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
