package com.thewire;

import com.thewire.treemodel.BinaryTree;
import com.thewire.treemodel.BTree;
import com.thewire.treemodel.NTree;
import com.thewire.treemodel.NaryTree;
import com.thewire.treeviz.TreeVizualizer;

public class Main {

    public static void main(String[] args) {

        TreeVizualizer treeVizualizer = new TreeVizualizer();

        //Runner for Binary Trees
        BTree<Integer> tree = new BinaryTree<>(1);
        tree.setLeft(new BinaryTree(2, new BinaryTree(3, null, new BinaryTree(10)), new BinaryTree(4)));
        tree.setRight(new BinaryTree(5, new BinaryTree(8), null));
        System.out.println(treeVizualizer.vizualize(tree));

        //Runner for Nary Trees
        NTree<Integer> ntree = new NaryTree<>(0);
        ntree.addNodes(1, 2, 3, 4);
        ntree.getNodeList().get(0).addNodes(5, 6).getNodeList().get(0).addNodes(15, 16);
        ntree.getNodeList().get(1).addNodes(7, 8, 9);
        ntree.getNodeList().get(2).addNodes(10).getNodeList().get(0).addNodes(17, 18, 19);
        ntree.getNodeList().get(3).addNodes(11, 12, 13, 14);
        System.out.println(treeVizualizer.vizualize(ntree));
    }
}