/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumeratedtype.classassignment;

import java.util.Scanner;

public class EnumeratedTypeClassAssignment {

    // Enum for Days of the Week
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    // Enum for Months of the Year
    enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
        JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 1a) Days of the Week (1-7) ===");
        Day d1 = Day.SUNDAY;
        Day d2 = Day.MONDAY;
        Day d3 = Day.TUESDAY;
        Day d4 = Day.WEDNESDAY;
        Day d5 = Day.THURSDAY;
        Day d6 = Day.FRIDAY;
        Day d7 = Day.SATURDAY;

        //Days of the week that corresponds to a number value
        
        System.out.println(d1 + ": " + (d1.ordinal() + 1));
        System.out.println(d2 + ": " + (d2.ordinal() + 1));
        System.out.println(d3 + ": " + (d3.ordinal() + 1));
        System.out.println(d4 + ": " + (d4.ordinal() + 1));
        System.out.println(d5 + ": " + (d5.ordinal() + 1));
        System.out.println(d6 + ": " + (d6.ordinal() + 1));
        System.out.println(d7 + ": " + (d7.ordinal() + 1));

        //Months of the year are listed below
        
        System.out.println("\n=== 1b) Months of the Year (1-12) ===");
        Month m1 = Month.JANUARY;
        Month m2 = Month.FEBRUARY;
        Month m3 = Month.MARCH;
        Month m4 = Month.APRIL;
        Month m5 = Month.MAY;
        Month m6 = Month.JUNE;
        Month m7 = Month.JULY;
        Month m8 = Month.AUGUST;
        Month m9 = Month.SEPTEMBER;
        Month m10 = Month.OCTOBER;
        Month m11 = Month.NOVEMBER;
        Month m12 = Month.DECEMBER;

        System.out.println(m1 + ": " + (m1.ordinal() + 1));
        System.out.println(m2 + ": " + (m2.ordinal() + 1));
        System.out.println(m3 + ": " + (m3.ordinal() + 1));
        System.out.println(m4 + ": " + (m4.ordinal() + 1));
        System.out.println(m5 + ": " + (m5.ordinal() + 1));
        System.out.println(m6 + ": " + (m6.ordinal() + 1));
        System.out.println(m7 + ": " + (m7.ordinal() + 1));
        System.out.println(m8 + ": " + (m8.ordinal() + 1));
        System.out.println(m9 + ": " + (m9.ordinal() + 1));
        System.out.println(m10 + ": " + (m10.ordinal() + 1));
        System.out.println(m11 + ": " + (m11.ordinal() + 1));
        System.out.println(m12 + ": " + (m12.ordinal() + 1));

        System.out.println("\n=== 2) CCHS Username & Graduation Year Parser ===");
        System.out.print("Enter your CCHS username (including 4-digit graduation year, e.g., jsmith2026): ");
        String username = scanner.nextLine().trim();

        // Extract the last 4 characters for the year
        String yearString = username.substring(username.length() - 4);

        // Parse the year using Integer object
        int gradYear = Integer.parseInt(yearString);
        int nextYear = gradYear + 1;

        // Print graduation information
        System.out.println("Graduation year: " + gradYear);
        System.out.println("The year after your graduation year will be: " + nextYear);
        System.out.println("In computer language, you graduate in: " + Integer.toBinaryString(gradYear));

        // Prompt to exit program
        System.out.println("\nPress ENTER to exit...");
        scanner.nextLine();

        scanner.close();
        System.exit(0);
    }
}