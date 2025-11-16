import java.util.Scanner;

public class CarPooling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter total miles driven per day: ");
        double milesPerDay = sc.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: RS. ");
        double costPerGallon = sc.nextDouble();

        System.out.print("Enter average miles per gallon : ");
        double averageMiles = sc.nextDouble();

        System.out.print("Enter parking fees per day: Rs. ");
        double dailyParkingFees = sc.nextDouble();

        System.out.print("Enter tolls per day: Rs. ");
        double dailyTolls = sc.nextDouble();
	
	double fuelCost = (milesPerDay / averageMiles) * costPerGallon;
	float dailyCost = (float)(fuelCost + dailyParkingFees + dailyTolls);

	System.out.println("Cost per day of driving to work is $" + dailyCost);
	}
}