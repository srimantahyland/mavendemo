package com.srimanta.sample.abstractsample;

public class Main {
    public static void main(String[] args) {
        TouchScreenLaptop laptop = new DellNotebook();
        laptop.click();
        laptop = new HPNotebook();
        laptop.click();
    }
}
