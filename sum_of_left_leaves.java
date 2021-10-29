class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        return dfs(root.left, true) + dfs(root.right, false);
    }
    
    private int dfs(TreeNode root, boolean isLeft) {
        if(root == null) return 0;
        if(root.left == null && root.right == null && isLeft) return root.val;
        return dfs(root.left, true) + dfs(root.right, false);
    }
}
