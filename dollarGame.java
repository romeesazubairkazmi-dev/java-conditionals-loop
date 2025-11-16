import java.util.Scanner;

public class dollarGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of coins to make exactly $1.00");
        System.out.print("Pennies: ");
        int pennies = sc.nextInt();
        System.out.print("Nickels: ");
        int nickels = sc.nextInt();
        System.out.print("Dimes: ");
        int dimes = sc.nextInt();
        System.out.print("Quarters: ");
        int quarters = sc.nextInt();
        
        // Calculate total value in cents
        int totalCents = pennies + (nickels * 5) + (dimes * 10) + (quarters * 25);
        
        if (totalCents == 100) {
            System.out.println("Congratulations! You won the game!");}
         else if (totalCents > 100) {
            System.out.println("Amount entered was more than one dollar.");}
        else {
            System.out.println("Amount entered was less than one dollar.");
        }
   
    }
}