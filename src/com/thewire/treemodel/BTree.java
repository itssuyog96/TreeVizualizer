package com.thewire.treemodel;

public interface BTree<T> extends Tree<T> {
    T getValue();

    void setValue(T value);

    BTree getLeft();

    void setLeft(BTree left);

    BTree getRight();

    void setRight(BTree right);

    boolean isLeaf();
}