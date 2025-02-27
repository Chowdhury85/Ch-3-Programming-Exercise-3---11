import java.util.Scanner;

public class BookBilling {
    private static final double BOOK_PRICE = 14.99;
    private static final double TAX_RATE = 0.08;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Testing computeBill() with no parameters
        System.out.printf("Total cost for one book: $%.2f%n", computeBill());
        
        // Prompt user for number of books
        System.out.print("Enter the number of books ordered: ");
        int quantity = input.nextInt();
        System.out.printf("Total cost for %d books: $%.2f%n", quantity, computeBill(quantity));
        
        // Prompt user for coupon value
        System.out.print("Enter coupon value: ");
        double coupon = input.nextDouble();
        System.out.printf("Total cost for %d books with a $%.2f coupon: $%.2f%n", quantity, coupon, computeBill(quantity, coupon));
        
        input.close();
    }

    public static double computeBill() {
        return BOOK_PRICE + (BOOK_PRICE * TAX_RATE);
    }

    public static double computeBill(int quantity) {
        double subtotal = quantity * BOOK_PRICE;
        return subtotal + (subtotal * TAX_RATE);
    }

    public static double computeBill(int quantity, double coupon) {
        double subtotal = (quantity * BOOK_PRICE) - coupon;
        return subtotal + (subtotal * TAX_RATE);
    }
}
