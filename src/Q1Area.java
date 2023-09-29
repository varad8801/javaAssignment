import java.util.Scanner;

public class Q1Area {
	/*Write a Java program that defines a method to calculate the area of a rectangle (length * width) 
	 * and another method to calculate the area of a triangle (0.5 * base * height). 
	 * Prompt the user to choose one of these shapes and calculate its area.*/
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("pl type 1 for Triangle and 2 for rectangle");
			int prompt=sc.nextInt();
			System.out.println("Enter first side");
			int l=sc.nextInt();
			System.out.println("Enter Second side");
			 int w=sc.nextInt();
			
					 if (prompt==1) {
				System.out.println( Q1Area.areaTriangle(l, w));
				
			}
			 else if(prompt==2) {
				System.out.println( Q1Area.areaRectangle(l, w));
			 }
			 else {
				 System.out.println("Invalid");
			 }
		}
		
		
		

	}
	
	static double areaTriangle(int b, int h) {
		return (b*h)/2;
	}
	static double areaRectangle(int l,int w) {
		return l*w;
	}

}

