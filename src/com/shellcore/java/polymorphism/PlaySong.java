package com.shellcore.java.polymorphism;

/**
 * Created by Cesar. 08/05/2017.
 */
public interface PlaySong {

    default void playSong(String songName) {
        System.out.println("Playing " + songName);
    }
}
