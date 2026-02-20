import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;

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


        // UC5
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

        System.out.println();


        // UC6
        String word5 = "civic";
        Stack<Character> stack2 = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for(char c : word5.toCharArray()) {
            stack2.push(c);
            queue.add(c);
        }

        boolean isPalindromeQS = true;

        while(!stack2.isEmpty()) {
            if(stack2.pop() != queue.remove()) {
                isPalindromeQS = false;
                break;
            }
        }

        if(isPalindromeQS) {
            System.out.println(word5 + " is a palindrome.");
        } else {
            System.out.println(word5 + " is not a palindrome.");
        }

        System.out.println();


        // UC7: Deque Based Optimized Palindrome Check
        String word6 = "radar";
        Deque<Character> deque = new ArrayDeque<>();

        for(char c : word6.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindromeDeque = true;

        while(deque.size() > 1) {
            if(deque.removeFirst() != deque.removeLast()) {
                isPalindromeDeque = false;
                break;
            }
        }

        if(isPalindromeDeque) {
            System.out.println(word6 + " is a palindrome.");
        } else {
            System.out.println(word6 + " is not a palindrome.");
        }

    }
}