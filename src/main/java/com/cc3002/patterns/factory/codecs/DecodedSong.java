package com.cc3002.patterns.factory.codecs;

public class DecodedSong {
    private String name;

    public DecodedSong(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
