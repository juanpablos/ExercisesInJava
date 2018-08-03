package com.cc3002.patterns.factory;

import com.cc3002.patterns.factory.music.FlacSong;
import com.cc3002.patterns.factory.music.Mp3Song;
import com.cc3002.patterns.factory.music.OggSong;

public class Main {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.addSongs(
                new Mp3Song("Feather - Nujabes"),
                new OggSong("feelings - Sky.High"),
                new FlacSong("Dreamin - Xori"));

        while (!player.emptyPlayList()) {
            player.playSong();
        }
    }
}
