import java.util.Scanner;

public class evenElements {
        static Scanner input = new Scanner(System.in);
	static final int SENTINEL = 0;
	public static void main(String[] args) {
	int number  ;
	int count = 0;
	number = input.nextInt();

	while (number != SENTINEL){
	if ( number % 2 == 0) {
	count++ ; }
	number = input.nextInt();

	}
	System.out.println("The number of even elements in the sequence : " + count);
	}
}
