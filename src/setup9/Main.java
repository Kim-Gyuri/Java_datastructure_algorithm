package setup9;

class LinkedList {
    Node header;
    static class Node {
        int data;
        Node next = null;
    }
    LinkedList() {
        header = new Node();
    }

    void append(int d) {
        Node end = new Node();
        end.data = d;
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
        LinkedList l1 = new LinkedList();
        l1.append(9);
        l1.append(1);
        l1.append(4);
        l1.retrieve();

        LinkedList l2 = new LinkedList();
        l2.append(6);
        l2.append(4);
        l2.append(3);
        l2.retrieve();

        LinkedList.Node n = sumLists(l1.get(1),l2.get(1), 0);
        while(n.next != null) {
            System.out.print(n.data +"->");
            n = n.next;
        }
        System.out.println(n.data);
    }


    private static LinkedList.Node sumLists(LinkedList.Node l1, LinkedList.Node l2, int carry)  {
        if(l1 == null || l2 == null && carry == 0) {
            return null;
        }
        LinkedList.Node result = new LinkedList.Node();
        int value = carry;

        if(l1 != null) {
            value += l1.data;
        }
        if(l2 != null) {
            value += l2.data;
        }
        result.data = value%10;

        if(l1 != null || l2 != null) {
            LinkedList.Node next = sumLists(l1 == null ? null : l1.next,
                    l2 == null ? null : l2.next,
                    value >= 10 ? 1 : 0);
            result.next = next;
        }
        return result;
    }
}