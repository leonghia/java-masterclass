package com.timbuchalka;

import java.util.ArrayList;
import java.util.List;

public class Album implements IMusic {

    private String name;
    private String artist;
    private SongList songList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songList = new SongList();
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public List<Song> getSongs() {
        return songList.getSongs();
    }

    @Override
    public void addSong(Song newSong) {
        songList.addSong(newSong);
    }

    @Override
    public Song findSong(String title, String artist) {
        return songList.findSong(title, artist);
    }

    private class SongList implements IMusic {
        private List<Song> songs;

        public SongList() {
            songs = new ArrayList<>(100);
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
            System.out.println("Add fail: " + newSong + " is already existed in this album");
        }

        @Override
        public Song findSong(String title, String artist) {
            for (Song song : songs) {
                if (song.getTitle().equalsIgnoreCase(title)) {
                    return song;
                }
            }
            return null;
        }

    }



    @Override
    public String toString() {
        return String.format("%s — %s", name, artist);
    }
}
