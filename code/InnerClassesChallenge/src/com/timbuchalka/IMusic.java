package com.timbuchalka;

public interface IMusic {

    void addSong(Song newSong);
    Song findSong(String title, String artist);
}
