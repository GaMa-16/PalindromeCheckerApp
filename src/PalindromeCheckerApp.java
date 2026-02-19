public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Application Entry & Welcome Message

        String appName = "Palindrome Checker";
        String appVersion = "1.0.0";

        System.out.println("********************************************");
        System.out.println("      Welcome to " + appName);
        System.out.println("      Version: " + appVersion);
        System.out.println("********************************************");

        String input = "madam";  // Hardcoded String
        String reversed = "";

        // Logic to reverse the string
        StringBuilder sb = new StringBuilder(input);
        reversed = sb.reverse().toString();

        // Check if palindrome using if-else
        if (input.equals(reversed)) {
            System.out.println("Result: '" + input + "' is a Palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is NOT a Palindrome.");
        }
    }
}
