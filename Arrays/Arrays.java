import java.util.Scanner;

public class Arrays {

    public static int[] insertLast(int[] comingArray, int data) {
        int[] newArray = new int[comingArray.length + 1];
        for (int i=0; i<comingArray.length; i++) {
            newArray[i] = comingArray[i];
        }
        newArray[newArray.length - 1] = data;

        return newArray;
    }

    public static int[] insertFirst(int[] comingArray, int data) {
        int[] newArray = new int[comingArray.length + 1];
        newArray[0] = data;
        for (int i=1; i<=comingArray.length; i++) {
            newArray[i] = comingArray[i-1];
        }

        return newArray;
    }

    public static int[] deleteItem(int[] comingArray, int data) {

        if (searchInArray(comingArray, data) == -1) {
            System.out.println("Element not found!!!: " + data);
            return comingArray;
        }

        int[] newArray = new int[comingArray.length-1];
        boolean found = false;

        for (int i=0; i<comingArray.length; i++) {
            if (found == false && comingArray[i] == data) {
                found = true;
                System.out.println("Element found and deleted: " + data);
            } else {
                newArray[found == true ? i-1 : i] = comingArray[i];
            }
        }

        return newArray;
    }

    public static int searchInArray(int[] comingArray, int data) {
        int position = -1;
        for (int i=0; i<comingArray.length; i++) {
            if (comingArray[i] == data) {
                position = i;
                return position;
            }
        }

        return position;
    }

    public static void printArray(int[] comingArray) {
        for(int eachItem : comingArray) {
            System.out.print(eachItem + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Please enter the size of an Array: ");
        // int sizeOfArray = scan.nextInt();
        // int[] arr = new int[sizeOfArray];

        int[] arr = new int[0];

        // insertion at last in array
        arr = insertLast(arr, 10);
        arr = insertLast(arr, 20);
        arr = insertLast(arr, 30);
        arr = insertLast(arr, 40);

        // insert at first of a array
        arr = insertFirst(arr, 999);
        arr = insertFirst(arr, 888);
        arr = insertFirst(arr, 777);

        // print an array
        printArray(arr);

        // search element index in array
        System.out.println(10 + " is present at index : " + searchInArray(arr, 10));
        System.out.println(40 + " is present at index : " + searchInArray(arr, 40));
        System.out.println(777 + " is present at index : " + searchInArray(arr, 777));
        System.out.println(1000 + " is present at index : " + searchInArray(arr, 1000));

        // delete data
        arr = deleteItem(arr, 10);
        arr = deleteItem(arr, 40);
        arr = deleteItem(arr, 20);
        arr = deleteItem(arr, 30);
        arr = deleteItem(arr, 433450);

        // print data
        printArray(arr);
    }
}