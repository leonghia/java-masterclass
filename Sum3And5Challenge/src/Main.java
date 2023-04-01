public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
             if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                System.out.println("Number " + i + " can be divided by both 3 and 5");
                count++;
            }

            if (count == 5) {
                break;
            }
        }
        System.out.println("The sum of the numbers that met the conditions above  is " + sum);
    }
}
