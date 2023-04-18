package com.timbuchalka;

import java.util.ArrayList;
import java.util.List;

public class App {

    private List<Album> albums;
    private List<Playlist> playlists;

    public App() {
        albums = new ArrayList<>(500);
        playlists = new ArrayList<>(100);
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public void createAlbum(String name, String artist) {
        for (Album album : albums) {
            if (album.getName().equalsIgnoreCase(name) && album.getArtist().equalsIgnoreCase(artist)) {
                System.out.println("Create failed: Album is already existed");
                return;
            }
        }
        Album newAlbum = new Album(name, artist);
        albums.add(newAlbum);
        System.out.println("Created successfully: " + newAlbum);
    }

    public void createPlaylist(String name) {
        for (Playlist playlist : playlists) {
            if (playlist.getName().equalsIgnoreCase(name)) {
                System.out.println("Create failed: Playlist is already existed");
                return;
            }
        }
        Playlist newPlaylist = new Playlist(name);
        playlists.add(newPlaylist);
        System.out.println("Created successfully: " + newPlaylist);
    }

    public Album getAlbum(int i) {
        return albums.get(i);
    }

    public Playlist getPlaylist(int i) {
        return playlists.get(i);
    }
}
