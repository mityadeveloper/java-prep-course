import java.util.Scanner;
import java.util.Locale;



public class Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("What is your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the distance to university in km: ");
        double distanceToUniversity = scanner.nextDouble();

        System.out.print("Enter the number of days per week: ");
        int days = scanner.nextInt();

        double weeklyDistance = distanceToUniversity * 2 * days;

        System.out.println(name + " travels " + distanceToUniversity + " km to University.");
        System.out.println("Weekly distance: " + weeklyDistance + " km");

        scanner.close();

    }
    
}
