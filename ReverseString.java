public class ReverseString {
    public static void main(String[] args) {
        String original = "Hello, World!";
        
        // Create a StringBuilder and append the original string to it
        StringBuilder reversed = new StringBuilder(original);
        
        // Use the reverse() method to reverse the string
        reversed.reverse();
        
        // Convert the StringBuilder back to a String
        String reversedString = reversed.toString();
        
        // Print the reversed string
        System.out.println(reversedString);
    }
}
