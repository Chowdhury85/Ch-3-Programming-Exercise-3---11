import java.util.Scanner;

public class JobPricing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompting user for job details
        System.out.print("Enter the job name: ");
        String jobName = input.nextLine();
        
        System.out.print("Enter the cost of materials: ");
        double materialCost = input.nextDouble();
        
        System.out.print("Enter the number of hours of work required: ");
        int workHours = input.nextInt();
        
        System.out.print("Enter the number of hours of travel time: ");
        int travelHours = input.nextInt();
        
        // Calculate the estimated price
        double estimatedPrice = calculateEstimate(materialCost, workHours, travelHours);
        
        // Display the job name and estimated price
        System.out.printf("The estimated price for %s is: $%.2f%n", jobName, estimatedPrice);
        
        input.close();
    }

    public static double calculateEstimate(double materialCost, int workHours, int travelHours) {
        return materialCost + (workHours * 35) + (travelHours * 12);
    }
}
