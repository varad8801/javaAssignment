
import java.util.Arrays;
import java.util.Scanner;

public class Q28 {
	
	static int smallestnumber(int[]a) {
		Arrays.sort(a);
		return a[1];
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the integers in the array");

		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(smallestnumber(a));
	}

}
