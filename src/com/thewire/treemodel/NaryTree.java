package com.thewire.treemodel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NaryTree<T> implements NTree<T> {
    private T value;
    private List<NTree<T>> nodeList = null;

    public NaryTree() {
    }

    public NaryTree(T value) {
        this.value = value;
    }

    public NaryTree(T value, List<NTree<T>> nodeList) {
        this.value = value;
        this.nodeList = nodeList;
    }

    @Override
    public T getValue() {
        return value;
    }

    @Override
    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public List<NTree<T>> getNodeList() {
        return this.nodeList;
    }

    @Override
    public void setNodeList(List<NTree<T>> nodeList) {
        this.nodeList = nodeList;
    }

    @Override
    public NTree<T> addNode(T nodeValue){
        if(this.nodeList == null)
            this.nodeList = new ArrayList<>();
        this.nodeList.add(new NaryTree<>(nodeValue));
        return this;
    }

    @Override
    public NTree<T> addNodes(T...nodeValues){
        if(nodeValues.length == 0)
            return this;
        if(this.nodeList == null)
            this.nodeList = new ArrayList<>();
        Arrays.stream(nodeValues).forEach(this::addNode);
        return this;
    }

    @Override
    public boolean isLeaf()
    {
        return this.nodeList == null;
    }
}