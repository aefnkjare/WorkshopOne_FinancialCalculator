package CalculatorProject;

import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args){

//        int principal = 45000;
//        float rateOfInt = 6.259f;
//        int months = 44;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is your principal?");
        float principalAns = myScanner.nextFloat();

        System.out.println("Okay, now what is your interest rate in months?");
        float intRate = myScanner.nextFloat();

        System.out.println("Finally, how long will this loan last for?");
        float months = myScanner.nextFloat();

//        float principal = principalAns;
//        float rateOfInt = intRate;
//        float time = months;


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