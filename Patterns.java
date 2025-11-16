import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;

        do {
            System.out.println("\nChoose which pattern to print:");
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            System.out.println("5");

            System.out.print("Enter your choice (1–5): ");
            int choice = input.nextInt();

            
            input.nextLine();  

            switch (choice) {
                case 1:
                    for (int i = 1; i <= 4; i++) {
                        for (int j = 1; j <= 10; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = i; j < 5; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= (2 * i - 1); k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = i; j < 5; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= (2 * i - 1); k++) {
                            System.out.print(i);
                        }
                        System.out.println();
                    }
                    break;

                default:
                    System.out.println("Invalid choice! Please select between 1–5.");
                    break;
            }

            System.out.print("\nDo you want to print another pattern? (y/n): ");
            ch = input.next().toUpperCase().charAt(0); 

        } while (ch != 'N');

        System.out.println("Program terminated.");
        input.close();
    }
}
