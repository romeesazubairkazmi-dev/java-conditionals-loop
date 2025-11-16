public class CarLoan {
    public static void main(String[] args) {
        
        double loan = 1200000; 
        double annualRate = 0.12;
        int loanYears = 5;
	int totalMonths = 60;
        
        double monthlyRate = 0.12 / 12;
       
        double monthlyInstallment =(loan * monthlyRate) / ( 1 - Math.pow(1 + monthlyRate, - totalMonths));
       

        System.out.printf("Hassan's monthly car loan installment: Rs. %.2f\n", monthlyInstallment);
    }
}
