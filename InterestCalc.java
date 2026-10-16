/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interestcalc;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author jsumma2027
 */
public class InterestCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  

        Scanner scan = new Scanner(System.in);

        // Get the loan amount and repayment period
        System.out.print("Enter loan amount: $");
        double amount = scan.nextDouble();

        System.out.print("Enter repayment period in months: ");
        int months = scan.nextInt();

        // Create the calculator
        InterestRateCalculator calc =
                new InterestRateCalculator(amount, months);

        // Display the results
        calc.printRepaymentSummary();

        scan.close();
    }
}

class InterestRateCalculator {

    // Annual interest rate of 3.5%
    public static final double RATE = 0.035;

    // Private variables
    private double amount;
    private int months;

    // Constructor
    public InterestRateCalculator(double amount, int months) {
        this.amount = amount;
        this.months = months;
    }

    // Calculate the monthly payment
    public double calculateMonthlyPayment() {

        double monthlyPrincipal = amount / months;
        double monthlyInterest = amount * RATE / 12;

        return monthlyPrincipal + monthlyInterest;
    }

    // Calculate the total repayment
    public double calculateTotalRepayment() {
        return calculateMonthlyPayment() * months;
    }

    // Display the repayment summary
    public void printRepaymentSummary() {

        NumberFormat money =
                NumberFormat.getCurrencyInstance(Locale.US);

        System.out.println("\n--- Repayment Summary ---");
        System.out.println("Loan Amount: "
                + money.format(amount));
        System.out.println("Interest Rate: "
                + (RATE * 100) + "%");
        System.out.println("Repayment Period: "
                + months + " months");
        System.out.println("Monthly Payment: "
                + money.format(calculateMonthlyPayment()));
        System.out.println("Total Amount Repaid: "
                + money.format(calculateTotalRepayment()));
    }
}
