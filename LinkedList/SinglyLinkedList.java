class Node {
    int data;
    Node next;
    Node(int comingData) {
        this.data = comingData;
        this.next = null;
    }
}

public class SinglyLinkedList {
    Node head = null;
    
    public static SinglyLinkedList insertLast(SinglyLinkedList list, int data) {
        // first create new empty node
        Node newNode = new Node(data);

        // if it is first node in linkedlist
        if (list.head == null) {
            list.head = newNode;
            return list;
        }

        Node lastNode = list.head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;

        return list;
    }

    public static SinglyLinkedList insertFirst(SinglyLinkedList list, int data) {
        // first create new node
        Node newNode = new Node(data);

        // if it is first element
        if (list.head == null) {
            list.head = newNode;
            return list;
        }
        
        // if there are some elements in linkedlist
        newNode.next = list.head;
        list.head = newNode;
        
        return list;
    }

    public static SinglyLinkedList insertAt(SinglyLinkedList list, int data, int index) {
        // create empty node
        Node newNode = new Node(data);

        // if it is first node
        if (index == 0) {
            list = insertFirst(list, data);
            return list;
        }

        // if it is not first && If user give more index which is bigger than linkedlist then it will add last
        Node currentNode = list.head;
        for(int i=0; i<index-1 && currentNode.next != null; i++) {
            currentNode = currentNode.next;
        }

        newNode.next = currentNode.next;
        currentNode.next = newNode;
        
        return list;
    }

    public static void show(SinglyLinkedList list) {
        Node currentNode = list.head;
        if(list.head == null) {
            System.out.println("No linkedlist found!");
        }
        else {
            while (currentNode.next != null) {
                System.out.print(currentNode.data + " => ");
                currentNode = currentNode.next;
            }
            System.out.print(currentNode.data);
            System.out.println();   
        }
    }

    public static int length(SinglyLinkedList list) {
        int length = 0;

        if (list.head == null) {
            return length;
        }

        Node lastNode = list.head;
        while (lastNode != null) {
            lastNode = lastNode.next;
            length++;
        }

        return length;
    }
    
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // print list when nothing
        list.show(list);

        // length of linkedlist
        System.out.println("Linked list length: " + length(list));

        // insert last
        list = list.insertLast(list, 7);
        list = list.insertLast(list, 77);

        // insert first
        list = list.insertFirst(list, 10);
        list = list.insertFirst(list, 100);

        // insert at
        list = list.insertAt(list, 999, 0);
        list = list.insertAt(list, 99, 1);
        list = list.insertAt(list, 55, 5);
        list = list.insertAt(list, 1111, 7);
        list = list.insertAt(list, 7611, 10);

        // print list
        list.show(list);

        // length of linkedlist
        System.out.println("Linked list length: " + list.length(list));
    }
}