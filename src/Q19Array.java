import java.util.Scanner;

public class Q19Array {
	
	static int sumArray(int []a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
			sum=sum+a[i];
			}
			
		}
		return sum;
	}
	public static void main(String[] args) {
				

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the integers in the array");

		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Sum is: "+sumArray(a));

	}

}
