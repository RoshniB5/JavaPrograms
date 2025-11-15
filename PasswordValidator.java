import java.util.*;

public class PasswordValidator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String pwd = sc.nextLine();

        boolean length = pwd.length() >= 8;
        boolean upper = pwd.matches(".*[A-Z].*");
        boolean lower = pwd.matches(".*[a-z].*");
        boolean digit = pwd.matches(".*[0-9].*");
        boolean special = pwd.matches(".*[@#$!%&*].*");

        if (!length) System.out.println("Password must be at least 8 characters long.");
        if (!upper) System.out.println("Password must contain at least one uppercase letter.");
        if (!lower) System.out.println("Password must contain at least one lowercase letter.");
        if (!digit) System.out.println("Password must contain at least one digit.");
        if (!special) System.out.println("Password must contain at least one special character (@,#,$,!,%,&,*).");

        if (length && upper && lower && digit && special)
            System.out.println("Password is valid.");
        else
            System.out.println("Password is invalid. Please ensure it meets all criteria.");
    }
}
