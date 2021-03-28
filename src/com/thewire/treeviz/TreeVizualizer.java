package com.thewire.treeviz;

import com.thewire.treemodel.BTree;
import com.thewire.treemodel.NTree;
import com.thewire.treemodel.Tree;

import java.util.List;

public class TreeVizualizer {
    private StringBuilder treeString = new StringBuilder();
    private boolean showNodeDirection = false;
    private void traverse(Tree tree, String padding, Boolean isLeft)
    {
        if(tree == null)
        {
            return;
        }
        String symbol = tree.isLeaf() ? "└─ " : "├─ ";
        treeString.append(padding);
        treeString.append(symbol);
        if(showNodeDirection)
        {
            treeString.append("[");
            treeString.append(isLeft == null ? "N" : isLeft ? "L" : "R");
            treeString.append("] ");

        }
        treeString.append(tree.getValue());
        treeString.append("\n");
        padding += "│  ";
        if(tree instanceof BTree)
        {
            traverse(((BTree) tree).getLeft(), padding, true);
            traverse(((BTree) tree).getRight(), padding, false);
        }
        else if(tree instanceof NTree)
        {
            if(((NTree) tree).getNodeList() != null)
            {
                List<NTree> ntrees = ((NTree) tree).getNodeList();
                for(NTree ntree : ntrees)
                {
                    traverse(ntree, padding, null);
                }
            }
        }
    }

    public String vizualize(Tree tree)
    {
        return vizualize(tree, false);
    }

    public String vizualize(Tree tree, boolean showNodeDirection)
    {
        treeString = new StringBuilder();
        this.showNodeDirection = showNodeDirection && (tree instanceof BTree);
        traverse(tree, "", null);
        return treeString.toString();
    }
}