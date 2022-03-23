class Node {
    int data;
    Node next;
    Node (int comingData) {
        this.data = comingData;
        this.next = null;
    }
}

public class CircularSinglyLinkedList {
    Node head = null;
    
    public static CircularSinglyLinkedList insertLast(CircularSinglyLinkedList list, int data) {
        // create new Node
        Node newNode = new Node(data);

        // check head is null or not
        if (list.head == null) {
            list.head = newNode;
            newNode.next = list.head;
            return list;
        }

        Node lastNode = list.head;
        while (lastNode.next != list.head) {
            lastNode = lastNode.next;
        }
        newNode.next = list.head;
        lastNode.next = newNode;
        
        return list;
    }

    public static CircularSinglyLinkedList insertFirst(CircularSinglyLinkedList list, int data) {
        // create a new node
        Node newNode = new Node(data);
        
        // if this is the first element
        if (list.head == null) {
            list.head = newNode;
            newNode.next = list.head;
            return list;
        }

        Node lastNode = list.head;
        while (lastNode.next != list.head) {
            lastNode = lastNode.next;
        }
        Node firstNode = list.head;
        list.head = newNode;
        newNode.next = firstNode;
        lastNode.next = list.head;
        
        return list;
    }

    public static CircularSinglyLinkedList insertAt(CircularSinglyLinkedList list, int data, int index) {
        // create new node
        Node newNode = new Node(data);

        // check if that is first
        if (index == 0) {
            list = insertFirst(list, data);
            return list;
        }

        Node currentNode = list.head;
        for(int i=0; i<index-1; i++) {
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        
        return list;
    }

    public static void traverse(CircularSinglyLinkedList list) {
        if (list.head == null) {
            System.out.println("Sorry, No linkedlist found!");
        } else {
            Node lastNode = list.head;
            while (lastNode.next != list.head) {
                System.out.print(lastNode.data + " => ");
                lastNode = lastNode.next;
            }
            System.out.print(lastNode.data + "\n");
        }
    }
    
    public static void main(String[] args) {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();

        // insert last
        list = list.insertLast(list, 10);
        list = list.insertLast(list, 20);
        list = list.insertLast(list, 30);
        list = list.insertLast(list, 40);
        list = list.insertLast(list, 50);
        list = list.insertLast(list, 60);
        list = list.insertLast(list, 70);

        // insert first
        list = list.insertFirst(list, 999);
        list = list.insertFirst(list, 888);
        list = list.insertFirst(list, 777);

        // print linkedlsit
        list.traverse(list);

        // insert at given position
        list = list.insertAt(list, 1, 5);
        list = list.insertAt(list, 2, 5);
        list = list.insertAt(list, 3, 5);
        list = list.insertAt(list, 3, 12);
        list = list.insertAt(list, 3, 14);
        list = list.insertAt(list, 0, 0);

        // print linkedlsit
        list.traverse(list);
    }
}