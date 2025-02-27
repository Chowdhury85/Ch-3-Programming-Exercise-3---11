import java.util.Scanner;

public class FormLetterWriter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompting user for first and last name
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();
        
        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();
        
        // Testing overloaded methods
        displaySalutation(firstName);
        displaySalutation(firstName, lastName);
        
        input.close();
    }

    public static void displaySalutation(String firstName) {
        System.out.println("Dear " + firstName + ",");
        System.out.println("Thank you for your recent order.\n");
    }

    public static void displaySalutation(String firstName, String lastName) {
        System.out.println("Dear " + firstName + " " + lastName + ",");
        System.out.println("Thank you for your recent order.\n");
    }
}
