import java.util.Scanner;
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Application Entry & Welcome Message

        String appName = "Palindrome Checker";
        String appVersion = "1.0.0";

        System.out.println("********************************************");
        System.out.println("      Welcome to " + appName);
        System.out.println("      Version: " + appVersion);
        System.out.println("********************************************");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // --- UC3: Reverse String using For Loop (Manual Logic) ---
        String reversed = ""; // Empty string to start

        // Loop from the last character to the first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i); // Concatenation
        }

        // --- Check Condition ---
        if (input.equals(reversed)) {
            System.out.println("Result: '" + input + "' is a Palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is NOT a Palindrome.");
        }

        scanner.close();
    }
}