package com.kritika.RuntimeDemo;

public class MacBookPro extends MacBook{
    @Override
    public void start() {
        System.out.println("Inside MacbookPro start");
    }

    @Override
    public void shutdown() {
        System.out.println("Inside MacBookPro shutdown");
    }

    public void prosMethod(){
        System.out.println("Inside ProsMethod");
    }
}
