package com.ps;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("| Welcome to PluralSight Bank's Mortgage Calculator |");
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("Please enter the total amount of your loan");
        double principalAmount = scanner.nextDouble();
        System.out.println("Please enter the annual interest rate for your loan (in percentage)");
        float interestRate = scanner.nextFloat();
        System.out.println("Please enter the length of the loan (in years)");
        int loanLength = scanner.nextInt();

        System.out.println("Please confirm that the following information is correct:");
        System.out.println("Total amount of loan: "+ principalAmount);
        System.out.println("Annual Interest rate: " + interestRate);
        System.out.println("Loan length: " + loanLength);
        System.out.println("Enter 'Yes'  or 'No' ");
        scanner.nextLine();
        String infoConfirmation = scanner.nextLine();

        if(infoConfirmation.equalsIgnoreCase("Yes"){
           float monthlyInterestRate = (interestRate/(100*12));
           int loanLengthInMonths = loanLength*12;







        }














    }
}