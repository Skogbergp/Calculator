package org.calculator;

import java.util.Scanner;

import java.util.logging.Logger;

public class Calculator {
    public static void main(String[] args) {
        Logger logger =  Logger.getLogger(Calculator.class.getName());
        Scanner scan = new Scanner(System.in);
        logger.info("enter first number");
        double num1 = scan.nextInt();

        logger.info("enter second number");
        double num2 = scan.nextInt();
        double result = addValues(num1,num2);
       logger.info(()-> "result: " + result);

    }
    public static double addValues(double num1, double num2){
        return num1 + num2;
    }
    public static double subtractValues(double num1, double num2){
        return num1 - num2;
    }
    public static double multipleValues(double num1, double num2){
        return num1 * num2;
    }
    public static double divideValues(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1 / num2;
    }

}
