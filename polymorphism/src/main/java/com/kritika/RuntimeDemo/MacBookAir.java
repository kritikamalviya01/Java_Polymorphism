package com.kritika.RuntimeDemo;

public class MacBookAir extends MacBook{
    @Override
    public void start() {
        System.out.println("Inside MakBooAir start");
    }

    @Override
    public void shutdown() {
        System.out.println("Inside MacbookAir shutdown");
    }
}
