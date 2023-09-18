public class paldrom {
    public static void main (String[]args){
        int number = 1880;
        String numStr =  Integer.toString(number);
        String reversedStr = reverseString(numStr);
        if (numStr.equals(reversedStr)){
            System.out.println(number +"its is a palindrone no");
          } else {
            System.out.println(number +"its is a palindrone not");
          }
    }
  

private static String reverseString(String str){
    StringBuilder reversed = new StringBuilder(str);
    reversed.reverse();
    return reversed.toString();

}}
