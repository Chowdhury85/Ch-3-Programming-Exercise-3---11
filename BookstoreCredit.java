import java.util.Scanner;

public class BookstoreCredit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       
        System.out.print("Enter student's name: ");
        String name = input.nextLine();
        
        System.out.print("Enter student's GPA: ");
        double gpa = input.nextDouble();
        
        
        displayCredit(name, gpa);
        
        input.close();
    }

    public static void displayCredit(String studentName, double studentGPA) {
        double credit = studentGPA * 10;
        System.out.printf("%s, with a GPA of %.2f, receives a bookstore credit of $%.2f%n", studentName, studentGPA, credit);
    }
}
