import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversedNumber = reverse(number);

        System.out.println("Reversed number: " + reversedNumber);
    }

    public static int reverse(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return reversedNum;
    }
}
