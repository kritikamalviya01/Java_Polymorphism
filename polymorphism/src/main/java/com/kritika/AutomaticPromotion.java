package com.kritika;

public class AutomaticPromotion {

    public void print(int i){
        System.out.println("Integer Version " + i);
    }

    public void print(float f){
        System.out.println("Float Version "+ f);
    }

    public void print(String s){
        System.out.println("String version");
    }

    public void print(Object o){
        System.out.println("Object Version");
    }
    public static void main(String[] args) {
        AutomaticPromotion ap = new AutomaticPromotion();
        ap.print("Hello");
        ap.print(1234);
        ap.print(123.23);
    }
}
