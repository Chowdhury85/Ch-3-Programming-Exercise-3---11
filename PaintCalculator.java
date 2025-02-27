import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompting user for room dimensions
        System.out.print("Enter the length of the room (in feet): ");
        double length = input.nextDouble();
        
        System.out.print("Enter the width of the room (in feet): ");
        double width = input.nextDouble();
        
        System.out.print("Enter the height of the room (in feet): ");
        double height = input.nextDouble();
        
        // Calculate the wall area
        double wallArea = calculateWallArea(length, width, height);
        
        // Calculate gallons needed
        double gallons = calculateGallonsNeeded(wallArea);
        
        // Calculate total price
        double price = calculatePrice(gallons);
        
        // Display results
        System.out.printf("Total gallons of paint needed: %.2f%n", gallons);
        System.out.printf("Total cost to paint the room: $%.2f%n", price);
        
        input.close();
    }

    public static double calculateWallArea(double length, double width, double height) {
        return 2 * (length * height + width * height);
    }

    public static double calculateGallonsNeeded(double wallArea) {
        return wallArea / 350;
    }

    public static double calculatePrice(double gallons) {
        return gallons * 32;
    }
}
