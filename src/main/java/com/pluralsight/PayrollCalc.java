package com.pluralsight;

import java.util.Scanner;

public class PayrollCalc {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("What is your name: ");
        String name = myScanner.nextLine();

        System.out.print("How many hours did you work?: ");

        double hours = myScanner.nextDouble();

        System.out.print("How much do you make? : ");

        double pay = myScanner.nextDouble();

        System.out.println(name);
        System.out.println(hours);
        System.out.println(pay);

        double paycheck = pay * hours;

        System.out.printf("I made $%.2f", paycheck);




    }

}
