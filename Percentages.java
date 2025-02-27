import java.util.Scanner;

public class Percentages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompting user for two double values
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        
        // Calling computePercent method with both orders
        computePercent(num1, num2);
        computePercent(num2, num1);
        
        input.close();
    }

    public static void computePercent(double a, double b) {
        double percentage = (a / b) * 100;
        System.out.printf("%.2f is %.2f percent of %.2f%n", a, percentage, b);
    }
}
