import java.util.Scanner;

public class Q9Acircle {
	static double Areaofcircle(int r) {
		return 3.14 * r * r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the radius: ");
		int r=sc.nextInt();
		System.out.println("Area of circle is: "+Areaofcircle(r));

	}

}
