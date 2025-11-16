import java.util.Scanner;

public class maxOfSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int SENTINEL= 0;
	int number;
	int max = 0;

	System.out.println("Enter integers " + " ending with " + SENTINEL + ":");
	number = input.nextInt();
	while(number != SENTINEL){
	if(number > max){
	max = number; }
	 number = input.nextInt(); 
	}
	System.out.println("Maximum number in sequence is :" + max);
	}
}
