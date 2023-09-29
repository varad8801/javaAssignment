import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if (isVowel(ch)) {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }
    }

    public static boolean isVowel(char ch) {
        // Convert the character to lowercase to handle both upper and lower case vowels
        ch = Character.toLowerCase(ch);

        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
