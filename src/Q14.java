import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a double number: ");
        double input = scanner.nextDouble();

        int roundedNumber = (int) Math.round(input);

        System.out.println("The nearest integer to " + input + " is: " + roundedNumber);
    }
}

