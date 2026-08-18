import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the degree: ");
        double fdegree = scanner.nextDouble();
        double cdegree = (fdegree - 32) * 5/9;
        System.out.println("*".repeat(25));
        System.out.printf("Your converted degree is:  %.2f", cdegree);

    }
}
