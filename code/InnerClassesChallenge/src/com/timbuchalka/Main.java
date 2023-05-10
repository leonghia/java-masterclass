package com.timbuchalka;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static App spotify = new App();

    public static void main(String[] args) {

        boolean isExit = false;

        while (!isExit) {
            System.out.println();
            System.out.println("""
                    ========== Welcome to Spotify ==========
                    1. Create a new album
                    2. Create a new playlist
                    3. View all albums
                    4. View all playlists
                    5. Exit""");
            System.out.print("Please enter your select (1 – 5): ");
            String selection = scanner.nextLine();
            switch (selection) {
                case "1" -> {
                    createNewAlbum();
                }
                case "2" -> {
                    createNewPlaylist();
                }
                case "3" -> {
                    viewAllAlbums();
                }
                case "4" -> {
                    viewAllPlaylists();
                }
                case "5" -> {
                    isExit = true;
                }
            }
        }

    }

    private static void createNewAlbum() {
        System.out.println();
        System.out.println("–".repeat(10) + " Create a new Album " + "–".repeat(10));
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter artist: ");
        String artist = scanner.nextLine();
        spotify.createAlbum(name, artist);
    }

    private static void createNewPlaylist() {
        System.out.println();
        System.out.println("–".repeat(10) + " Create a new Playlist " + "–".repeat(10));
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        spotify.createPlaylist(name);
    }

    private static void viewAllAlbums() {
        boolean isBack = false;
        while (!isBack) {
            System.out.println();
            System.out.println("–".repeat(10) + " View all albums " + "–".repeat(10));
            List<Album> albumList = spotify.getAlbums();
            int i = 0;
            for (Album album : albumList) {
                System.out.printf("%d. %s\n", ++i, album);
            }
            System.out.println("–".repeat(30));
            System.out.println("""
                (V)iew an album
                (D)elete an album
                (B)ack""");
            System.out.print("Please enter your selection: ");
            String selection = scanner.nextLine();
            switch (selection.toUpperCase()) {
                case "V" -> {
                    System.out.print("Enter the numerical order of the album to view: ");
                    int number = Integer.parseInt(scanner.nextLine());
                    viewAnAlbum(number);
                }
                case "D" -> {
                    deleteAnAlbum();
                }
                case "B" -> {
                    isBack = true;
                }
            }
        }
    }

    private static void viewAnAlbum(int number) {
        Album album = spotify.getAlbum(--number);
        boolean isBack = false;
        while (!isBack) {
            System.out.println();
            System.out.printf("–".repeat(10) + " Album: %s " + "–".repeat(10), album);
            System.out.println();
            List<Song> songs = album.getSongs();
            int i = 0;
            for (Song song : songs) {
                System.out.printf("%d. %s\n", ++i, song);
            }
            System.out.println("–".repeat(30));
            System.out.println("""
                (L)isten to a song
                (A)dd a new song
                (R)emove a song
                (B)ack""");
            System.out.print("Please enter your selection: ");
            String selection = scanner.nextLine();
            switch (selection.toUpperCase()) {
                case "L" -> {
                    playSong(songs);
                }
                case "A" -> {
                    System.out.println("Add new song to album" + ".".repeat(10));
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter duration: ");
                    double duration = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter artist (separate by commas): ");
                    String artistInput = scanner.nextLine();
                    String artist;
                    if (artistInput.isEmpty()) {
                        artist = album.getArtist();
                    } else {
                        artist = album.getArtist() + " ft. " + artistInput;
                    }
                    album.addSong(new Song(title, artist, duration));
                }
                case "R" -> {
                    System.out.print("Enter the numerical order of the song to remove: ");
                    int songNumber = Integer.parseInt(scanner.nextLine());
                    Song song = songs.get(--songNumber);
                    System.out.println("Removed successfully: " + song);
                    songs.remove(songNumber);
                }
                case "B" -> {
                    isBack = true;
                }
            }
        }
    }

    private static void deleteAnAlbum() {
        System.out.print("Enter the numerical order of the album to delete: ");
        int number = Integer.parseInt(scanner.nextLine());
        Album album = spotify.getAlbum(--number);
        System.out.println("Deleted successfully: " + album);
        spotify.getAlbums().remove(number);
    }

    private static void viewAllPlaylists() {
        List<Playlist> playlists = spotify.getPlaylists();
        boolean isBack = false;
        while (!isBack) {
            System.out.println();
            System.out.println("–".repeat(10) + " View all playlists " + "–".repeat(10));
            int i = 0;
            for (Playlist playlist : playlists) {
                System.out.printf("%d. %s\n", ++i, playlist);
            }
            System.out.println("–".repeat(30));
            System.out.println("""
                (V)iew a playlist
                (D)elete a playlist
                (B)ack""");
            System.out.print("Please enter your selection: ");
            String selection = scanner.nextLine();
            switch (selection.toUpperCase()) {
                case "V" -> {
                    System.out.print("Enter the numerical order of the playlist to view: ");
                    int number = Integer.parseInt(scanner.nextLine());
                    viewAPlaylist(number);
                }
                case "D" -> {
                    deleteAPlaylist();
                }
                case "B" -> {
                    isBack = true;
                }
            }
        }
    }

    private static void viewAPlaylist(int number) {
        Playlist playlist = spotify.getPlaylist(--number);
        boolean isBack = false;
        while (!isBack) {
            System.out.println();
            System.out.printf("–".repeat(10) + " Playlist: %s " + "–".repeat(10), playlist);
            System.out.println();
            List<Song> songs = playlist.getSongs();
            int i = 0;
            for (Song song : songs) {
                System.out.printf("%d. %s\n", ++i, song);
            }
            System.out.println("–".repeat(30));
            System.out.println("""
                (L)isten to a song
                (A)dd a new song
                (R)emove a song
                (B)ack""");
            System.out.print("Please enter your selection: ");
            String selection = scanner.nextLine();
            switch (selection.toUpperCase()) {
                case "L" -> {
                    playSong(songs);
                }
                case "A" -> {
                    System.out.println("Add new song to playlist" + ".".repeat(10));
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter artist: ");
                    String artist = scanner.nextLine();
                    // Check whether this song is on any album
                    boolean isSongOwned = false;
                    List<Album> albums = spotify.getAlbums();
                    for (Album album : albums) {
                        if (album.findSong(title, artist) == null) {
                            System.out.println("Add failed: You do not own this song");
                        } else {
                            Song newSong = album.findSong(title, artist);
                            playlist.addSong(newSong);
                        }
                    }
                }
                case "R" -> {
                    System.out.print("Enter the numerical order of the song to remove: ");
                    int songNumber = Integer.parseInt(scanner.nextLine());
                    Song song = songs.get(--songNumber);
                    System.out.println("Removed successfully: " + song);
                    songs.remove(songNumber);
                }
                case "B" -> {
                    isBack = true;
                }
            }
        }
    }

    private static void deleteAPlaylist() {
        System.out.print("Enter the numerical order of the playlist to delete: ");
        int number = Integer.parseInt(scanner.nextLine());
        Playlist playlist = spotify.getPlaylist(--number);
        System.out.println("Deleted successfully: " + playlist);
        spotify.getPlaylists().remove(number);
    }

    private static void playSong(List<Song> songs) {
        System.out.print("Enter the numerical order of the song to listen: ");
        int songNumber = Integer.parseInt(scanner.nextLine());
        Song song = songs.get(--songNumber);
        var listIterator = songs.listIterator(songNumber);
        boolean isQuit = false;
        boolean isSkipForwardYet = false;
        while (!isQuit) {
            System.out.println();
            System.out.println("Currently playing: " + song);
            System.out.print("Enter \"F\" to skip forward, \"B\" to skip backward, or \"Q\" to quit: ");
            String selection = scanner.nextLine();
            switch (selection.toUpperCase()) {
                case "F" -> {
                    if (listIterator.nextIndex() == songs.size() - 1) {
                        song = listIterator.next();
                    }
                    if (!listIterator.hasNext()) {
                        System.out.println("You've reached the last song");
                    }
                    if (listIterator.hasNext() && !isSkipForwardYet) {
                        listIterator.next();
                        song = listIterator.next();
                    }
                    if (listIterator.hasNext() && isSkipForwardYet) {
                        song = listIterator.next();
                    }
                    isSkipForwardYet = true;
                }
                case "B" -> {
                    if (listIterator.previousIndex() == 0) {
                        song = listIterator.previous();
                    }
                    if (!listIterator.hasPrevious()) {
                        System.out.println("You've reached the first song");
                    }
                    if (listIterator.hasPrevious() && !isSkipForwardYet) {
                        song = listIterator.previous();
                    }
                    if (listIterator.hasPrevious() && isSkipForwardYet) {
                        listIterator.previous();
                        song = listIterator.previous();
                    }
                    isSkipForwardYet = false;
                }
                case "Q" -> {
                    isQuit = true;
                }
            }
        }

    }

}
