package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static java.lang.Math.sqrt;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator() {
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        do {
            System.out.println("Calculator-MiniProject, Choose to perform operation");
            System.out.print("Press 1 to Square Root\nPress 2 to Factorial\nPress 3 to Logarithm\nPress 4 to Power\n"+
                    "Press 5 to exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }
//            try {
//
//
//            } catch (InputMismatchException error) {
//                System.out.println("Invalid input, Entered input is not a number");
//                return;
//            }
            switch (choice) {
                case 1:
                    // do square root
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Square Root result is : " + calculator.SQRT(number1));
                    break;
                case 2:
                    // do factorial
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Factorial result is : " + calculator.fact(number1));
                    break;
                case 3:
                    // do log
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Natural logarithm (base е) - ln(x) result is : " + calculator.log(number1));
                    break;
                case 4:
                    // do Power
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    number2 = scanner.nextDouble();
                    System.out.println("Power Function result is : " + calculator.power(number1, number2));
                    break;
                case 5:
                    System.out.println("Exiting....");
                    System.exit(0);
                    break;
                default: System.out.println("Wrong Choice Made");
            }
        } while (true);
    }


    public double SQRT(double number1) {
        logger.info("[SQ ROOT] - " + number1);
        System.out.println("Square Root of " + number1);
        double result = sqrt(number1);
        //System.out.println("RESULT = " + result);
        logger.info("[RESULT - SQ ROOT] - " + result);
        return result;
    }
    public double fact(double number1) {
        logger.info("[FACTORIAL] - " + number1);
        System.out.println("Factorial of " + number1);
        double result =1;
        for(double i=number1;i>1;i--){
            result=result*i;
        }
        //System.out.println("RESULT = " + result);
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }
    public double log(double number1) {
        logger.info("[NATURAL LOG] - " + number1);
        System.out.println("Natural logarithm (base е) - ln(x) of " + number1);
        double result=0;
        try {

            if (number1 <0 ) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            else {
                result = Math.log(number1);
            }
        } catch (ArithmeticException error) {
            System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());
        }
        //System.out.println("RESULT = " + result);
        logger.info("[RESULT - NATURAL LOG] - " + result);
        return result;
    }

    public double power(double number1, double number2) {
        logger.info("[POWER - " + number1 + " RAISED TO] " + number2);
        System.out.println("Power of " + number1 + ", " + number2);
        double result = Math.pow(number1,number2);
        //System.out.println("RESULT = " + result);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }
}