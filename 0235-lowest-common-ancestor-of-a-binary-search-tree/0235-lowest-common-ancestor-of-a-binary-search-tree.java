class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (Math.min(p.val, q.val) > root.val) {
                root = root.right;
            } else if (Math.max(p.val, q.val) < root.val) {
                root = root.left;
            } else {
                return root;
            }
        }
        return null;        
    }
}