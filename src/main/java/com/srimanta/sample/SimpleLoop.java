package com.srimanta.sample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleLoop {
    public static void main(String[] args) {
        System.out.println("Simple loop. (non-number to exit).");


        try (Scanner scanner = new Scanner(System.in);) {
            while (true){
                try {
                    System.out.print("Enter a number (non-number to exit): ");
                    int input = scanner.nextInt();
                    for (int i=1; i<= input && i<=100; i++){
                        if (i%10 == 0){
                            continue;
                        } else {
                            System.out.println(i);
                        }
                    }
                } catch (InputMismatchException e) {
                    break;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

