package com.thewire.treemodel;

import java.util.List;

public interface NTree<T> extends Tree<T> {
    T getValue();

    void setValue(T value);

    List<NTree<T>> getNodeList();

    void setNodeList(List<NTree<T>> nodeList);

    NTree<T> addNode(T nodeValue);

    NTree<T> addNodes(T...nodeValues);

    boolean isLeaf();
}