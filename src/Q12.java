
import java.util.Scanner;

public class Q12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter temperature in Celsius: ");
                double celsius = sc.nextDouble();
                double fahrenheit = celsiusToFahrenheit(celsius);
                System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
                break;
            case 2:
                System.out.println("Enter temperature in Fahrenheit: ");
                double fahrenheitInput = sc.nextDouble();
                double celsiusOutput = fahrenheitToCelsius(fahrenheitInput);
                System.out.println(fahrenheitInput + " degrees Fahrenheit is equal to " + celsiusOutput + " degrees Celsius.");
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
