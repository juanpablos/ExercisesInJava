package com.cc3002.patterns.filesystem;

import java.util.ArrayList;
import java.util.List;

public class Dir implements IFile {

    private List<IFile> content = new ArrayList<>();
    private String name;

    public Dir(String name) {
        this.name = name;
    }

    public void mkdir(String name) {
        content.add(new Dir(name));
    }

    public void touch(String filename) {
        content.add(new File(filename));
    }

    public IFile find(String name) {
        if (name.equals(this.name)) return this;
        for (IFile f : content) {
            IFile found = f.find(name);
            if (found != null) return found;
        }
        return null;
    }

    public void rmr(String name) {
        if (name.equals(this.name)) {
            delete();
        }
        IFile deadman = find(name);
        if (deadman != null) deadman.delete();
    }

    public void delete() {
        for (IFile f : content) {
            f.delete();
        }
        content = null;
    }

}
