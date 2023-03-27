Maximum depth/height  of a binary  tree is the num of nodes along the longest path from root to farthest leaf node.
​
Recursive DFS:
base case : if node == null return 0;
longest path will either be in left sub tree or right subtree from the root.
so will find Maximum path of left subtree and right subtree recursively and
add one for the root and return it.
​
TC:O(n)-> have to visit all the nodes
SC:O(n)->Auxiliary space
​