import java.util.Scanner;

public class Q40 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		if(reverse(str).equals(str)) {
			System.out.println("It is a palindrome");
			
		}
		else
			System.out.println("It is not a palindrome");
	}
	static String reverse(String str) {
		String str1="";
		char ch;
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			str1=ch+str1;
			
		}
		return str1;
	}
}
