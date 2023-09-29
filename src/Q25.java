import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int i=sc.nextInt();
        if(i==0) {
        	System.out.println("is zero");
        }
        else if(i>0) {
        	System.out.println("is a positive");
        	
        }
        else
        	System.out.println("Is a negative ");

	}

}
