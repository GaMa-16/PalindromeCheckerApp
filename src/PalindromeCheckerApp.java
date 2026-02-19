import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList; // Implementation of Queue

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

        // --- UC6: Queue (FIFO) vs Stack (LIFO) ---
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // 1. Fill both Data Structures
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            stack.push(c); // Pushes to top
            queue.add(c);  // Adds to rear
        }

        boolean isPalindrome = true;

        // 2. Compare Dequeue (Front) vs Pop (Top)
        while (!queue.isEmpty()) {
            // queue.remove() returns the FIRST character entered (FIFO)
            // stack.pop() returns the LAST character entered (LIFO)
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
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