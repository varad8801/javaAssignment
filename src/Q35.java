import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number for the multiplication table: ");
        int number = scanner.nextInt();

        System.out.print("Enter the range (e.g., up to 10): ");
        int range = scanner.nextInt();

        System.out.println("Multiplication table for " + number + ":");

        for (int i = 1; i <= range; i++) {
            int product = number * i;
            System.out.println(number + " x " + i + " = " + product);
        }
    }
}
