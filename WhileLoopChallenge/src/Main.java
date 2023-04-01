public class Main {

    public static void main(String[] args) {
        int i = 5;
        int evenCount = 0;
        int oddCount = 0;
        while (i <= 20) {
            if (isEvenNumber(i)) {
                evenCount += 1;
                System.out.println("Even number " + i);
            } else {
                oddCount += 1;
            }
            if (evenCount == 5) {
                break;
            }
            i++;
        }

        System.out.println("There are " + evenCount + " even numbers and " + oddCount + " odd numbers");
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0)
            return true;
        else
            return false;
    }
}
