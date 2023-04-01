public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
           int hours = seconds / 3600;
           int remainingSeconds = seconds % 3600;
           int minutes = remainingSeconds / 60;
           int s = remainingSeconds % 60;
           return hours + "h" + " " + minutes + "m" + " " + s + "s";
        }
        return "Seconds must be more than or equal to 0";
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {

        } else if (minutes < 0) {
            return "Minutes must be more than or equal to 0";
        }
        return "Seconds must be from 0 to 59";
    }
}
