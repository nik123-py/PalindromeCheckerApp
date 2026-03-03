public class PalindromeCheckerApp {
    public static void main(String [] args){
        System.out.println("Welcome to Palindrome Checker App Management sytem");
        String input="madam";
        boolean isPalindrome=true;
        for(int i=0;i<input.length()/2;i++){
            if(input.charAt(i)!=input.charAt(input.length()-1-i)){
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("it is a palindrome");
        }else{
            System.out.println("not a palindrome");
        }
        if(isPalindrome){
            System.out.println("it is a palindrome");
        }else{
            System.out.println("not a palindrome");
        }
        String reversed = "";

// Iterate from the last character to the first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

// Compare original and reversed string
        isPalindrome = input.equals(reversed);

// Display results
        System.out.println("Reversed text: " + reversed);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
