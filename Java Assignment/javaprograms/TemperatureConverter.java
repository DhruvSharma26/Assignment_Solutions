package com.javaprograms;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input temperature in Centigrade
        System.out.print("Enter temperature in Centigrade: ");
        double celsius = scanner.nextDouble();

        // Convert to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        scanner.close();
    }
}
