package com.shellcore.java.polymorphism;

/**
 * Created by Cesar. 08/05/2017.
 */
public class BandMember extends Human implements Vocalist, Guitarist {

    public BandMember(String name) {
        super(name);
    }

    @Override
    public void printName() {
        System.out.println("Band member: " + name);
    }

    @Override
    public void sing() {
        System.out.println("La la la");
    }
}
