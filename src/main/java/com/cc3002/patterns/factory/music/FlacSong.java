package com.cc3002.patterns.factory.music;

public class FlacSong extends AbstractSong {
    public FlacSong(String name) {
        super(name);
    }

    @Override
    public String getFormat() {
        return "flac";
    }
}
