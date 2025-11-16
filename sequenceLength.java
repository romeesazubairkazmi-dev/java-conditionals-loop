import java.util.Scanner;

public class sequenceLength {
        static Scanner input = new Scanner(System.in);
	static final int SENTINEL = 0;
	public static void main(String[] args) {

        int count = 0;
        int number;

        System.out.println("Enter the sequence of numbers" + " ending with " + SENTINEL);
	 number = input.nextInt();
        while( number !=SENTINEL){
        count++;
	 number = input.nextInt();       
            }

        System.out.println(" the length of the sequence: " + count);
    }
}
