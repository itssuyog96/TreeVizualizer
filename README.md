
# TreeVizualizer
Binary Tree &amp; NaryTree Visualiser

## Sample Output

### Binary Tree
Code
``` java
// init vizualizer
TreeVizualizer treeVizualizer = new TreeVizualizer();  
// create binary tree
BTree<Integer> tree = new BinaryTree<>(1);  
tree.setLeft(new BinaryTree(2, new BinaryTree(3, null, new BinaryTree(10)), new BinaryTree(4)));  
tree.setRight(new BinaryTree(5, new BinaryTree(8), null)); 
// call vizualize 
treeVizualizer.vizualize(tree);
```
Output

    ├─ 1
    │  ├─ 2
    │  │  ├─ 3
    │  │  │  └─ 10
    │  │  └─ 4
    │  ├─ 5
    │  │  └─ 8

### Binary Tree with Node direction
Code
``` java
//show node direction flag set to true
treeVizualizer.vizualize(tree, true); 
```
Output

    ├─ [N] 1
    │  ├─ [L] 2
    │  │  ├─ [L] 3
    │  │  │  └─ [R] 10
    │  │  └─ [R] 4
    │  ├─ [R] 5
    │  │  └─ [L] 8
    
### N-ary Tree
Code
``` java
// init vizualizer
TreeVizualizer treeVizualizer = new TreeVizualizer();  
// create a NaryTree
NTree<Integer> ntree = new NaryTree<>(0);  
ntree.addNodes(1, 2, 3, 4);  
ntree.getNodeList().get(0).addNodes(5, 6).getNodeList().get(0).addNodes(15, 16);  
ntree.getNodeList().get(1).addNodes(7, 8, 9);  
ntree.getNodeList().get(2).addNodes(10).getNodeList().get(0).addNodes(17, 18, 19);  
ntree.getNodeList().get(3).addNodes(11, 12, 13, 14); 
// call vizualize 
treeVizualizer.vizualize(ntree);
```
Output

    ├─ 0
    │  ├─ 1
    │  │  ├─ 5
    │  │  │  └─ 15
    │  │  │  └─ 16
    │  │  └─ 6
    │  ├─ 2
    │  │  └─ 7
    │  │  └─ 8
    │  │  └─ 9
    │  ├─ 3
    │  │  ├─ 10
    │  │  │  └─ 17
    │  │  │  └─ 18
    │  │  │  └─ 19
    │  ├─ 4
    │  │  └─ 11
    │  │  └─ 12
    │  │  └─ 13
    │  │  └─ 14

## Inspiration
[Baeldung: Print a Binary Tree Diagram](https://www.baeldung.com/java-print-binary-tree-diagram)
