import java.util.Scanner;

public class Q30 {
	
	static void isleap(int year){
		if(year%4==0&&(year%100!=0)) {
		System.out.println("It is a leap year");
		}
		else
			System.out.println("It is not a leap year");
		
	}
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int year=sc.nextInt();
			isleap(year);
		}

	}

}
