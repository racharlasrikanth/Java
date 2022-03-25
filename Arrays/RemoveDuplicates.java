import java.util.Scanner;

public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] comingArray) {
        int j = 0;
        for (int i=0; i<comingArray.length-1; i++) {
            if (comingArray[i] != comingArray[i+1]) {
                comingArray[j++] = comingArray[i];
            }
        }
        comingArray[j++] = comingArray[comingArray.length-1];

        int[] noDuplicateArray = new int[j];
        for(int k=0; k<j; k++) {
            noDuplicateArray[k] = comingArray[k];
        }
        return noDuplicateArray;
    }

    public static int[] sortArray(int[] comingArray) {
        for (int i=0; i<comingArray.length-1; i++) {
            for (int j=i+1; j<comingArray.length; j++) {
                if (comingArray[i] > comingArray[j]) {
                    int temp = comingArray[i];
                    comingArray[i] = comingArray[j];
                    comingArray[j] = temp;
                }
            }
        }
        return comingArray;
    }

    public static void printArray(int[] comingArray) {
        for (int eachItem : comingArray) {
            System.out.print(eachItem + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int sizeOfArray = scan.nextInt();

        int[] numsArray = new int[sizeOfArray];
        System.out.println("Enter the elements in array: ");
        for (int i=0; i<sizeOfArray; i++) {
            numsArray[i] = scan.nextInt();
        }

        printArray(removeDuplicates(sortArray(numsArray)));
    }
}