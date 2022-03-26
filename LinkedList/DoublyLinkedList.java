class Node {
    int data;
    Node previous;
    Node next;

    Node (int data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }
}

public class DoublyLinkedList {

    Node head = null;
    Node tail = null;

    public static DoublyLinkedList insertLast(DoublyLinkedList list, int data) {
        // first create empty node
        Node newNode = new Node(data);

        if (isEmpty(list)) {
            list.head = newNode;
            list.tail = newNode;

            return list;
        }

        list.tail.next = newNode;
        newNode.previous = list.tail;
        list.tail = newNode;

        return list;
    }

    public static DoublyLinkedList insertFirst(DoublyLinkedList list, int data) {
        // create emtpy node
        Node newNode = new Node(data);
        
        if (isEmpty(list)) {
            list.head = newNode;
            list.tail = newNode;
            return list;
        }

        newNode.next = list.head;
        list.head.previous = newNode;
        list.head = newNode;

        return list;
    }

    public static DoublyLinkedList insertAt(DoublyLinkedList list, int index, int data) {
        // create a node
        Node newNode = new Node(data);

        if (index == 0) {
            list = insertFirst(list, data);
            return list;
        }

        if (index == getLength(list)) {
            list = insertLast(list, data);
            return list;
        }

        Node currentNode = list.head;
        for (int i=0; i<index-1; i++) {
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        currentNode.next.previous = newNode;
        currentNode.next = newNode;
        newNode.previous = currentNode;

        return list;
    }

    public static DoublyLinkedList deleteByKey(DoublyLinkedList list, int data) {
        if (!containsData(list, data)) {
            System.out.println("Sorry, Element not found: " + data);
            return list;
        }

        //  if element is there, then delete from linkedlist
        Node currentNode = list.head;
        Node previousNode = null;
        while (currentNode != null && currentNode.data != data) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }

        // if head and tails points to same node, it means only one node is there for deleting
        if (list.head == list.tail) {
            list.head = null;
            list.tail = null;
            return list;
        }

        // if it is first node
        if (currentNode.data == list.head.data) {
            list.head = currentNode.next;
            currentNode = null;
            list.head.previous = null;
            return list;
        }

        // if it is last node
        if (currentNode.data == list.tail.data) {
            list.tail = currentNode.previous;
            currentNode = null;
            list.tail.next = null;
            return list;
        }

        previousNode.next = currentNode.next;
        currentNode.next.previous = previousNode;
        currentNode = null;
        return list;
    }

    public static boolean containsData(DoublyLinkedList list, int data) {
        if (list.head == null) {
            return false;
        }

        Node last = list.head;
        while (last != null) {
            if (last.data == data) {
                return true;
            }
            last = last.next;
        }

        return false;
    }

    public static DoublyLinkedList dispayFromStart(DoublyLinkedList list) {
        if (isEmpty(list)) {
            System.out.println("Sorrry, No linkedlist found!");
            return list;
        }

        System.out.print("Printing Doubly LinkedList from start: ");
        Node last = list.head;
        while (last.next != null) {
            System.out.print(last.data + " => ");
            last = last.next;
        }
        System.out.println(last.data);
        return list;
    }

    public static DoublyLinkedList displayFromEnd(DoublyLinkedList list) {
        if (isEmpty(list)) {
            System.out.println("Sorry, No linkedlist found!");
            return list;
        }

        System.out.print("Printing Doubly Linkedlist from End: ");
        Node untilFirst = list.tail;
        while (untilFirst.previous != null) {
            System.out.print(untilFirst.data + " => ");
            untilFirst = untilFirst.previous;
        }
        System.out.println(untilFirst.data);
        return list;
    }

    public static int getLength(DoublyLinkedList list) {
        int length = 0;
        if (list.head == null) {
            return length;
        }

        Node currentNode = list.head;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.next;
        }
        return length;
    }

    public static boolean isEmpty(DoublyLinkedList list) {
        if (list.head == null) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // insert node at last
        list = list.insertLast(list, 10);
        list = list.insertLast(list, 20);
        list = list.insertLast(list, 30);
        list = list.insertLast(list, 40);
        list = list.insertLast(list, 50);
        list = list.insertLast(list, 60);
        list = list.insertLast(list, 70);

        // print nodes from start
        dispayFromStart(list);

        // print nodes from end
        displayFromEnd(list);

        // print length of linkedlist
        System.out.println("Length of the Doubly Linkedlist is: " + getLength(list));

        // insert from first
        list = list.insertFirst(list, 999);
        list = list.insertFirst(list, 888);
        list = list.insertFirst(list, 777);

        // insert at
        list = list.insertAt(list, 1, 0);
        list = list.insertAt(list, 0, 10000);
        list = list.insertAt(list, 11, 10000);

        // print nodes from start
        dispayFromStart(list);

        // print nodes from end
        // displayFromEnd(list);

        // delete some nodes
        list = list.deleteByKey(list, 10000);
        list = list.deleteByKey(list, 70);
        list = list.deleteByKey(list, 777);
        list = list.deleteByKey(list, 0);
        list = list.deleteByKey(list, 10);
        list = list.deleteByKey(list, 999);
        list = list.deleteByKey(list, 20);
        list = list.deleteByKey(list, 30);
        list = list.deleteByKey(list, 40);
        list = list.deleteByKey(list, 50);
        list = list.deleteByKey(list, 10000);
        list = list.deleteByKey(list, 888);
        list = list.deleteByKey(list, 60);

        // print nodes from start
        dispayFromStart(list);
    }
}