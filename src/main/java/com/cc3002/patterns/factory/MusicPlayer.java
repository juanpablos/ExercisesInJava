package com.cc3002.patterns.factory;

import com.cc3002.patterns.factory.codecs.Codec;
import com.cc3002.patterns.factory.codecs.FlacDecoder;
import com.cc3002.patterns.factory.codecs.Mp3Decoder;
import com.cc3002.patterns.factory.codecs.OggDecoder;
import com.cc3002.patterns.factory.music.Song;

import java.util.Arrays;
import java.util.LinkedList;

public class MusicPlayer {
    private LinkedList<Song> songs;

    public MusicPlayer() {
        songs = new LinkedList<>();
    }

    public void addSongs(Song... songs){
        this.songs.addAll(Arrays.asList(songs));
    }

    public void playSong() {
        Codec decoder;
        Song song = songs.pop();
        switch (song.getFormat()) {
            case "mp3":
                decoder = new Mp3Decoder(song);
                break;
            case "ogg":
                decoder = new OggDecoder(song);
                break;
            case "flac":
                decoder = new FlacDecoder(song);
                break;
            default:
                throw new RuntimeException("Format is not supported");
        }

        System.out.println("Now playing: " + decoder.getDecodedSong() + " with " + decoder);

    }

    public boolean emptyPlayList() {
        return songs.isEmpty();
    }
}
