package com.thewire.Treemodel;

import com.thewire.treemodel.BTree;
import com.thewire.treemodel.Tree;

import java.util.Arrays;
import java.util.List;

public class BinaryTree<T> implements BTree<T> {
    private T value;
    private BTree<T> left = null;
    private BTree<T> right = null;

    public BinaryTree() {
        this.value = null;
    }

    public BinaryTree(T value, BinaryTree left, BinaryTree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public BinaryTree(T value) {
        this.value = value;
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
    public BTree getLeft() {
        return left;
    }

    @Override
    public void setLeft(BTree left) {
        this.left = left;
    }

    @Override
    public BTree getRight() {
        return right;
    }

    @Override
    public void setRight(BTree right) {
        this.right = right;
    }

    @Override
    public boolean isLeaf()
    {
        return right == null && left == null;
    }
}