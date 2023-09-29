import java.util.Scanner;

public class Q11 {
	static double areaRectangle(int l,int w) {
		return l*w;
	}
	 public static void main(String[] args) {
		 try (Scanner sc = new Scanner(System.in)) {
				System.out.println("pl type 1 for Triangle and 2 for rectangle");
			
				System.out.println("Enter first side");
				int l=sc.nextInt();
				System.out.println("Enter Second side");
				 int w=sc.nextInt();
				 areaRectangle(l, w);
		 }
	}
}
