import java.util.Scanner;

public class IndexOfMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int SENTINEL = 0;

        int index = 1;
        int maxIndex = 0;
        int max = Integer.MIN_VALUE;

        while (true) {
            int number = input.nextInt();

            if (number == SENTINEL) {
                break;
            }

            if (number > max) {
                max = number;
                maxIndex = index;
            }

            index++;
        }

        System.out.println("Index of max is: " + maxIndex);
        input.close();
    }
}

            
