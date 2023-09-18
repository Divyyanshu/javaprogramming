public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 1881; 
        
        String numStr = Integer.toString(number);
        
        String reversedStr = reverseString(numStr);
        
        if (numStr.equals(reversedStr)) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
    }
    
    private static String reverseString(String str) 
    {
        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();
        return reversed.toString();
    }
}