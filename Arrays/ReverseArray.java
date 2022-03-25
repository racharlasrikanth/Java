import java.util.Scanner;

public class ReverseArray {

    public static int[] reverseArray(int[] comingArray) {
        for (int i=0, j=comingArray.length-1; i<=j; i++, j--) {
            int temp = comingArray[i];
            comingArray[i] = comingArray[j];
            comingArray[j] = temp;
        }
        return comingArray;
    }

    public static void printArray(int[] comingArray) {
        for (int eachItem : comingArray) {
            System.out.print(eachItem + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int sizeOfArray = scan.nextInt();

        int[] numbersArray = new int[sizeOfArray];
        System.out.println("Enter the array elements: ");
        for (int i=0; i<sizeOfArray; i++) {
            numbersArray[i] = scan.nextInt();
        }

        printArray(reverseArray(numbersArray));
    }
}