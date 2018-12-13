package com.company;

import java.util.*;

public class Main {

    private static List<Song> playList = new LinkedList<>();
    private static List<Album> albums = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Album album1 = new Album("album1");
        Album album2 = new Album("album2");
        Album album3 = new Album("album3");

        albums.add(album1);
        albums.add(album2);
        albums.add(album3);

        album1.addSong("song11",2.2);
        album1.addSong("song12",3.5);
        album2.addSong("song21",3.0);
        album2.addSong("song22",4.2);
        album3.addSong("song31",3.7);
        album3.addSong("song32",6.2);

        addSongToPlaylist("album1", "song12");
        addSongToPlaylist("album2", "song21");
        addSongToPlaylist("album3", "song32");
        addSongToPlaylist("album1", "song11");


        boolean quit = false;
        boolean skippingForward = true;
        ListIterator<Song> listIterator = playList.listIterator();

        if(listIterator.hasNext()){
            System.out.println("Now playing " + listIterator.next().getTitle());
            printMenu();
        } else {
            System.out.println("There are no songs on the playlist");
            return;
        }

        while(!quit) {
            System.out.print("Make you choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    System.out.println("Stop playing...");
                    quit = true;
                    break;
                case 1:
                    if(!skippingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        skippingForward = true;
                    }

                    if(listIterator.hasNext()){
                        System.out.println("66 Now playing " + listIterator.next().getTitle());
                    } else {
                        System.out.println("68 Reached the END of the playlist");
                        skippingForward = false;
                    }
                    break;
                case 2:

                    if(!skippingForward){
                        if(listIterator.hasNext()) {
                            System.out.println("76 Now playing " + listIterator.next().getTitle());
                            listIterator.previous();
                        } else {
                            System.out.println("79 Now playing " + listIterator.previous().getTitle());
                        }

                    } else {
                        if(listIterator.hasPrevious()) {
                            System.out.println("84 Now playing " + listIterator.previous().getTitle());
                            listIterator.next();
                        } else {
                            System.out.println("87 Now playing " + listIterator.next().getTitle());
                        }
                    }

                    break;
                case 3:
                    if(skippingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        skippingForward = false;
                    }

                    if(listIterator.hasPrevious()){
                        System.out.println("101 Now playing " + listIterator.previous().getTitle());
                    } else {
                        System.out.println("103 Reached the BEGINING of the playlist");
                        skippingForward = true;
                    }
                    break;
                case 4:
                    printMenu();
            }

        }
    }

    private static void printMenu () {
        System.out.println("0 - quit\n" +
                "1 - skip forward\n" +
                "2 - replay\n" +
                "3 - skip backwards\n" +
                "4 - print menu options");
    }


    private static Album findAlbum(String albumTitle) {
        for(int i = 0; i < albums.size(); i++) {
            if (albums.get(i).getTitle().equals(albumTitle)) {
                return albums.get(i);
            }
        }
        System.out.println("Album " + albumTitle + " doesn`t exist");
        return null;
    }

    private static boolean addSongToPlaylist(String albumTitle, String songTitle) {
        if(findAlbum(albumTitle) == null || findAlbum(albumTitle).findSong(songTitle) == null){
            System.out.println("There is no such album or song");
            return false;
        }
        playList.add(findAlbum(albumTitle).findSong(songTitle));
        System.out.println("Song " + songTitle + " added to playlist");

        return true;
    }
}
