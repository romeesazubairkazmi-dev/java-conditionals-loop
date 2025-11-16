import java.util.Scanner;

public class greaterElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int SENTINEL = 0;
	int prevNumber;
	int count= 0;
	 prevNumber = input.nextInt(); 
	
	while (true) {
            int currentNumber = input.nextInt();

            if (currentNumber == SENTINEL) {
                break;  
            }
		
	
            if (currentNumber > prevNumber) {
                count++;
            }

            prevNumber = currentNumber;  
        }

        System.out.println(count);
    }
}
