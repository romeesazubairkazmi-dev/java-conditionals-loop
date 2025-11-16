import java.util.Scanner;

public class percentageCalculator {
    public static void main(String[] args) {
        int total;
        int percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of English subject :");
        int englishMarks = sc.nextInt();

        System.out.println("Enter the marks of Urdu subject :");
        int urduMarks = sc.nextInt();

        System.out.println("Enter the marks of Maths subject :");
        int mathsMarks = sc.nextInt();

        System.out.println("Enter the marks of Science subject :");
        int scienceMarks = sc.nextInt();

        int total = englishMarks + urduMarks + mathsMarks + scienceMarks ;
        int percentage = (total / 100 * 100);
        System.out.print("The percentage of the student is : ");
    }
}    

        

        
        