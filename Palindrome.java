import java.util.*;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("\\s+", "").toLowerCase();
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string or number: ");
        String input = sc.nextLine();

        if (isPalindrome(input))
            System.out.println(input + " is a Palindrome.");
        else
            System.out.println(input + " is NOT a Palindrome.");
    }
}
