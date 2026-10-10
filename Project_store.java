import java.util.Scanner;
import java.util.Locale;



public class Project_store {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();

        System.out.print("Enter shipping cost: ");
        double shippingCost = scanner.nextDouble();

        double productTotal = pricePerItem * quantity;

        double finalPrice = productTotal + shippingCost;

        System.out.println("Order: " + quantity + "x " +productName);
        System.out.println("Product total: " + productTotal + " EUR");
        System.out.println("Final prize: " + finalPrice + " EUR");
        

        scanner.close();

    }
    
}
