public class WorkShift {
    public static void main(String[] args) {
        int hours = 20;
        int minutes = 42;
        int seconds = 16;

        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;

        System.out.println("Total shift time in seconds: " + totalSeconds);
    }
}
