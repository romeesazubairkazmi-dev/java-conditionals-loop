import java.util.Scanner;
public class Energy {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);	
	int solarRate = 7;
	int companyRate = 60;
	
	System.out.println("Enter number of units consumed from solar system : "); 
	int solarUnits = sc.nextInt();

	
	System.out.println("Enter number of units consumed from electricity company : "); 
	int companyUnits = sc.nextInt();

	int totalUnits = solarUnits + companyUnits;
	int totalCostIfCompanyOnly = totalUnits * companyRate;
	int actualCost = (solarUnits * solarRate) + (companyUnits * companyRate);
	int savings = totalCostIfCompanyOnly - actualCost ;

	System.out.println("Total units consumed: " + totalUnits);
        System.out.println("Total cost if all from company: Rs. " + totalCostIfCompanyOnly);
        System.out.println("Actual cost using solar + company: Rs. " + actualCost);
        System.out.println("Total savings by using solar power: Rs. " + savings);
	
	 
	}
}
	