import java.util.Scanner;
public class logicTask {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter an integer:");
	int a = input.nextInt();

	System.out.println("Enter an integer:");
	int b = input.nextInt();
  	if (a > b){
		System.out.println("Enter the smaller value:" + b);}
 	else if  ( b > a ){
		System.out.println("Enter the smaller value:" + a);
	}
	
	// sign functions 
	System.out.println("Enter an integer for sign functions:");
	int x = input.nextInt();
	if(x>0){
	System.out.println("1");}
	if(x<0){
	System.out.println("-1");}
	if(x==0){
	System.out.println("0");}
	
	// minimum of three numbers

	System.out.println("Enter an integer:");
	int c = input.nextInt();

	System.out.println("Enter an integer:");
	int d = input.nextInt();
	
	System.out.println("Enter an integer:");
	int e = input.nextInt();
	int min = c;

	if (d < min) {
        min = d;
	}
	if (e < min) {
    	min = e;
	}

	System.out.println("Smallest of the three: " + min);
    }
}

