import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class Main {

    public static void bfs(TreeNode root) {

        if (root == null)
            return;

        Queue<TreeNode> q = new LinkedList<>(); //LL is internally working as a queue, we can use it to implement BFS

        q.offer(root);  // Step 1: add root to queue

        while (!q.isEmpty()) {

            TreeNode current = q.poll();   // Step 2: remove front node
            System.out.print(current.val + " ");

            // Step 3: add children to queue
            if (current.left != null) // if left child exists, add it to the queue
                q.offer(current.left);

            if (current.right != null) // if right child exists, add it to the queue
                q.offer(current.right);
        }
    }

    public static void main(String[] args) {

        // Build tree
        TreeNode root = new TreeNode(1); // object of TreeNode class with value 1, this is the root of the tree
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("BFS Traversal (Level Order):");
        bfs(root);
    }
}