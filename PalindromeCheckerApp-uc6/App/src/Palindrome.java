import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class Palindrome {
    static void main() {
        String input = "madam";
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);
            queue.add(ch);
        }
        boolean isPalindrome = true;
        while (!stack.isEmpty() && !queue.isEmpty()) {
            char fromStack = stack.pop();
            char fromQueue = queue.remove();
            if (fromStack != fromQueue) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
