package CalculatorProject;

public class FutureValueCalculator {
    public static void main(String[] args){

        double principal = 1000;
        double interestRate = 0.0175;
        double timeInYears = 5;

        double interestDividedByDays = 1 + interestRate / 365;
        double daysInTerm = Math.pow(interestDividedByDays, (365 * 5));
        double compoundInterest = principal * daysInTerm;

        System.out.printf("The ending amount would be $%.2f." , compoundInterest);
        System.out.printf(" You would receive $%.2f in interest." , (compoundInterest - principal));
    }
}
