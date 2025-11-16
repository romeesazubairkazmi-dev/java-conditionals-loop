import java.util.Scanner;
public class Season {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	char choice;
	do {
	System.out.println("=====Islamabad Season Predictor=====");


	System.out.println("Enter daytime temperature (°C):");
	int dayTime= input.nextInt();
	
	
	System.out.println("Enter nighttime temperature (°C):");
	 int nightTime= input.nextInt();
	
	if (( dayTime <=20 && dayTime >= 10) && (nightTime >=0 && nightTime <= 10 ) ){
	System.out.println("Predicted Season:Winter");
	} 

	else if ((dayTime <= 27 && dayTime >= 24 ) && ( nightTime <= 17 && nightTime >= 14)){
	System.out.println("Predicted Season:Spring");
	 }

	else if (( dayTime <= 39 && dayTime >= 36) && (nightTime <= 26 && nightTime >=20)){
	System.out.println("Predicted Season:PreMonsoon /EarlySummer");
	}
	
	else if((dayTime <= 35 && dayTime >= 32) && (nightTime <= 27 && nightTime >= 26)){
	System.out.println("Predicted Season:Monsoon /RainySummer");
	}

	else if ((dayTime <= 23 && dayTime >= 21) && (nightTime <= 13 && nightTime >= 10)){
	System.out.println("Predicted Season:Autumn /PostMonsoon");}
	else {
	System.out.println("Invalid input"); }

	System.out.print("Do you want to Continue (C) or Exit (E)? ");
    	choice = input.next().toUpperCase().charAt(0);
	} while (choice == 'C'); 
	System.out.println("Program execution finished");
	}
}