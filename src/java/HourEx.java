package src.java;

public class HourEx {
    public static void main(String[] args) {
        int hours = 2;
        int minutes = 5;
        int seconds = minutes * 60;
        int hourSeconds = hours * 60 * 60;
        System.out.println("Hour to seconds:" + hourSeconds);
        System.out.println("Minutes to seconds:" + seconds);
    }
}
