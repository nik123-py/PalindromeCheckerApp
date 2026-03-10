public class Palindrome {
    public static void main(String[] args) {
        String input = "Madam In Eden Im Adam";
        String normalized = input
                .toLowerCase()
                .replaceAll("[^a-z0-9]", "");
        int start = 0;
        int end = normalized.length() - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("Original text: " + input);
        System.out.println("Normalized text: " + normalized);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}