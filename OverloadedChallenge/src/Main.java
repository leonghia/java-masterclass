public class Main {

    public static void main(String[] args) {
        System.out.println("6 ft is equal to " + convertToCentimeters(6, 0) + " cm");
    }

    public static double convertToCentimeters(int heightInInches) {
        return heightInInches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches) {
        int height = heightInFeet * 12 + heightInInches;
        return convertToCentimeters(height);
    }
}
