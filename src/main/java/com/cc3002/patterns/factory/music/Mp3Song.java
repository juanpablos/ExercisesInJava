package com.cc3002.patterns.factory.music;

public class Mp3Song extends AbstractSong {
    public Mp3Song(String name) {
        super(name);
    }

    @Override
    public String getFormat() {
        return "mp3";
    }
}
