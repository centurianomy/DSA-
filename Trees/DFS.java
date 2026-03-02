import java.util.*;

class TreeNode { 
    int val; //field value of the node
    TreeNode left;
    TreeNode right;

    TreeNode(int val) { // this "val" field parameter
        this.val = val;
        this.left = null; //initially a node has no children so define left right by null
        this.right = null;
    }
}

public class DFS {

    public static void dfs(TreeNode root) {

        if (root == null)
            return;

        System.out.print(root.val + " ");  // visit node

        dfs(root.left);   // go left
        dfs(root.right);  // go right
    }

    public static void main(String[] args) {

        // Creating the tree
        TreeNode root = new TreeNode(1); // an object of TreeNode class with value 1, this is the root of the tree
        root.left = new TreeNode(2); //root is a reference variable that holds the address of the TreeNode object with value 1, we are creating a new TreeNode object with value 2 and assigning its address to root.left, this means that the left child of the root node is now the node with value 2
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("DFS Traversal (Preorder):");
        dfs(root);
    }
}