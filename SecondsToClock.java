import java.util.Scanner;

public class SecondsToClock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter seconds to compute: ");
        int number = scanner.nextInt();
        int hours = number/3600;
        int mins = (number % 3600)/60;
        int secs = number % 60;

        String timeClock = String.format("%02d:%02d:%02d", hours,mins,secs);


        System.out.println(number +" => " + timeClock);
    }
}
