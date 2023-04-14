package CalculatorProject;

public class FutureValueCalculator {
    public static void main(String[] args){

        double deposit = 1000;
        double intRate = 1.75;
        double years = 5;

        double para = 1 + (intRate / 365);
        double sumOne = Math.pow(para, (365 * 5));
        double sumTwo = deposit * sumOne;

        System.out.println("The amount would be " + sumTwo);
    }
}
