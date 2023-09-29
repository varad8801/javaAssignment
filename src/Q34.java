import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "password123";
        String userInput;

        do {
            System.out.print("Enter the password: ");
            userInput = scanner.nextLine();

            if (userInput.equals(correctPassword)) {
                System.out.println("Correct password! Access granted.");
                break;
            } else {
                System.out.println("Incorrect password. Please try again.");
            }
        } while (true);
    }
}
