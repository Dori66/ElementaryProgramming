import java.util.Scanner;

public class ComputeLoan {
    /**
     * The program must satisfy the following requirements:
     *  ■ It must let the user enter the interest rate, the loan amount, and the number of years
     * for which payments will be made.
     *  ■ It must compute and display the monthly payment and total payment amounts.
     * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.println("Enter number of years: ");
        int numberOfYears = scanner.nextInt();

        System.out.println("Enter a loan amount: ");
        double loanAmount = scanner.nextDouble();

        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1/ Math.pow(1 + monthlyInterestRate,numberOfYears * 12));

        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.println("The monthly payment is $"+(int)(monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is $"+(int)(totalPayment * 100)/100.0);
    }
}
