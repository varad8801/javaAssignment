import java.util.Scanner;

public class Q2Reverse {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				/* Develop a Java program with a method that accepts a string and returns the reverse of that string.
				 *  Call this method to reverse a user-input string.*/
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a String");
			String str=sc.next();
			
			
			System.out.println(Q2Reverse.reverse(str));
		}
		
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