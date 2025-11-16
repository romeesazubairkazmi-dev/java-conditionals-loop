import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userSelection;

        // Main menu
        do {
            System.out.println("------>Main Menu (Assignment-2)<------");
            System.out.println("1 - Question-1");
            System.out.println("2 - Question-2");
            System.out.println("3 - Question-3");
            System.out.println("4 - Question-4");
            System.out.println("5 - Question-5");
            System.out.println("Press option (1-5) to execute the program and Press 0 to Exit.");
            System.out.print("Enter your option: ");
            userSelection = input.nextInt();
            input.nextLine(); // Consume newline after nextInt()

            // Executing Questions
            switch (userSelection) {
                case 1:
                    question1(input);
                    break;
                case 2:
                    question2(input);
                    break;
                case 3:
                    question3(input);
                    break;
                case 4:
                    question4(input);
                    break;
                case 5:
                    question5(input);
                    break;
                case 0:
                    System.out.println("Exiting the Program");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 0-5.");
            }
        } while (userSelection != 0);

        input.close();
    }

    //-------------// Question 1-------------
    public static void question1(Scanner input) {
        char again;
        do {
            System.out.println("\n---->Executing Question 1<----");
            System.out.print("Enter a SSN in format DDD-DD-DDDD: ");
            String ssn = input.nextLine();

            if (ssn.matches("\\d{3}-\\d{2}-\\d{4}")) {
                System.out.println(ssn + " is a valid social security number");
            } else {
                System.out.println(ssn + " is an invalid social security number");
            }
            System.out.println();
            System.out.println("Do you want to Execute this question again then press (Y)");
            System.out.println("Otherwise Press (B) to go to the main menu");
            System.out.print("Enter your option: ");
            again = input.nextLine().toUpperCase().charAt(0);
        } while (again == 'Y');
    }

    //-------------// Question 2-------------
    public static void question2(Scanner input) {
        char again;
        do {
            System.out.println("\n---->Executing Question 2<----");
            System.out.print("Enter two characters: ");
            String userInput = input.nextLine().toUpperCase();

            if (userInput.length() != 2) {
                System.out.println("Invalid input");
            } else {
                String majorCode = userInput.substring(0, 1); // first character
                String statusCode = userInput.substring(1);   // second character

                // Determine major
                String major = "";
                if (majorCode.equals("M")) {
                    major = "Mathematics";
                } else if (majorCode.equals("C")) {
                    major = "Computer Science";
                } else if (majorCode.equals("I")) {
                    major = "Information Technology";
                } else {
                    System.out.println("Invalid input");
                    major = null; 
                }

                // Determine status
                String status = "";
                if (statusCode.equals("1")) {
                    status = "Freshman";
                } else if (statusCode.equals("2")) {
                    status = "Sophomore";
                } else if (statusCode.equals("3")) {
                    status = "Junior";
                } else if (statusCode.equals("4")) {
                    status = "Senior";
                } else {
                    System.out.println("Invalid input");
                    status = null; 
                }

                if (major != null && status != null) {
                    System.out.println(major + " " + status);
                }
            }

            System.out.println();
            System.out.println("Do you want to Execute this question again then press (Y)");
            System.out.println("Otherwise Press (B) to go to the main menu");
            System.out.print("Enter your option: ");
            again = input.nextLine().toUpperCase().charAt(0);
        } while (again == 'Y');
    }

    //------------// Question 3-------------
    public static void question3(Scanner input) {
        char again;
        do {
            System.out.println("\n----> Executing Question 3 <----");

            String plateNumber = "";

            // Generate 3 uppercase letters
            for (int i = 0; i < 3; i++) {
                char letter = (char) ('A' + (int) (Math.random() * 26));
                plateNumber += letter;
            }

            // Generate 4 digits
            for (int i = 0; i < 4; i++) {
                int digit = (int) (Math.random() * 10);
                plateNumber += digit;
            }

            // Output the generated plate number
            System.out.println("Generated Plate Number: " + plateNumber);

            System.out.println();
            System.out.println("Do you want to execute this question again? Press (Y)");
            System.out.println("Otherwise press (B) to go to the main menu");
            System.out.print("Enter your option: ");
            again = input.nextLine().toUpperCase().charAt(0);

        } while (again == 'Y');
    }

    //------------// Question 4-------------
    public static void question4(Scanner input) {
        char again;
        do {
            System.out.println("\n----> Executing Question 4 <----");
            System.out.print("Enter a decimal integer: ");
            int number = input.nextInt();
            input.nextLine(); 

            // case for zero
            if (number == 0) {
                System.out.println("Binary: 0");
            } else if (number > 0) {
                String binary = "";
                int original = number;

                while (number > 0) {
                    int remainder = number % 2;
                    binary = remainder + binary;
                    number = number / 2;
                }

                System.out.println("Binary of " + original + " is: " + binary);
            } else {
                System.out.println("Please enter a non-negative integer.");
            }

            System.out.println();
            System.out.println("Do you want to execute this question again? Press (Y)");
            System.out.println("Otherwise press (B) to go to the main menu");
            System.out.print("Enter your option: ");
            again = input.nextLine().toUpperCase().charAt(0);

        } while (again == 'Y');
    }

    //------------// Question 5-------------
    public static void question5(Scanner input) {
        char again;
        do {
            System.out.println("\n----> Executing Question 5 <----");
            int score = 0;

            // Question 1
            System.out.println("Q1: What is the main greenhouse gas produced by human activities?");
            System.out.println("1. Methane\n2. Water vapor\n3. Carbon dioxide\n4. Nitrogen");
            if (input.nextInt() == 3) score++;
            input.nextLine(); 

            // Question 2
            System.out.println("\nQ2: What is one common argument made by global warming skeptics?");
            System.out.println("1. Climate change is caused mainly by the sun and natural cycles");
            System.out.println("2. Humans have complete control over Earth's temperature");
            System.out.println("3. The planet has never warmed or cooled before");
            System.out.println("4. Global warming is a myth created by the media");
            if (input.nextInt() == 1) score++;
            input.nextLine();  

            // Question 3
            System.out.println("\nQ3: What major international agreement aimed to reduce global carbon emissions?");
            System.out.println("1. Paris Agreement\n2. Kyoto Protocol\n3. Geneva Convention\n4. Warsaw Pact");
            if (input.nextInt() == 1) score++;
            input.nextLine(); 

            // Question 4
            System.out.println("\nQ4: What does the IPCC conclude about climate change?");
            System.out.println("1. Climate change is not happening");
            System.out.println("2. It is very likely caused by human activity");
            System.out.println("3. It is a hoax by politicians");
            System.out.println("4. It has no measurable impact");
            if (input.nextInt() == 2) score++;
            input.nextLine(); 

            // Question 5
            System.out.println("\nQ5: Which of the following is often cited as evidence against the severity of global warming?");
            System.out.println("1. Melting glaciers\n2. Rising sea levels\n3. Increased hurricanes\n4. Cooling periods in recent decades");
            if (input.nextInt() == 4) score++;
            input.nextLine(); 

            // Display result
            System.out.println("\nYou got " + score + " out of 5 correct.");

            if (score == 5) {
                System.out.println("Excellent!");
            } else if (score == 4) {
                System.out.println("Very good!");
            } else {
                System.out.println("Time to brush up on your knowledge of global warming.");
                System.out.println("Here are some helpful websites to learn more:");
                System.out.println("- https://climate.nasa.gov");
                System.out.println("- https://www.ipcc.ch");
                System.out.println("- https://skepticalscience.com");
            }

            System.out.println();
            System.out.println("Do you want to execute this question again? Press (Y)");
            System.out.println("Otherwise press (B) to go to the main menu");
            System.out.print("Enter your option: ");
            again = input.nextLine().toUpperCase().charAt(0);

        } while (again == 'Y');
    }
}
