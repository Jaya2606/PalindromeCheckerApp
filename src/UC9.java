public class PalindromeCheckerApp
{
     public static void UC9()
     {

        String input = "racecar";

        boolean isPalindrome = isPalindromeRecursive(input, 0, input.length() - 1);

        System.out.println("UC9 Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome + "\n");
    }
    public static void main(String [] args)
    {
        UC9();
    }
}