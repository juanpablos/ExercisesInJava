package com.cc3002.patterns.composite.filetree;

import java.util.Collections;

public abstract class Entry implements FSEntry {

    public void showTree() {
        showTree(0);
    }

    @Override
    public void showTree(int indentLevel) {
        String line = String.join("", Collections.nCopies(indentLevel, "| ")) + "|--";
        System.out.println(line + this);
    }
}
