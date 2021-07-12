package setup4;

class Node {
    int data;
    Node next = null;
    Node (int d) {
        this.data =d;
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
            if(n.next.data == d) {
                n.next = n.next.next;
            } else{
                n = n.next;
            }
        }
    }

    void retrieve() {
        Node n = this;
        while(n.next != null) {
            System.out.print(n.data +"->");
            n = n.next;
        }
        System.out.println(n.data);
    }

    public Node KthToLast(Node first, int k) {
        Node n = first;
        int total = 1;
        while(n.next != null) {
            total++;
            n = n.next;
        }
        n =first;
        for(int i=1; i<total-k+1; i++) {
            n = n.next;
        }
        return n;
    }

}

public class Main {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.append(2);
        head.append(3);
        head.append(4);
        head.retrieve();

        int k =2;
        Node Kth = head.KthToLast(head, k);
        System.out.println("Last k(" + k +")th data is " + Kth.data);

    }
}