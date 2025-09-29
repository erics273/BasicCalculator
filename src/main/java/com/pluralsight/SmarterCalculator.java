package com.pluralsight;

import java.util.Scanner;

public class SmarterCalculator {
    public static void main(String[] args) {

        //creating our scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        //what do you want to do
        System.out.print("What do you want to do (add, subtract) ? ");
        //capture the answer to the question above
        //add or subtract
        String command = scanner.nextLine();

        //depending on the command do the thing (add/subtract
        if (command.equals("add")) {
            //call the doAdd method
            doAdd(scanner);
        } else if (command.equals("subtract")) {
            //call the doSubtract method
            doSubtract(scanner);
        } else {
            System.out.printf(
                    "%s -- Invalid command!", command);
        }
    }

    public static void doAdd(Scanner scanner) {
        System.out.print("Enter 1st number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter 2nd number: ");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        System.out.printf("%f + %f = %f", num1, num2, sum);
    }

    public static void doSubtract(Scanner scanner) {
        System.out.print("Enter 1st number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter 2nd number: ");
        double num2 = scanner.nextDouble();
        double difference = num1 - num2;
        System.out.printf(
                "%f + %f = %f", num1, num2, difference);
    }
}

