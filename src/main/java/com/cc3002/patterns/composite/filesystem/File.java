package com.cc3002.patterns.composite.filesystem;

public class File implements IFile {

    private String filename;

    public File(String filename) {
        this.filename = filename;
    }

    public void mkdir(String name) {
    }

    public void touch(String filename) {
    }

    public IFile find(String name) {
        if (name.equals(filename)) return this;
        return null;
    }

    public void rmr(String name) {
        if (name.equals(filename)) delete();
    }

    public void delete() {
        filename = null;
    }

}
