import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        Random random = new Random();
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            int roll = random.nextInt(1, 7);
            System.out.println("Roll " + i + ": " + roll);
            total += roll;
        }
        System.out.println("Total: " + total);
    }
}