package com.company;

import java.util.ArrayList;

public class Album {
    private String title;
    private SongList songList;


    public Album(String title) {
        this.title = title;
        songList = new SongList();
    }

    public void addSong(String songTitle, double songDuration){
        this.songList.addSong(songTitle, songDuration);
    }

    public Song findSong(String songTitle) {
        return this.songList.findSong(songTitle);
    }


    public String getTitle() {
        return title;
    }

    private class SongList {
        ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public void addSong(String songTitle, double songDuration) {
            if(findSong(songTitle) != null) {
                System.out.println("Such song is already on the album");
                return;
            }

            this.songs.add(new Song(songTitle,songDuration));
            System.out.println("Song " + songTitle + " was added to album " + getTitle());
            return;
        }

        public Song findSong(String songTitle) {
            if(!this.songs.isEmpty()) {
                for(Song s: this.songs) {
                    if(s.getTitle().equals(songTitle)){
                        return s;
                    }
                }
            }
            return null;
        }



    }



}
