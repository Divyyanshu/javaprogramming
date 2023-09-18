import java.util.Scanner;
public class VowelConstraint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        // Check if the input string contains only vowels
        if (input.matches("^[aeiou]+$")) {
            System.out.println("The string contains only vowels.");
        } else {
            System.out.println("this constraint value");
        }

        scanner.close();
    }
}