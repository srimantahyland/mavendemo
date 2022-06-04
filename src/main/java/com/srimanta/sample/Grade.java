package com.srimanta.sample;

public class Grade {
    public static void main(String[] args) {
        int maths = 60, physics = 20, chemistry = 100;
        if (maths < 35 || physics < 35 || chemistry < 35) {
            System.out.println("F");
        } else {
            double average = (maths + physics + chemistry) / 3;
            if (average <= 59)
                System.out.println("C");
            else if (average <= 69)
                System.out.println("B");
            else
                System.out.println("A");
        }
    }
}
