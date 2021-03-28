package com.thewire.treemodel;

import java.util.List;

public interface Tree<T> {
    boolean isLeaf();
    T getValue();
}