package com.shellcore.java.polymorphism;

/**
 * Created by Cesar. 08/05/2017.
 */
public interface Guitarist extends PlaySong {

    default void playFavoriteSong() {
        System.out.println("Playing my favorite song");
        playSong("My first song");
    }
}
