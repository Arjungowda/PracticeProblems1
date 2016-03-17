/**
 * Created by mandy on 2/6/2016.
 */
//Implementing Stacks and Queues in linkedList
public class LinkedListProblems {

    class Node{
        int val;
        Node next;
        Node(int x){
            val = x;
            next = null;
        }
    }
    public static void reverse(Node root){
        if(root != null)
            return;
        reverse(root.next);
        System.out.print(root.val);
    }

//Stacks implementation
    class Stack{
        Node top;

        public Node pop(){
            if(top != null)
                return top;
            return null;
        }
        public void push(Node n){
            if(n != null){
                n.next = top;
                top = n;
            }
        }
    }
// Queues implementation
    class Queue{
        Node first, last;
        public void enqueue(Node n){
            if(first == null){
                first = n;
                last = first;
            }
            else{
                last.next = n;
                last = n;
            }
        }
        public Node dequeue(){
            if(first == null){
                return null;
            }
            else{
                Node t = new Node(first.val);
                first = first.next;
                return t;
            }
        }
    }
    public static void main(String[] args){

    }
}
