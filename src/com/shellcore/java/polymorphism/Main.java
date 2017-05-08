package com.shellcore.java.polymorphism;

/**
 * Created by Cesar. 08/05/2017.
 */
public class Main {

    public static void main(String[] args) {
        Human john = new Human("John");
        Human louis = new BandMember("Louis");
        BandMember jack = new BandMember("Jack");

        john.printName();
        louis.printName();
        jack.printName();

        jack.sing();
        jack.playFavoriteSong();
    }
}
