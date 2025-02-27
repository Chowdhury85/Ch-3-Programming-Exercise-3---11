import java.util.Scanner;

public class Insurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompting user for the current year and birth year
        System.out.print("Enter the current year: ");
        int currentYear = input.nextInt();
        
        System.out.print("Enter your birth year: ");
        int birthYear = input.nextInt();
        
        // Calculate the insurance premium
        int premium = calculatePremium(currentYear, birthYear);
        
        // Display the premium amount
        System.out.printf("Your insurance premium is: $%d%n", premium);
        
        input.close();
    }

    public static int calculatePremium(int currentYear, int birthYear) {
        int age = currentYear - birthYear;
        int decades = age / 10;
        return (decades + 15) * 20;
    }
}
