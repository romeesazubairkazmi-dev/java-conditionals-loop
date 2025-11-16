import java.util.Scanner;
	public class sumOfCubes {
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	
	//Part a
	System.out.println("Enter A : " );
	int A = input.nextInt();
	System.out.println("Enter B : " );
	int B = input.nextInt();
	while ( A <= B ){
	System.out.println( A );
	A++; }
	
	//Part b
	System.out.println("Enter a : " );
	int a = input.nextInt();
	System.out.println("Enter b : " );
	int b = input.nextInt();

	while (a < b){
	System.out.println(a);
	a++; }
	while (a >= b){
	System.out.println(a);
	a--; }

	//Part c
	int num; 
	int sum = 0;
	int count = 0;
	System.out.print("Enter the number of " + "integers in the list: ");

	int N = input.nextInt(); 
	System.out.println("Enter the  integers :" );
	
	while (count < N)
	{
	int number = input.nextInt();
	sum = sum + number;
	count++;
	}
	System.out.println("The sum of integers is :" + sum);	

	//Part d
	System.out.print("Enter the number of " + "integers : ");
	int M = input.nextInt(); 
	int i = 1;
	int cubeSum = 0;
	System.out.println("The numbers are: ");
	while ( i <= M ){
	System.out.printf("%d ",i);
	cubeSum = cubeSum + i * i * i;
	i++;
	}
	System.out.println("\nSum of cubes = " + cubeSum);
	}
}