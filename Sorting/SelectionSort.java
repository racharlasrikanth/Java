import java.util.Scanner;

public class SelectionSort {

    public static int[] selectionSortArray(int[] comingArray) {
        for (int i=0; i<comingArray.length; i++) {
            
        }
    }

    public static void printArray(int[] comingArray) {
        System.out.println("The Selection Sorted Array: ");
        for (int eachItem : comingArray) {
            System.out.print(eachItem + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int sizeOfArray = scan.nextInt();

        int[] numsArray = new int[sizeOfArray];
        System.out.println("Please enter the elements in array");
        for (int i=0; i<sizeOfArray; i++) {
            numsArray[i] = scan.nextInt();
        }

        printArray(selectionSortArray(numsArray));
    }
}