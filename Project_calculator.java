import java.util.Scanner;
import java.util.Locale;



public class Project_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter movie title: ");
        String movieTitle = scanner.nextLine();

        System.out.print("Enter ticket price: ");
        double ticketPrice = scanner.nextDouble();

        System.out.print("Enter the number of tickets: ");
        int numberOfTickets = scanner.nextInt();

        System.out.print("Are you a student? (true/false): ");
        boolean hasStudentDiscount = scanner.nextBoolean();

        double totalPrice = ticketPrice * numberOfTickets;
        double discountAmount = 0;

        if (hasStudentDiscount) {
            discountAmount = totalPrice * 0.2;
        }

        double finalPrice = totalPrice - discountAmount;

        System.out.println("Movie title: " + movieTitle);
        System.out.println("Before discount: " + totalPrice + " EUR");
        System.out.println("Discount (20%): " + discountAmount + " EUR");
        System.out.println("Final price: " + finalPrice + " EUR");

        scanner.close();

    }
    
}