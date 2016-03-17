import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by mandy on 2/18/2016.
 */
public class treeComplete {
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
    static public int[] arr = {10,8,12,3,6,13,14,5,4,-1,-1,9,-1,15,16};
    public static void main(String[] args){
        treeNode r = deSerialize(arr);
        levelOrderTraversal(r);
    }

    public static void levelOrderTraversal(treeNode r1){
        if(r1 == null) return;
        int h = getHeight(r1);
        for(int i=0; i<h; i++){
            printLevel(r1,i);
        }
    }

    public static void printLevel(treeNode r, int l){
        if(l == 1)
            System.out.println(r.data);
        else if(l>1){
            printLevel(r.left,l-1);
            printLevel(r.right,l-1);
        }
    }

    public static int getHeight(treeNode r){
        if(root == null) return 0;
        int lHeight = getHeight(r.left);
        int rHeight = getHeight(r.right);
        if(lHeight>rHeight) return lHeight +1;
        else return rHeight+1;
    }
  /*  //deserialize a tree given an array
    public static TreeNode constructTree(int[] a){
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(a[0]);
        int i = 1;
        q.offer(root);
        TreeNode temp;
        while(!q.isEmpty() && i < a.length){
            temp = q.poll();
            temp.left = (a[i] == -1)? null : new TreeNode(a[i]);
            i++;
            temp.right =(a[i] == -1)? null : new TreeNode(a[i]);
            i++;
            q.offer(temp.left);
            q.offer(temp.right);
        }
        return root;
    }
    //serialize
    public static ArrayList<Integer> serialize(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        TreeNode t;
        while(!q.isEmpty()){
            t = q.poll();
            list.add(( t != null)? t.data : -1);
            if(t!=null){
                q.offer(t.left);
                q.offer(t.right);
            }
        }
        return list;
    }*/
    public static treeNode deSerialize(int[] array){
        Queue<treeNode> q = new LinkedList<>();
        int i=0;
        treeNode root = new treeNode(array[i++]);
        q.offer(root);
        treeNode t;
        while(!q.isEmpty() && i < array.length){
            t = q.poll();
            t.left = (array[i] == -1)? null : new treeNode(array[i]);
            i++;
            t.right =(array[i] == -1)? null : new treeNode(array[i]);
            i++;
            q.offer(t.left);
            q.offer(t.right);
        }
        return (treeNode)q;
    }

}
