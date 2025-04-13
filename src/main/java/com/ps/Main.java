package com.ps;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
//        System.out.println("| Welcome to PluralSight Bank's Mortgage Calculator |");
//        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
//        System.out.println("Please enter the total amount of your loan");
//        double principalAmount = scanner.nextDouble();
//        System.out.println("Please enter the annual interest rate for your loan (in percentage)");
//        float interestRate = scanner.nextFloat();
//        System.out.println("Please enter the length of the loan (in years)");
//        int loanLength = scanner.nextInt();
//
//        System.out.println("Please confirm that the following information is correct:");
//        System.out.println("Total amount of loan: "+ principalAmount);
//        System.out.println("Annual Interest rate: " + interestRate);
//        System.out.println("Loan length: " + loanLength);
//        System.out.println("Enter 'Yes'  or 'No' ");
//        scanner.nextLine();
//        String infoConfirmation = scanner.nextLine();
//
//        if(infoConfirmation.equalsIgnoreCase("Yes")){
//           float monthlyInterestRate = (interestRate/(100*12));
//           int loanLengthInMonths = loanLength*12;
//
//           double monthlyPayment = principalAmount*((monthlyInterestRate* Math.pow(1+monthlyInterestRate,loanLengthInMonths))/(Math.pow(1+monthlyInterestRate,loanLengthInMonths)-1));
//           double totalInterest = (monthlyPayment*loanLengthInMonths)-principalAmount;
//            System.out.printf("Your monthly payment is: $%.2f\n",monthlyPayment);
//
//            System.out.printf("Your total interest is: $%.2f", totalInterest);
//
//        }
//        else {
//            System.out.println("Please restart again");
//        }


//        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
//     System.out.println("| Welcome to PluralSight Bank's Future Value Calculator |");
//       System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
//        System.out.println("Please enter the total amount of your deposit");
//        double depositAmount = scanner.nextDouble();
//        System.out.println("Please enter the annual interest rate for your deposit (in percentage)");
//        float interestRate = scanner.nextFloat();
//        System.out.println("Please enter the length of the CD (in years)");
//        int cdLength = scanner.nextInt();
//
//        System.out.println("Please confirm that the following information is correct:");
//        System.out.println("Total amount of deposit: "+ depositAmount);
//        System.out.println("Annual Interest rate: " + interestRate);
//        System.out.println("CD length: " + cdLength);
//       System.out.println("Enter 'Yes'  or 'No' ");
//        scanner.nextLine();
//        String infoConfirmation = scanner.nextLine();
//
//        if(infoConfirmation.equalsIgnoreCase("Yes")){
//           float interestRateInDecimal = (interestRate/100);
//           int cdLengthInDays = cdLength*365;
//
//           double futureValue = depositAmount*Math.pow(1+(interestRateInDecimal/365),cdLengthInDays);
//           double totalInterest = futureValue-depositAmount;
//            System.out.printf("Your monthly payment is: $%.2f\n",futureValue);
//
//            System.out.printf("Your total interest is: $%.2f", totalInterest);
//
//        }
//        else {
//            System.out.println("Please restart again");
//        }

        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("| Welcome to PluralSight Bank's Present Value Calculator |");
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("Please enter the total amount of your monthly payout");
        double monthlyPayout = scanner.nextDouble();
        System.out.println("Please enter the annual interest rate (in percentage)");
        float interestRate = scanner.nextFloat();
        System.out.println("Please enter the length of the investment (in years)");
        int investmentLength = scanner.nextInt();

        System.out.println("Please confirm that the following information is correct:");
        System.out.println("Total amount of monthly payout: "+ monthlyPayout);
        System.out.println("Annual Interest rate: " + interestRate);
        System.out.println("Investment length: " + investmentLength);
        System.out.println("Enter 'Yes'  or 'No' ");
        scanner.nextLine();
        String infoConfirmation = scanner.nextLine();

        if(infoConfirmation.equalsIgnoreCase("Yes")){
            float interestRateInDecimal = (interestRate/(100*12));
            int investmentLengthInMonths = investmentLength*12;

            double presentValue = monthlyPayout*((1-Math.pow((1+interestRateInDecimal),-investmentLengthInMonths))/interestRateInDecimal);

            System.out.printf("Your monthly payment is: $%.2f\n",presentValue);



        }
        else {
            System.out.println("Please restart again");
        }








    }


}