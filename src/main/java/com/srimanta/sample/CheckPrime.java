package com.srimanta.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println("Prime Number Checker. Type exit to quit.");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            String inputStr = "";
            while (true){
                System.out.print("Enter a number: ");
                inputStr = br.readLine();
                if (inputStr.equals("exit")){
                    break;
                }
                try {
                    int input = Integer.parseInt(inputStr);
                    if (isPrime(input)){
                        System.out.println(input + " is prime.");
                    } else {
                        System.out.println(input + " is not prime.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Enter exit to quit.");
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean isPrime(int input) {
        boolean primeFlag = true;
        if (input == 1){
            primeFlag = false;
        }
        for (int i =2; i<input; i++){
            if(input%i == 0)
                primeFlag = false;
        }
        return primeFlag;
    }
}
