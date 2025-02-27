import java.util.Scanner;

public class NumbersDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int x = input.nextInt();
        
        System.out.print("Enter second integer: ");
        int y = input.nextInt();
        
        displayTwiceTheNumber(x);
        displayNumberPlusFive(x);
        displayNumberSquared(x);
        
        displayTwiceTheNumber(y);
        displayNumberPlusFive(y);
        displayNumberSquared(y);
        
        input.close();
    }

    public static void displayTwiceTheNumber(int num) {
        System.out.println("Twice the number " + num + " is: " + (num * 2));
    }

    public static void displayNumberPlusFive(int num) {
        System.out.println(num + " plus five is: " + (num + 5));
    }

    public static void displayNumberSquared(int num) {
        System.out.println(num + " squared is: " + (num * num));
    }
}
