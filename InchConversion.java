import java.util.Scanner;

public class InchConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompting user for inches value
        System.out.print("Enter the number of inches: ");
        double inches = input.nextDouble();
        
        // Calling methods to convert inches
        convertToFeet(inches);
        convertToYards(inches);
        
        input.close();
    }

    public static void convertToFeet(double inches) {
        double feet = inches / 12;
        System.out.printf("%.2f inches is %.2f feet.%n", inches, feet);
    }

    public static void convertToYards(double inches) {
        double yards = inches / 36;
        System.out.printf("%.2f inches is %.2f yards.%n", inches, yards);
    }
}
