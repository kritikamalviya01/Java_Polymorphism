package com.kritika.RuntimeDemo;

public class Test {
    public static void main(String[] args) {
        AppleLaptop M1 = new MacBookAir();
        M1.start();
        M1.shutdown();

        AppleLaptop M2 = new MacBookPro();
        M2.start();
        M2.shutdown();

        //Outcasting
        MacBookPro macBookPro = (MacBookPro) M2;
        // Not able to access from M2 because the parent is AppleLaptop
        // down cast to MackbookPro and able to access ProsMethod
        macBookPro.prosMethod();


        AppleLaptop M3 = new MacBook();
        M3.start();
        M3.shutdown();
    }
}
