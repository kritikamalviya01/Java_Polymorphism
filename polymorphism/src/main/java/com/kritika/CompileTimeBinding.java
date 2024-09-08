package com.kritika;

public class CompileTimeBinding {

    void add(int a, int b){
        System.out.println("Result is "+ (a+b));
    }

    void add(float a, float b){
        System.out.println("Result is "+(a+b));
    }

    void add(int a, int b, int c){
        System.out.println("Result is "+ (a+b+c));
    }

    public static void main(String[] args) {
        CompileTimeBinding compileTimeBinding = new CompileTimeBinding();
        compileTimeBinding.add(10, 20);
        compileTimeBinding.add(12.34f, 18.34f);
        compileTimeBinding.add(20, 40, 30);
    }
}
