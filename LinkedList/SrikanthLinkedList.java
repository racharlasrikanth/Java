class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SrikanthLinkedList {
    Node head = null;

    public static SrikanthLinkedList insertEnd(SrikanthLinkedList list, int data) {
        // create a data node
        Node newNode = new Node(data);

        // check this is the first node or not, if yes do something
        if (list.head == null) {
            list.head = newNode;
            return list;
        }

        // if newNode is not a first node then do some magic
        Node lastNode = list.head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
        return list;
    }

    public static SrikanthLinkedList printLinkedList(SrikanthLinkedList list) {
        if (list.head == null) {
            System.out.println("Sorry, No linkedlist found!");
            return list;
        }

        Node lastNode = list.head;
        while (lastNode.next != null) {
            System.out.print(lastNode.data + " => ");
            lastNode = lastNode.next;
        }
        System.out.println(lastNode.data);
        return list;
    }

    public static void main(String[] args) {
        SrikanthLinkedList list = new SrikanthLinkedList();
        
        // inserting at end
        list = list.insertEnd(list, 10);
        list = list.insertEnd(list, 20);
        list = list.insertEnd(list, 30);
        list = list.insertEnd(list, 40);
        list = list.insertEnd(list, 50);
        list = list.insertEnd(list, 60);
        list = list.insertEnd(list, 70);

        // print linkedlist
        printLinkedList(list);
    }
}