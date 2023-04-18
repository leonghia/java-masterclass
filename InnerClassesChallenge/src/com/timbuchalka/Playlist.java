package com.timbuchalka;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements IMusic {

    private String name;
    private List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        songs = new ArrayList<>(500);
    }

    public String getName() {
        return name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    @Override
    public void addSong(Song newSong) {
        if (findSong(newSong.getTitle(), newSong.getArtist()) == null) {
            songs.add(newSong);
            System.out.println("Added successfully: " + newSong);
            return;
        }
        System.out.println("Add failed: " + newSong + " is already existed in this playlist");
    }

    @Override
    public Song findSong(String title, String artist) {
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title) && song.getArtist().equalsIgnoreCase(artist)) {
                return song;
            }
        }
        return null;
    }

    public String toString() {
        return String.format("%s (%d songs)", name, songs.size());
    }
}
