import java.util.Scanner;

public class factorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer n: ");
        int n = input.nextInt();
        
        int factorial = 1;
        int i = 1;
        
        while (i <= n) {
            factorial *= i; 
            i++;
        }
        
        System.out.println(n + "! = " + factorial);
    }
}
