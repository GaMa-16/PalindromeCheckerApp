import java.util.Scanner;
import java.util.Stack; // Import Stack class

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

        // --- UC5: Stack-Based Palindrome Check ---
        Stack<Character> stack = new Stack<>();

        // 1. Push all characters to Stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        String reversed = "";

        // 2. Pop characters to build reversed string
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
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