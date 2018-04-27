package com.cc3002.patterns.composite.filetree;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Entry {
    private String name;
    private List<FSEntry> contents;

    public Folder(String name) {
        this.name = name;
        this.contents = new ArrayList<>();
    }

    public void add(FSEntry... entries) {
        for (FSEntry entry : entries) {
            contents.add(entry);
        }
        // contents.addAll(Arrays.asList(entries));
    }

    @Override
    public String toString() {
        return name + " (Folder)";
    }

    @Override
    public void showTree(int indentLevels) {
        super.showTree(indentLevels);
        for (FSEntry entry : contents) {
            entry.showTree(indentLevels + 1);
        }
    }
}
