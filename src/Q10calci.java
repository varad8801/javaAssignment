import java.util.Scanner;

public class Q10calci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1. for addition");
		System.out.println("2. for sub");
		System.out.println("3. Multiplication");
		System.out.println("4. for division");
		System.out.println("5. for exit");
		
		
		int choice=sc.nextInt();
		System.out.println("Enter 2 numbers ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		switch(choice) {
		case 1:
			
			System.out.println("Addition is: "+ add(n1,n2));
			break;
		case 2:
			System.out.println("Subtraction is: "+ sub(n1,n2));
			break;
		case 3:
			System.out.println("Multiplication is: "+ multip(n1,n2));
			break;
		case 4:
			System.out.println("Division is: "+ divide(n1,n2));
			break;
		default:
			System.out.println("Invalid input");


		}
		

	}

	private static int divide(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1/n2;
	}

	private static int multip(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1 * n2;
	}

	private static int sub(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1 - n2;
	}

	private static int  add(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1 + n2;
		
	}

}
