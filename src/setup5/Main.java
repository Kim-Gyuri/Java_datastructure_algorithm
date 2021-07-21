package setup5;

class Node {
    int data;
    Node next = null;
    Node(int d) {
        this.data = d;
    }

    void append(int d) {
        Node end = new Node(d);
        Node n = this;
        while(n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    void delete(int d) {
        Node n = this;
        while(n.next != null) {
            if(n.next.data ==d) {
                n.next = n.next.next;
            } else{
                n= n.next;
            }
        }
    }

    void retrieve() {
        Node n = this;
        while(n.next != null) {
            System.out.print(n.data +"->");
            n=n.next;
        }
        System.out.println(n.data);
    }

    public int KthToLast(Node n, int k) {
        if(n==null) {
            return 0;
        }
        int count = KthToLast(n.next, k) +1;
        if(count == k) {
            System.out.println(k +"th to last node is " +n.data);
        }
        return count;
    }
}


public class Main{
    public static void main(String[] args) {
        Node head = new Node(1);
        head.append(2);
        head.append(3);
        head.append(4);
        head.retrieve();

        int k=1;
        head.KthToLast(head, k);
    }
}