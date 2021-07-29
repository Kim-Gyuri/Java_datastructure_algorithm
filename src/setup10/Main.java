package setup10;

class LinkedList {
    Node header;
    static class Node{
        int data;
        Node next = null;
    }

    public LinkedList() {
        header = new Node();
    }

    void append(int d) {
        Node end = new Node();
        end.data =d;
        Node n = header;
        while(n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    void retrieve() {
        Node n = header.next;
        while(n.next != null) {
            System.out.print(n.data +"->");
            n = n.next;
        }
        System.out.println(n.data);
    }

    public Node get(int i) {
        Node n = header;
        for(int j=0; j<i; j++) {
            n = n.next;
        }
        return n;
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append(8);
        ll.append(5);
        ll.append(2);
        ll.append(7);
        ll.append(3);
        ll.append(4);
        ll.retrieve();

        LinkedList.Node n = Partition(ll.get(1), 5);
        while(n.next != null) {
            System.out.print(n.data +"->");
            n = n.next;
        }
        System.out.println(n.data);
    }

    private static LinkedList.Node Partition(LinkedList.Node n, int x) {
        LinkedList.Node s1 = null;
        LinkedList.Node e1 = null;
        LinkedList.Node s2 = null;
        LinkedList.Node e2 = null;

        while(n != null) {
            LinkedList.Node next = n.next;
            n.next = null;
            if(n.data < x) {
                if(s1 == null) {
                    s1 = n;
                    e1 = s1;
                } else {
                    e1.next= n;
                    e1 = n;
                }
            } else{
                if(s2 == null) {
                    s2 = n;
                    e2 = s2;
                } else{
                    e2.next = n;
                    e2 = n;
                }
            }
            n = next;
        }
        if(s1 == null) {
            return s2;
        }
        e1.next = s2;
        return s1;
    }
}
