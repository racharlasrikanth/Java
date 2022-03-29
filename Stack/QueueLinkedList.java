class Node {
    int data;
    Node next;
    Node (int data) {
        this.data = data;
        this.next = next;
    }
}

public class QueueLinkedList {

    Node first = null;
    Node last = null;

    public static boolean isEmpty(QueueLinkedList queue) {
        if (queue.first == null) {
            return true;
        }

        return false;
    }

    public static QueueLinkedList printQueue(QueueLinkedList queue) {
        if (isEmpty(queue)) {
            System.out.println("Queue is Empty!!!");
            return queue;
        }

        Node lastNode = queue.first;
        while (lastNode.next != null) {
            System.out.print(lastNode.data + " => ");
            lastNode = lastNode.next;
        }
        System.out.println(lastNode.data);
        return queue;
    }

    public static int front(QueueLinkedList queue) {
        if (isEmpty(queue)) {
            System.out.println("Sorry, Queue is emtpy!!!");
            return -1;
        }

        return queue.first.data;
    }

    public static QueueLinkedList enqueue(QueueLinkedList queue, int data) {
        // create a node with given data
        Node newNode = new Node(data);

        // check if this is the first node?
        if (isEmpty(queue)) {
            queue.first = newNode;
            queue.last = newNode;
            return queue;
        }

        // if it is not a first node
        Node lastNode = queue.first;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
        queue.last = newNode;
        return queue;
    }

    public static QueueLinkedList dequeue(QueueLinkedList queue) {
        if (isEmpty(queue)) {
            System.out.println("Sorry, Queue is emtpy!!!");
            return queue;
        }

        // check only one node present
        if (queue.first == queue.last) {
            queue.first = null;
            queue.last = null;
            return queue;
        }

        // if it is not empty then delete first node
        Node firstNode = queue.first;
        queue.first = firstNode.next;
        firstNode = null;
        return queue;
    }

    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();

        // print queue
        printQueue(queue);

        // insert enqueue
        queue = queue.enqueue(queue, 10);
        queue = queue.enqueue(queue, 20);
        queue = queue.enqueue(queue, 30);

        // print queue
        printQueue(queue);

        // delete enqueue
        queue = queue.dequeue(queue);
        queue = queue.dequeue(queue);

        // print front of the queue
        System.out.println("Front of the queue is: " + queue.front(queue));

        // print queue
        printQueue(queue);
    }
}