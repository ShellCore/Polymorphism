package com.shellcore.java.polymorphism;

/**
 * Created by Cesar. 08/05/2017.
 */
public class Human {

    protected String name;

    public Human(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Name: " + name);
    }
}
