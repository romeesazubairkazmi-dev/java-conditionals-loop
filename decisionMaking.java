import java.util.*;
	public class decisionMaking{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter an integer: ");
	int num1 = sc.nextInt();
	System.out.println("Enter an integer: ");
	int num2 = sc.nextInt();
	System.out.println("Enter an integer: ");
	int num3 = sc.nextInt();

	if ( num1 == num2 && num2 == num3 && num1 == num3){
	System.out.println("3");
	}
	else if (num1 == num2 || num2 == num3 || num1 == num3){
	System.out.println("2");
	}
	else{
	System.out.println("0");
	}
	}
}