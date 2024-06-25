class Solution {
    private int sum = 0;
    
    public TreeNode bstToGst(TreeNode root) {  
        if (root != null) {
            bstToGst(root.right);  // Traversing the right subtree
            sum += root.val;  // Updating the sum
            root.val = sum;  // Updating the current node's value
            bstToGst(root.left);  // Traversing the left subtree
        }
        return root;
    }
}