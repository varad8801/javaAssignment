import java.util.Scanner;

public class Q17vowel {

	static int numberofvowels(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u') {
				count ++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println("count of vowels is: "+numberofvowels(str));

	}

}
