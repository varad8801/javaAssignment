import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else if (num1 != num2 && num2 != num3 && num1 != num3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal nor different");
        }
    }
}
