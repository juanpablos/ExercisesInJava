package com.cc3002.patterns.factory.music;

public abstract class AbstractSong implements Song {
    private String name;

    public AbstractSong(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public abstract String getFormat();

    @Override
    public String toString() {
        return name;
    }
}
