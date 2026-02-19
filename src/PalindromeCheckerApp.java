import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // --- UC1: App Details ---
        String appName = "Palindrome Checker";
        String appVersion = "1.0.0";

        System.out.println("********************************************");
        System.out.println("      Welcome to " + appName);
        System.out.println("      Version: " + appVersion);
        System.out.println("********************************************");

        // --- UC2: Accept User Input ---
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // --- UC4: Two-Pointer Technique using Char Array ---
        // 1. Convert String to Character Array
        char[] charArray = input.toCharArray();

        // 2. Initialize Pointers
        int left = 0;                       // Start pointer
        int right = charArray.length - 1;   // End pointer
        boolean isPalindrome = true;        // Assume true initially

        // 3. Loop until pointers meet
        while (left < right) {
            // Compare characters at left and right indices
            if (charArray[left] != charArray[right]) {
                isPalindrome = false; // Mismatch found
                break;                // Exit loop immediately
            }
            left++;  // Move start pointer forward
            right--; // Move end pointer backward
        }

        // --- Output Result ---
        if (isPalindrome) {
            System.out.println("Result: '" + input + "' is a Palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is NOT a Palindrome.");
        }

        scanner.close();
    }
}