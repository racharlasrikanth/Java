class Node {
    int data;
    Node next;
    Node(int comingData) {
        this.data = comingData;
        this.next = null;
    }
}

public class LinkedList {
    Node head = null;

    public static LinkedList insertLast(LinkedList list, int data) {
        Node newNode = new Node(data);

        if(list.head == null) {
            list.head = newNode;
        }else{
            Node lastNode = list.head;
            while(lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }

        return list;
    }

    public static LinkedList insertFirst(LinkedList list, int data) {
        Node newNode = new Node(data);

        if(list.head == null) {
            list.head = newNode;
        } else {
            newNode.next = list.head;
            list.head = newNode;
        }

        return list;
    }

    public static LinkedList insertAt(LinkedList list, int data, int position) {
        Node newNode = new Node(data);
        int count = 1;

        if(list.head == null) {
            list.head = newNode;
        } else {
            Node lastNode = list.head;
            while(lastNode.next != null) {
                if(count == position) {
                    Node temp = lastNode.next;
                    lastNode.next = newNode;
                    newNode.next = temp;
                }
                lastNode = lastNode.next;
                count++;
            }
        }
        
        return list;
    }

    public static void printLinkedList(LinkedList list) {
        Node lastNode = list.head;
        while(lastNode.next != null) {
            System.out.print(lastNode.data + " => ");
            lastNode = lastNode.next;
        }
        System.out.print(lastNode.data + "\n");
    }

    public static LinkedList deleteLast(LinkedList list) {

        if(list.head == null) {
            return list;
        }

        Node lastNode = list.head;
        while(lastNode.next.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = null;

        return list;
    }

    public static LinkedList deleteFirst(LinkedList list) {
        if(list.head == null) {
            return list;
        }

        Node firstNode = list.head;
        list.head = firstNode.next;
        firstNode.next = null;
        
        return list;
    }

    public static LinkedList deleteAt(LinkedList list, int position) {
        int count = 1;
        if(list.head == null) {
            return list;
        }

        Node prev = null;
        Node currentNode = list.head;

        while(currentNode.next != null) {
            if(position == 1) {
                return deleteFirst(list);
            }
            if(count == position) {
                prev.next = currentNode.next;
                return list;
            }
            prev = currentNode;
            currentNode = currentNode.next;
            count++;
        }
        if(count == position) {
            return deleteLast(list);
        }
        
        return list;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // insertion at last
        list = list.insertLast(list, 7);
        list = list.insertLast(list, 10);
        list = list.insertLast(list, 17);
        list = list.insertLast(list, 60);
        list = list.insertLast(list, 70);
        list = list.insertLast(list, 17);
        list = list.insertLast(list, 7);

        // insertion at first
        list = list.insertFirst(list, 10000);
        list = list.insertFirst(list, 20000);
        list = list.insertFirst(list, 70000);

        // insert at given position
        list = list.insertAt(list, 77777, 3);
        list = list.insertAt(list, 88888, 7);

        // print list
        printLinkedList(list);

        // delete last node
        // list = list.deleteLast(list);
        // list = list.deleteLast(list);
        // list = list.deleteLast(list);
        // list = list.deleteLast(list);

        // delete first node
        // list = list.deleteFirst(list);
        // list = list.deleteFirst(list);
        // list = list.deleteFirst(list);

        // delete at given position
        // list = list.deleteAt(list, 1);
        list = list.deleteAt(list, 12);

        // print list
        printLinkedList(list);
    }
}