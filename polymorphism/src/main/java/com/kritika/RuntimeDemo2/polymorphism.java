package com.kritika.RuntimeDemo2;

public class polymorphism {

    public static void main(String[] args) {
        Parent.doSomething();
        Child.doSomething();
        Parent p = new Parent();
        p.doThing();
        Child c = new Child();
        c.doThing();
        Parent p1 = new Child();
        p1.doThing();

        System.out.println(p.s);
        System.out.println(c.s);
        System.out.println();

        System.out.println(p1.s);
    }
}
