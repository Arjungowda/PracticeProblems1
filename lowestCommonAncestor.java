import sun.reflect.generics.tree.Tree;

import javax.swing.tree.TreeNode;

/**
 * Created by mandy on 2/5/2016.
 */
public class lowestCommonAncestor {
    static TreeNode root;
    public static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
    }
    public static void main(String[] args){
        //provide tree input

        lowestCommonAncestor tree = new lowestCommonAncestor();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        TreeNode f = lca(tree.root,tree.root.left.left,tree.root.right);
        System.out.print(f.val);

    }
    public static TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null || root==p || root==q) { return root; }
        TreeNode left = lca(root.left, p, q);
        TreeNode right = lca(root.right, p, q);
        if (left!=null && right!=null) { return root; }
        return left!=null ? left : right;
    }
}
