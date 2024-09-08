package com.kritika.RuntimeDemo;

public class Test {
    public static void main(String[] args) {
        MacBook M1 = new MacBookAir();
        M1.start();
        M1.shutdown();

        MacBook M2 = new MacBookPro();
        M2.start();
        M2.shutdown();

        MacBook M3 = new MacBook();
        M3.start();
        M3.shutdown();
    }
}
