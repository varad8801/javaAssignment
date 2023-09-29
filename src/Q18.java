import java.util.Scanner;

public class Q18 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        int choice = sc.nextInt();
        System.out.println("Enter the radius");
        double r = sc.nextDouble();
        switch (choice) {
            case 1:
                System.out.println("area of a circle ");
               
                double area = areaofcircle(r);
                System.out.println("Area is: "+area);
                break;
            case 2:
                System.out.println("Volm of sphere ");
          
                double volm = vom_sphere(r);
                System.out.println("Volume of sphere "+volm);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }			

	private static double vom_sphere(double r) {
		// TODO Auto-generated method stub
		return 4/3*(Math.PI*r*r*r);
	}

	private static double areaofcircle(double r) {
		// TODO Auto-generated method stub
		return Math.PI *r*r;
	}
	

	
}
