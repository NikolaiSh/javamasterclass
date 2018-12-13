package com.company;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String title;
    private List<Song> songs;

    public Album(String title) {
        this.title = title;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String songTitle, double songDuration) {
        if(findSong(songTitle) != null) {
            System.out.println("Such song is already on the album");
            return false;
        }

        this.songs.add(new Song(songTitle,songDuration));
        System.out.println("Song " + songTitle + " was added to album " + this.getTitle());
        return true;
    }

    public Song findSong(String songTitle) {
        for(int i = 0; i < this.songs.size(); i++) {
            if(this.songs.get(i).getTitle().equals(songTitle)){
                return this.songs.get(i);
            }
        }

        return null;
    }




    public String getTitle() {
        return title;
    }

}
