class Node {
    int data;
    Node next;
    Node(int comingData) {
        this.data = comingData;
        this.next = null;
    }
}

public class LinkedListReverse {

    Node head = null;

    public static LinkedListReverse insertLast(LinkedListReverse list, int data) {
        
        Node newNode = new Node(data);
        
        if(list.head == null) {
            list.head = newNode;
            return list;
        }

        Node lastNode = list.head;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;

        return list;
    }

    public static void printLinkedList(LinkedListReverse list) {
        if(list.head == null) {
            System.out.println("Empty Linked List found!");
        }

        Node currentNode = list.head;
        while(currentNode.next != null) {
            System.out.print(currentNode.data + " => ");
            currentNode = currentNode.next;
        }
        System.out.print(currentNode.data + "\n");
    }

    public static LinkedListReverse reverseLinkedList(LinkedListReverse list) {
        if(list.head == null) {
            return list;
        }

        Node prev = null;
        Node curr = list.head;
        Node next = null;

        while(curr.next.next != null) {
            prev = curr;
            next = curr.next.next;
            curr = curr.next;
        }
        
        return list;
    }

    public static void main(String[] args) {
        LinkedListReverse list = new LinkedListReverse();

        // insertion at last
        list = list.insertLast(list, 7);
        list = list.insertLast(list, 77);
        list = list.insertLast(list, 777);
        list = list.insertLast(list, 7777);
        list = list.insertLast(list, 77777);
        list = list.insertLast(list, 777777);
        list = list.insertLast(list, 7777777);

        // printing the list
        printLinkedList(list);

        // reverse the linked list
        list = list.reverseLinkedList(list);

        // printing the list
        printLinkedList(list);
    }
}