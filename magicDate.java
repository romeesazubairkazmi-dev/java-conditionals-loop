import java.util.Scanner;

public class magicDate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter day: ");
        int day = input.nextInt();
        System.out.print("Enter two-digit year: ");
        int year = input.nextInt();
        
        if (month * day == year) {
            System.out.println("The date is magic!");
        } else {
            System.out.println("The date is not magic.");
        }
        
        input.close();
    }
}