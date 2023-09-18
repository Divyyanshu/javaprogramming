public class ReverseStringByFavTutor

{

   public static void main(String[] args) {


       String stringEx =  "divyanshu";

       System.out.println("Original string: "+stringEx);


       // Declaring a StringBuilder and converting string to StringBuilder

       StringBuilder reverseString = new StringBuilder(stringEx);


       reverseString.reverse();  // Reversing the StringBuilder


       // Converting StringBuilder to String

       String result = reverseString.toString();


       System.out.println("Reversed string: "+result); // Printing the reversed String


   }

}