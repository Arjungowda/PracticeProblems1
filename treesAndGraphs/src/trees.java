/**
 * Created by mandy on 2/18/2016.
 */
public class trees {
    static class treeNode{
        int data;
        treeNode left;
        treeNode right;
        treeNode(int v){
            data = v;
            left=right=null;
        }
    }

    static treeNode root;

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        trees t = new trees();
        root = t.sortedArraytoBinaryTree(arr, 0 ,arr.length-1);
        System.out.println("Preorder traversal is:");
        t.preOrder(root);
        boolean f = t.isBalanced(root);
        if(f)
            System.out.println("Balanced");
        else System.out.println("NOT Balanced");
    }

    public boolean isBalanced(treeNode root){
        if(root == null)
            return true;
        int heightDiff = getHeight(root.left) - getHeight(root.right);
        if(Math.abs(heightDiff) > 1)
            return false;
        else
            return isBalanced(root.left) && isBalanced(root.right);
    }

    public int getHeight(treeNode root){
        if(root == null) return 0;
        else return Math.max(getHeight(root.left),getHeight(root.right))+1;
    }

    public void preOrder(treeNode r){
        if(r == null)
            return;
        System.out.print(r.data);
        System.out.print(" ");
        preOrder(r.left);
        preOrder(r.right);
    }
    public treeNode sortedArraytoBinaryTree(int[] arr, int start, int end){
        if(start > end)
            return null;
        int mid = (start+end)/2;
        treeNode n = new treeNode(arr[mid]);
        n.left = sortedArraytoBinaryTree(arr,start,mid-1);
        n.right = sortedArraytoBinaryTree(arr,mid+1,end);
        return n;
    }
}
