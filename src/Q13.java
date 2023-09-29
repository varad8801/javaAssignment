

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first integer: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second integer: ");
        int num2 = sc.nextInt();

        double sum = calculateSum(num1, num2);

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }

    public static double calculateSum(int num1, int num2) {
        return (double) num1 + num2;
    }
}
