import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.print("What is your age? ");
        int age = scanner.nextInt();

        System.out.print("Hello " + name + "! ");
        System.out.print("Next year you will be " + (age + 1) + ".");

        scanner.nextLine();
        System.out.println();

        System.out.print("University: ");
        String university = scanner.nextLine();

        System.out.print("Semester: ");
        int semester = scanner.nextInt();

        System.out.println("University: " + university);
        System.out.println("Semester: " + semester);



        
        scanner.close();

    }
    
}
