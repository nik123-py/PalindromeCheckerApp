public class Palindrome {
    public static void main(String[] args) {
        String input = "level";
        System.out.println("Input : " + input);
        long startStack = System.nanoTime();
        boolean stackResult = stackCheck(input);
        long endStack = System.nanoTime();
        long stackTime = endStack - startStack;
        System.out.println("Stack Result : " + stackResult);
        System.out.println("Stack Execution Time : " + stackTime + " ns");
        long startTwoPointer = System.nanoTime();
        boolean twoPointerResult = twoPointerCheck(input);
        long endTwoPointer = System.nanoTime();
        long twoPointerTime = endTwoPointer - startTwoPointer;
        System.out.println("Two Pointer Result : " + twoPointerResult);
        System.out.println("Two Pointer Execution Time : " + twoPointerTime + " ns");
    }
    private static boolean stackCheck(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
    private static boolean twoPointerCheck(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}