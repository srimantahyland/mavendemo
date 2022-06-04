package com.srimanta.sample;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class StaticImportSample {
    public static void main(String[] args) {
        System.out.println("Simple square root. (invalid input to exit).");
        try (Scanner scanner = new Scanner(System.in);) {
            while (true){
                try {
                    System.out.print("Enter a number (invalid input to exit): ");
                    int input = scanner.nextInt();
                    System.out.println(sqrt(input));
                } catch (InputMismatchException e) {
                    break;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


