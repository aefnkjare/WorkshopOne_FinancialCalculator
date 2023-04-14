package CalculatorProject;

public class FutureValueCalculator {
    public static void main(String[] args){

        double principal = 1000;
        double Interest = 0.0175;
        double years = 5;

        double rateOfInterest = 1 + Interest / 365;
        double sumOne = Math.pow(rateOfInterest, (365 * 5));
        double sumTwo = principal * sumOne;

        System.out.printf("The ending amount would be $%.2f" , sumTwo);
        System.out.printf(" You would receive $%.2f in interest." , (sumTwo - principal));
    }
}
