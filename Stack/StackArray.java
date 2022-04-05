import java.util.Arrays;

public class StackArray {

    static int topFirst = -1;

    public static int[] push(int[] stack, int data) {
        if (topFirst != stack.length) {
            stack[topFirst] = data;
            topFirst++;
        }
        return stack;
    }

    public static void main(String[] args) {
        int[] stack = new int[10];
        Arrays.fill(stack, Integer.MAX_VALUE);
        topFirst = 0;

        // insert push-last
        stack = stack.push(stack, 10);
        stack = stack.push(stack, 20);
        stack = stack.push(stack, 30);

        // print stack
        printStack(stack);
    }
}