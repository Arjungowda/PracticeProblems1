/**
 * Created by mandy on 2/23/2016.
 */
public class removeDuplicatedinLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);
        ListNode newHead = deleteDuplicates(head);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode prevPrev = new ListNode(0);
        ListNode prev = new ListNode(0);
        ListNode curr = head.next;

        if (head.val == head.next.val) {
            head = head.next.next;
            prev = head.next;
            curr = head;
        } else {
            prev = head;
            prevPrev.next = prev;
            curr = head.next;
        }

        while (curr != null) {
            if (curr.val == prev.val) {
                prevPrev.next = curr.next.next;
                curr = curr.next.next;
                prev = curr.next;
                /*
                prevPrev.next = curr.next;
                prev = curr.next;
                curr = curr.next.next;*/

            } else {
                prevPrev = prev;
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}