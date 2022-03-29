class Node {
    int data;
    Node next;
    Node (int data) {
        this.data = data;
        this.next = next;
    }
}

public class StackLinkedList {

    Node topFirst = null;

    public static StackLinkedList push(StackLinkedList stack, int data) {
        // create a node with coming data
        Node newNode = new Node(data);

        // check if this is the first node or not
        if (stack.topFirst == null) {
            stack.topFirst = newNode;
            return stack;
        }

        // if newNode is not a first node
        newNode.next = stack.topFirst;
        stack.topFirst = newNode;
        return stack;
    }

    public static StackLinkedList pop(StackLinkedList stack) {
        // check stack is empty or not
        if (isEmpty(stack)) {
            System.out.println("Stack is empty!!!");
            return stack;
        }

        Node firstNode = stack.topFirst;
        stack.topFirst = firstNode.next;
        firstNode = null;
        return stack;
    }

    public static boolean isEmpty(StackLinkedList stack) {
        if (stack.topFirst == null) {
            return true;
        }
        return false;
    }

    public static int top(StackLinkedList stack) {
        if (isEmpty(stack)) {
            System.out.println("Stack is Empty!");
            return -1;
        }

        return stack.topFirst.data;
    }

    public static StackLinkedList printStack(StackLinkedList stack) {
        // check stack is empty or not
        if (isEmpty(stack)) {
            System.out.println("Stack is empty!!!");
            return stack;
        }

        // if stack is not empty
        Node lastNode = stack.topFirst;
        while (lastNode.next != null) {
            System.out.print(lastNode.data + " => ");
            lastNode = lastNode.next;
        }
        System.out.println(lastNode.data);
        return stack;
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        // print stack
        printStack(stack);

        // pop item
        stack = stack.pop(stack);

        // insert item
        stack = stack.push(stack, 10);
        stack = stack.push(stack, 20);
        stack = stack.push(stack, 30);

        // get top of the element
        System.out.println("Top of stack is: " + stack.top(stack));

        // pop item
        stack = stack.pop(stack);
        stack = stack.pop(stack);

        // print stack
        printStack(stack);

        // get top of the element
        System.out.println("Top of stack is: " + stack.top(stack));
    }
}