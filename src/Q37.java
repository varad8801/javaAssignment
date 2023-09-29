import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        // Start with the first even number
        int sum = 0;

        while (num <= 100) {
            sum += num;
            num += 2; // Increment by 2 to get the next even number
        }

        System.out.println("Sum of even numbers between 1 and 100: " + sum);
    }
}
