import java.util.Scanner;

public class Price {
    public static void main(String[] args) {

        double discount = 0.0; // Declare discount variable outside the if statements
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the rate of product");
        int rate = s.nextInt();
        System.out.println("Enter the quantity of product");
        int qty = s.nextInt();
        double price = rate * qty;
        System.out.println("Price of the product is: " + price);

        if (price >= 1000 && price < 2000) {
            discount = 0.10 * price;
            
            
        }
        if (price >= 2000 && price < 3000) {
            discount = 0.25 * price;
        }
        if (price >= 3000 && price < 5000) {
            discount = 0.25 * price;
        }
        if (price >= 5000) {
            discount = 0.25 * price;
        }

        System.out.println("Discount on the price: " + discount);
    }
}
