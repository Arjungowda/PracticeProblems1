import java.util.HashSet;

/**
 * Created by mandy on 2/17/2016.
 */
public class linkedList {

    static class LinkedListNode {
        int data;
        LinkedListNode next;

        LinkedListNode(int v) {
            data = v;
            next = null;
        }
    }

    public static void main(String[] args) {
        LinkedListNode root = new LinkedListNode(1);
        root.next = new LinkedListNode(2);
        //root.next.next = new LinkedListNode(3);
        //root.next.next.next = new LinkedListNode(4);
        printLinkedList(root);
        LinkedListNode h = swapPairs(root);
        printLinkedList(h);
        /*LinkedListNode root2 = new LinkedListNode(4);
        root2.next = new LinkedListNode(0);
        root2.next.next = new LinkedListNode(4);
        root.next.next.next = new LinkedListNode(8);
        root.next.next.next.next = new LinkedListNode(9);
        root.next.next.next.next.next = new LinkedListNode(12);
        root.next.next.next.next.next.next = new LinkedListNode(3);
*/

        System.out.print("\n");
        //printLinkedList(root2);
        //System.out.print("\n");
        //removeDuplicates(root);
        //printLinkedList(root);
        //deleteNode(root.next);
        //System.out.print("\n");
        //printLinkedList(root);
        //System.out.print("\n");
        //LinkedListNode p = partition(root,6);
        //printLinkedList(root);

        //LinkedListNode r = numberSumLinkedList(root,root2);
        //printLinkedList(r);
    }

    public static LinkedListNode swapPairs(LinkedListNode head)
    {
        if(head == null)
            return null;
        if(head.next.next==null)
        {
            LinkedListNode curr = head.next;
            LinkedListNode prev = head;
            curr.next = prev;
            prev.next = null;
            return curr;
        }
        return head;
    }

    public static LinkedListNode numberSumLinkedList(LinkedListNode l1, LinkedListNode l2){
        int carry =0;

        LinkedListNode newHead = new LinkedListNode(0);
        LinkedListNode p1 = l1, p2 = l2, p3=newHead;

        while(p1 != null || p2 != null){
            if(p1 != null){
                carry += p1.data;
                p1 = p1.next;
            }

            if(p2 != null){
                carry += p2.data;
                p2 = p2.next;
            }

            p3.next = new LinkedListNode(carry%10);
            p3 = p3.next;
            carry /= 10;
        }

        if(carry==1)
            p3.next=new LinkedListNode(1);

        return newHead.next;

    }

    public static LinkedListNode partition(LinkedListNode root, int x){
        if(root == null || root.next == null)
            return null;
        LinkedListNode beforeSt = null;
        LinkedListNode beforeEnd = null;
        LinkedListNode aftetrSt = null;
        LinkedListNode afterEnd = null;
        LinkedListNode t = root;
        //partition
        while(t != null){
            if(t.data < x){
                if(beforeSt == null){
                    beforeSt = t;
                    beforeEnd = beforeSt;
                }
                else{
                    beforeEnd.next = t;
                    beforeEnd = t;
                }
            }
            else{
                if(aftetrSt == null){
                    aftetrSt = t;
                    afterEnd = aftetrSt;
                }
                else{
                    afterEnd.next = t;
                    afterEnd = t;
                }
            }
            t = t.next;
        }
        if(beforeSt == null)
            return aftetrSt;

        beforeEnd.next = aftetrSt;
        afterEnd.next = null;
        return beforeSt;
    }

    public static void deleteNode(LinkedListNode n){
        if(n == null || n.next == null)
            return;
        n.data = n.next.data;
        n.next = n.next.next;
    }

    public static void printLinkedList(LinkedListNode root){
        while(root != null){
            System.out.print(root.data);
            if(root.next!= null)
                System.out.print("->");
            root = root.next;
        }

    }
    public static LinkedListNode removeDuplicates(LinkedListNode root) {
        if (root == null) return root;
        HashSet<Integer> map = new HashSet<Integer>();
        LinkedListNode t = root;
        while (t.next != null) {
            if (map.contains(t.data))
                t.next = t.next.next;
            else
                map.add(t.next.data);
            t=t.next;
        }
        return root;
    }
}