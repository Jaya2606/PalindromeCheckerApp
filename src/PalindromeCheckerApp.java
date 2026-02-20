import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.\n");


        // UC2
        String word1 = "madam";
        String reversed1 = "madam";

        if(word1.equals(reversed1)) {
            System.out.println(word1 + " is a palindrome.");
        } else {
            System.out.println(word1 + " is not a palindrome.");
        }

        System.out.println();


        // UC3
        String word2 = "racecar";
        String reversed2 = new StringBuilder(word2).reverse().toString();

        if(word2.equals(reversed2)) {
            System.out.println(word2 + " is a palindrome.");
        } else {
            System.out.println(word2 + " is not a palindrome.");
        }

        System.out.println();


        // UC4
        String word3 = "level";
        char[] charArray = word3.toCharArray();
        boolean isPalindrome = true;

        int start = 0;
        int end = charArray.length - 1;

        while(start < end) {
            if(charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if(isPalindrome) {
            System.out.println(word3 + " is a palindrome.");
        } else {
            System.out.println(word3 + " is not a palindrome.");
        }

        System.out.println();


        // UC5: Stack Based Palindrome Check
        String word4 = "noon";
        Stack<Character> stack = new Stack<>();

        for(char c : word4.toCharArray()) {
            stack.push(c);
        }

        String reversedWord = "";

        while(!stack.isEmpty()) {
            reversedWord += stack.pop();
        }

        if(word4.equals(reversedWord)) {
            System.out.println(word4 + " is a palindrome.");
        } else {
            System.out.println(word4 + " is not a palindrome.");
        }

    }
}