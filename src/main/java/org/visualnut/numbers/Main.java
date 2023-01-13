package org.visualnut.numbers;

import java.util.Scanner;

/**
 * @author Geraldo Barros
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Print numbers from 1 to N");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the value of N: ");
                    int maxNumber = scanner.nextInt();
                    printNumbers(maxNumber);
                    break;
                case 2:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }


    }

    private static void printNumbers(int maxNumber) {
        Numbers numbers = new Numbers(maxNumber);
        numbers.print();
    }
}