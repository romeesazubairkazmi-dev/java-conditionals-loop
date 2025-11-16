public class BMICalculator {
    public static void main(String[] args) {
        
        double weight = 62; 
        double height = 1.68; 

        
        double bmi = weight / (height * height);

        System.out.println("Sara's BMI is: " + bmi);
        System.out.printf("Sara's BMI is: %.2f ", bmi);
    }
}
