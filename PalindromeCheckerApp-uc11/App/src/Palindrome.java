import java.util.Stack;
public class Palindrome {
    public static void main(String[] args) {
        Palindrome checker = new Palindrome();
        String input = "Madam In Eden Im Adam";
        boolean result = checker.checkPalindrome(input);
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + result);
    }
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }
        String normalized = input
                .toLowerCase()
                .replaceAll("[^a-z0-9]", "");
        return isPalindromeUsingStack(normalized);
    }
    private boolean isPalindromeUsingStack(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}