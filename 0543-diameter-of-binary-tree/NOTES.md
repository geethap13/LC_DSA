Diameter of a binary tree is the longest path(maximum edges) between any two nodes.
​
For each node have to calculate diameter, **Diameter = height of left subtree + height of right subtree**. so to calculate diameter for each node, have to calculate height of left and right subtree and then will have global varible max to store the maximum diameter among all the nodes.
​
**Brute force:**
base case: if( root == null) return 0(diameter is 0 for leaf node and empty node)
Traverse from root till leaf recursively.
In each recursive function,
call the recursive function for left and right subtree.
calculate height of left and right subtree. current diameter = lh + rh
and store it in max by checking the max = Math.max(max, current diameter).
TC: O(n^2)--> calculating height for each node in recursive call
SC; O(n)-->height of the tree in skewed tree.
​
**Optimal approach:**
Instead of calculating height for each node.Recursively go till leaf and keep calculating the height of the left and right subtrees. Once we have the heights at the current
node, we can easily calculate both the diameter and height of the current node.
Start traversing the tree recursively and do work in Post Order.
In the Post Order of every node , calculate diameter and height of the current node.
If current diameter is maximum then update the variable used to store the maximum diameter.
Return height of current node to the previous recursive call.
TC: O(n)
SC :O(n)
​
**Another approach : create pair class**