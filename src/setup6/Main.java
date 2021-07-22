package setup6;

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

    public Node KthToLast(Node n, int k, Reference r) {
        if(n == null) {
            return null;
        }
        Node found = KthToLast(n.next, k,r);
        r.count++;
        if(r.count == k) {
            return n;
        }
        return found;
    }
}

class Reference{
    public int count = 0;
}


public class Main{
    public static void main(String[] args) {
        Node head = new Node(1);
        head.append(2);
        head.append(3);
        head.append(4);
        head.retrieve();

        int k=1;
        Reference r = new Reference();
        Node found = head.KthToLast(head, k, r);
        System.out.println(found.data);
    }
}