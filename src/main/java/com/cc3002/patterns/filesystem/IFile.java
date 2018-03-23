package com.cc3002.patterns.filesystem;

public interface IFile {
    void mkdir(String name);

    void touch(String filename);

    IFile find(String name);

    void rmr(String name);

    void delete();
}
