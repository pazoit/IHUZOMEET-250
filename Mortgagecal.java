import java.util.Scanner;

public class Mortgagecal {
    public static void main(String[] args) throws Exception {
        
          Scanner scanner = new Scanner(System.in);

        // Input loan amount
        System.out.print("Enter the loan amount: ");
        double loanAmount = scanner.nextDouble();

        // Input annual interest rate
        System.out.print("Enter the annual interest rate (in %): ");
        double annualInterestRate = scanner.nextDouble();

        // Input loan term in years
        System.out.print("Enter the loan term (in years): ");
        int loanTermInYears = scanner.nextInt();

        // Calculate the monthly interest rate
        double monthlyInterestRate = annualInterestRate / 100 / 12;

        // Calculate the number of payments
        int numberOfPayments = loanTermInYears * 12;

        // Calculate the monthly mortgage payment
        double monthlyPayment = (loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) / 
                                (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        // Display the monthly payment
        System.out.printf("Your monthly payment is: %.2f\n", monthlyPayment);

        scanner.close();
    }
}
