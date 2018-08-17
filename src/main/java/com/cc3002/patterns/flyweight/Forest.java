package com.cc3002.patterns.flyweight;

import com.cc3002.patterns.flyweight.trees.Tree;
import com.cc3002.patterns.flyweight.trees.TreeFactory;
import com.cc3002.patterns.flyweight.trees.TreeType;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

class Forest {
    private List<Tree> trees = new ArrayList<>();

    void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    void draw(GraphicsContext gc) {
        for (Tree tree : trees) {
            tree.draw(gc);
        }
    }

}
