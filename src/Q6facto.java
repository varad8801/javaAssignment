import java.util.Scanner;

public class Q6facto {
	
	static int facto(int n) {
		if(n==0||n==1) {
			return 1;
		}
		else
		return n*facto((n-1));
	}
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number");
			int n=sc.nextInt();
			System.out.println(facto(n));
		}
	}

}
