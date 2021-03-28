package com.thewire.treemodel;

public interface Tree<T> {
    boolean isLeaf();
    T getValue();
}