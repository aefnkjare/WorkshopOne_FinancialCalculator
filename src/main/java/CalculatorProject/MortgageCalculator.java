package CalculatorProject;

import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args){

//        int principal = 45000;
//        float rateOfInt = 6.259f;
//        int months = 44;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is your principal?");
        double principalAns = myScanner.nextDouble();

        System.out.println("Okay, now what is your interest rate" +
                "?");
        double intRate = myScanner.nextDouble();

        System.out.println("Finally, how long will this loan last for in months?");
        double months = myScanner.nextDouble();

//        float principal = principalAns;
//        float rateOfInt = intRate;
//        float time = months;

        // principalAns * intRate

        double sumOne = 1 + (intRate / 12);
        double sumTwo = Math.pow(sumOne, months);
        double sumThree = sumTwo - 1;
        double sumFour = sumTwo / sumThree;
        double sumFive = (intRate / 12) * sumFour;
        double sumSix = principalAns * sumFive;
        double sumSeven = sumSix * 180;

//        System.out.printf("Your monthly payment should be $%.2f" , sumSix);
         System.out.println("Your monthly payment should be $" + String.format("%.2f", sumSix));
        System.out.println(" and your total interest is $" + String.format("%.2f", sumSeven - principalAns));


    }
}
/////////////////////////////////
//              scanner code and reference
//    Scanner myScanner = new Scanner(System.in);
//
//        System.out.println("What is your name?");
//                String nameRes = myScanner.nextLine();
//
//                System.out.println("Howdy " + nameRes + ", what's youre favorite color?");
//                String dayRes = myScanner.nextLine();
//
//                System.out.println("Oh is that so? Mine is also " + dayRes + "!");
//                String ageRes = myScanner.nextLine();
//
//                System.out.println("what is your age?");
/////////////////////////////////////////////////////////
//  things I didn't do
//                  float principleRes = myScanner.nextFloat(); // principle answer
//////////////////////////////////////////////////////////////
//Scanner myScanner = new Scanner(System.in);
//
//        System.out.println("Please give me two numbers to add");
//
//                System.out.print("Number One: ");
//                int numberOne = myScanner.nextInt();
//
//                System.out.print("numberTwo: ");
//                int numberTwo = myScanner.nextInt();
//
//                int sum = numberOne + numberTwo;
//
//                System.out.printf("The sum is: %d", sum);
/////////////////////////////////
//double sum = Math.pow(2, 3);
//
//        System.out.println(sum);
//////////////////////////////////////////
//float subtotal = 22.87f;
//    float tax = subtotal * 0.0825f;
//    float totalDue = subtotal + tax;
//        System.out.println(
//                "Total due is: " + String.format("%.2f", totalDue));
//                System.out.printf("Total due is: %.2f ", totalDue);
