import java.util.Scanner;

public class Q8avg {
	
	static double  avg(int a,int b, int c) {
		return (a+b+c)/3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
			System.out.println("Enter the numbers");

			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();

		System.out.println("Avg is "+avg(a,b,c));
	}

}
