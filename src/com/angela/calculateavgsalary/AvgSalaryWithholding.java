package com.angela.calculateavgsalary;

import java.util.Scanner;

public class AvgSalaryWithholding {
    
    public static void main(String[] args) {
        
        // Pseudocode:

        // START
        //     DECLARATIONS
        //          int weeklyGrossSalary
        //          double taxAmount
        //          double weeklyNetSalary
        //          
        //     SET

        // Initialize project variables
        int weeklyGrossSalary;
        double taxAmount;
        double weeklyNetSalary;

        // Initialize Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Prompt user for weekly gross salary
        System.out.println("Please enter your weekly salary amount before tax withholding: ");
        weeklyGrossSalary = input.nextInt();
        
        // Calculate tax amount withheld and net salary for salary less than $500
        if (weeklyGrossSalary < 500) {
            taxAmount = weeklyGrossSalary * 0.10;
            weeklyNetSalary = weeklyGrossSalary - taxAmount;
            System.out.printf("Tax Amount Withheld: %.2f%n", + taxAmount);
            System.out.printf("Weekly Net Salary: %.2f%n",  weeklyNetSalary);
        }
        // Calculate tax amount withheld and net salary for salary between $500 and $1500 
        else if ((weeklyGrossSalary >= 500) && (weeklyGrossSalary < 1500)) {
            taxAmount = weeklyGrossSalary * 0.15;
            weeklyNetSalary = weeklyGrossSalary - taxAmount;
            System.out.printf("Tax Amount Withheld: %.2f%n", + taxAmount);
            System.out.printf("Weekly Net Salary: %.2f%n",  weeklyNetSalary);
        } 
        // Calculate tax amount withheld and net salary for salary between $1500 and $2500
        else if ((weeklyGrossSalary >= 1500) && (weeklyGrossSalary < 2500)) {
            taxAmount = weeklyGrossSalary * 0.20;
            weeklyNetSalary = weeklyGrossSalary - taxAmount;
            System.out.printf("Tax Amount Withheld: %.2f%n", + taxAmount);
            System.out.printf("Weekly Net Salary: %.2f%n",  weeklyNetSalary);
        }
        // Calculate tax amount withheld and net salary for salary $2500 and above
        else {
            taxAmount = weeklyGrossSalary * 0.30;
            weeklyNetSalary = weeklyGrossSalary - taxAmount;
            System.out.printf("Tax Amount Withheld: %.2f%n", + taxAmount);
            System.out.printf("Weekly Net Salary: %.2f%n",  weeklyNetSalary);
        }

        // Close the scanner
        input.close();
    }
}
