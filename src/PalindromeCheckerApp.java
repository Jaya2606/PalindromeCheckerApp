public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.\n");


        // UC2: Hardcoded Palindrome Result
        String word1 = "madam";
        String reversed1 = "madam";

        if(word1.equals(reversed1)) {
            System.out.println(word1 + " is a palindrome.");
        } else {
            System.out.println(word1 + " is not a palindrome.");
        }


        System.out.println();


        // UC3: Palindrome Check Using String Reverse
        String word2 = "racecar";
        String reversed2 = new StringBuilder(word2).reverse().toString();

        if(word2.equals(reversed2)) {
            System.out.println(word2 + " is a palindrome.");
        } else {
            System.out.println(word2 + " is not a palindrome.");
        }

    }
}