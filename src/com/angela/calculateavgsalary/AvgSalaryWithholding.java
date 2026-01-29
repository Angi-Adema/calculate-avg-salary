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
        
        // Calculate tax and net salary based on gross salary amount
        if (weeklyGrossSalary < 500) {
            taxAmount = weeklyGrossSalary * 0.10;
            weeklyNetSalary = weeklyGrossSalary - taxAmount;
            System.out.printf("Weekly Net Salary: %.2f%n",  weeklyNetSalary);
            
        } else if (weeklyGrossSalary < 1500) {
            taxAmount = weeklyGrossSalary * 0.15;
            weeklyNetSalary = weeklyGrossSalary - taxAmount;
            System.out.printf("Weekly Net Salary: %.2f%n",  weeklyNetSalary);
        }

        input.close();
    }
}
