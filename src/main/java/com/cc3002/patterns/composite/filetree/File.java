package com.cc3002.patterns.composite.filetree;

public class File extends Entry {
    private String name;
    private long size;

    public File(String name, long size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return name + " (" + size + " bytes)";
    }
}
