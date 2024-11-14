package org.example;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        SongServiceProxy songServiceProxy = new SongServiceProxy();
        System.out.println("Searching song's Id = 1");
        Song song = songServiceProxy.searchById(1);
        System.out.println("Song's title: "+ song.getTitle()+ ", " + "Song's album: "+ song.getAlbum()+"\n");

        System.out.println("Searching song's Id = 1");
        Song song2 = songServiceProxy.searchById(1);
        System.out.println("Song's title: "+ song2.getTitle()+ ", " + "Song's album: "+ song2.getAlbum()+"\n");



        System.out.println("Searching song's title = Hotel California");
        List<Song> byTitle = songServiceProxy.searchByTitle("Hotel California");
        for(Song s: byTitle){
            System.out.println("Song's title: "+ s.getTitle()+ ", " + "Song's album: "+ s.getAlbum()+"\n");
        }

        System.out.println("Searching song's album = Back in Black");
        List<Song> byAlbum = songServiceProxy.searchByAlbum("Back in Black");
        for(Song s: byAlbum){
            System.out.println("Song's title: "+ s.getTitle()+ ", " + "Song's album: "+ s.getAlbum()+"\n");
        }

        System.out.println("Searching song's album = Back in Black");
        List<Song> byAlbum2 = songServiceProxy.searchByAlbum("Back in Black");
        for(Song s: byAlbum2){
            System.out.println("Song's title: "+ s.getTitle()+ ", " + "Song's album: "+ s.getAlbum()+"\n");
        }
    }
}