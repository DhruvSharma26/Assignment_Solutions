package com.javaprograms;

import java.util.Scanner;

public class Marks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;

        // Loop to take marks of 5 subjects
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 1; i <= 5; i++) {
            totalMarks += scanner.nextInt();
        }

        // Calculate percentage
        double percentage = (double) totalMarks / 5;

        // Display result
        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Percentage = " + percentage + "%");

        scanner.close();
    }
}
