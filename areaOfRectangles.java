import java.util.Scanner;
public class areaOfRectangles {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// first rectangle
	
	double length1 = input.nextDouble();
	double width1 = input.nextDouble();
	double area1 = length1 * width1;
	System.out.println("Area1 = " + area1);

 	// second rectangle
	double length2 = input.nextDouble();
	double width2 = input.nextDouble();
	double area2 = length2 * width2;
	System.out.println("Area2 = " + area2);
 	
 	if (area1 > area2) {
	System.out.println("First rectangle has greater area:" + area1);
	 }
	else if (area2 > area1) {
	System.out.println("Second rectangle has greater area:" + area2); 
	}
	else { 
	System.out.println("Both rectangles have the same area:" + area1); 
	}
	 input.close();
	}
}
