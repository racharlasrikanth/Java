import java.util.Scanner;

public class BubbleSort {

    public static int[] sortArray(int[] comingArray) {
        for (int i=0; i<comingArray.length-1; i++) {
            for (int j=0; j<comingArray.length-1-i; j++) {
                if (comingArray[j] > comingArray[j+1]) {
                    int temp = comingArray[j];
                    comingArray[j] = comingArray[j+1];
                    comingArray[j+1] = temp;
                }
            }
        }
        return comingArray;
    }

    public static void printArray(int[] comingArray, String name) {
        System.out.print("The sorted array is: ");
        for (int eachItem : comingArray) {
            System.out.print(eachItem + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length of the array");
        int sizeOfArray = scan.nextInt();

        int[] numsArray = new int[sizeOfArray];
        System.out.println("Please enter the elements in array");
        for (int i=0; i<sizeOfArray; i++) {
            numsArray[i] = scan.nextInt();
        }

        printArray(sortArray(numsArray), "sorted array");
    }
}