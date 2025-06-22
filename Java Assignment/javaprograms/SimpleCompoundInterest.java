package com.javaprograms;

import java.util.Scanner;

public class SimpleCompoundInterest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values
        System.out.print("Enter Principal: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter Rate of Interest (%): ");
        double rate = scanner.nextDouble();
        System.out.print("Enter Time (years): ");
        double time = scanner.nextDouble();

        // Simple Interest formula
        double simpleInterest = (principal * rate * time) / 100;

        // Compound Interest formula
        double compoundInterest = principal * Math.pow((1 + rate / 100), time) - principal;

        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Compound Interest: " + compoundInterest);

        scanner.close();
    }
}
