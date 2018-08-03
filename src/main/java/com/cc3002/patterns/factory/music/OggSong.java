package com.cc3002.patterns.factory.music;

public class OggSong extends AbstractSong {
    public OggSong(String name) {
        super(name);
    }

    @Override
    public String getFormat() {
        return "ogg";
    }
}
