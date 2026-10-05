/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathnumberformatting;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class MathNumberFormatting {

    public static void main(String[] args) {
        // Enforce US locale for Scanner so standard decimal inputs (using '.') are parsed correctly
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // =========================================================================
        // TASK 1: Percentage of Girls and Boys
        // =========================================================================
        System.out.println("--- TASK 1: Student Percentages ---");
        System.out.print("Enter total number of students: ");
        int totalStudents = scanner.nextInt();

        System.out.print("Enter total number of girls: ");
        int numGirls = scanner.nextInt();

        // Calculate boy count and ratios
        int numBoys = totalStudents - numGirls;
        double girlsRatio = (double) numGirls / totalStudents;
        double boysRatio = (double) numBoys / totalStudents;

        // Using standard NumberFormat for percentages
        
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        percentFormatter.setMaximumFractionDigits(2);

        System.out.println("Percentage of Girls: " + percentFormatter.format(girlsRatio));
        System.out.println("Percentage of Boys:  " + percentFormatter.format(boysRatio));
        System.out.println();


    
        // TASK 2: USD to GBP & EUR Currency Conversion
   
        System.out.println("--- TASK 2: Currency Conversion ---");
        System.out.print("Enter total amount in Dollars and Cents (e.g., 150.75): ");
        double usdAmount = scanner.nextDouble();

        // Exchange rates:
        // $1 USD = 0.75 GBP (£)
        // $1 USD = 0.86 EUR (€)
        double gbpRate = 0.75;
        double eurRate = 0.86;

        double gbpTotal = usdAmount * gbpRate;
        double eurTotal = usdAmount * eurRate;

        // British Locale (£)
        NumberFormat gbpFormatter = NumberFormat.getCurrencyInstance(Locale.UK);
        
        // European / France Locale (€)
        NumberFormat eurFormatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("Exchange Rate: 0.75 GBP (£) per $1 USD");
        System.out.println("Converted GBP: " + gbpFormatter.format(gbpTotal));

        System.out.println("Exchange Rate: 0.86 EUR (€) per $1 USD");
        System.out.println("Converted EUR: " + eurFormatter.format(eurTotal));
        System.out.println();


        // =========================================================================
        // TASK 3: Formatting Math.PI to N Decimal Places
        // =========================================================================
        System.out.println("--- TASK 3: Format Math.PI ---");
        System.out.print("Enter an integer from 0 to 15: ");
        int decimalPlaces = scanner.nextInt();

        if (decimalPlaces >= 0 && decimalPlaces <= 15) {
            NumberFormat piFormatter = NumberFormat.getNumberInstance();
            piFormatter.setMinimumFractionDigits(decimalPlaces);
            piFormatter.setMaximumFractionDigits(decimalPlaces);

            System.out.println("Math.PI formatted to " + decimalPlaces + " decimal places: " 
                               + piFormatter.format(Math.PI));
        } else {
            System.out.println("Error: Number must be between 0 and 15.");
        }
        System.out.println();


        // =========================================================================
        // TASK 4: Large Random Decimal Generation (100,000,000 to 999e18)
        // =========================================================================
        System.out.println("--- TASK 4: Large Random Decimal ---");
        
        // Define exact boundaries:
        // Min: 100,000,000 (10^8)
        // Max: 999e18 = 999 * 10^18 = 999,000,000,000,000,000,000
        BigInteger minBound = new BigInteger("100000000");
        BigInteger maxBound = new BigInteger("999000000000000000000");
        BigInteger range = maxBound.subtract(minBound);

        // Generate a random BigInteger within range [0, range]
        Random rand = new Random();
        BigInteger randomBigInt;
        do {
            randomBigInt = new BigInteger(maxBound.bitLength(), rand);
        } while (randomBigInt.compareTo(range) > 0);

        // Add back minimum bound to ensure number is within [minBound, maxBound]
        BigInteger finalRandomInteger = minBound.add(randomBigInt);

        // Convert to BigDecimal and append a random fractional component
        BigDecimal randomDecimal = new BigDecimal(finalRandomInteger)
                .add(new BigDecimal(rand.nextDouble()));

        // Display plain decimal string without scientific notation
        System.out.println("Generated Random Decimal:");
        System.out.println(randomDecimal.toPlainString());

        scanner.close();
    }
}