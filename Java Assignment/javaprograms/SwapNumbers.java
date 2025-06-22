package com.javaprograms;

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        // Swapping using third variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: First number = " + a + ", Second number = " + b);

        scanner.close();
    }
}
