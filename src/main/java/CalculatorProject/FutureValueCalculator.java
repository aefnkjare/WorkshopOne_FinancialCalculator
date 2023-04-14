package CalculatorProject;

public class FutureValueCalculator {
    public static void main(String[] args){

        double principal = 1000;
        double Interest = 1.75;
        double years = 5;

        double rateOfInterest = (1 + Interest) / 365;
        double sumOne = Math.pow(rateOfInterest, (365 * 5));
        double sumTwo = principal * sumOne;

        System.out.println("The amount would be " + sumTwo);
    }
}
