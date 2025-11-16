import java.util.Scanner;

public class countZeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int N = input.nextInt();

        int countZeros = 0;
        int i = 0;

        System.out.println("Enter the integers:");
        while (i < N) {
            int number = input.nextInt();
            if (number == 0) {
                countZeros++;
            }
            i++;
        }

        System.out.println("Number of zeros: " + countZeros);
    }
}
