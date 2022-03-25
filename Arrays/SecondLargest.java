import java.util.Scanner;

public class SecondLargest {

    public static int[] sortAnArray(int[] comingArray) {
        for (int i=0; i<comingArray.length; i++) {
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

    public static int[] removeDuplicates(int[] comingArray) {
        int j = 0;
        for (int i=0; i<comingArray.length-1; i++) {
            if (comingArray[i] != comingArray[i+1]) {
                comingArray[j++] = comingArray[i];
            }
        }
        comingArray[j++] = comingArray[comingArray.length-1];

        int[] withouDuplicates = new int[j];
        for (int k=0; k<j; k++) {
            withouDuplicates[k] = comingArray[k];
        }

        return withouDuplicates;
    }

    public static void printArray(int[] comingArray) {
        for(int eachItem : comingArray) {
            System.out.print(eachItem + " ");
        }
        System.out.println();
    }

    public static int getSecondLargestNumber(int[] comingArray) {
        comingArray = sortAnArray(comingArray);
        comingArray = removeDuplicates(comingArray);
        return comingArray[comingArray.length-2];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int sizeOfArray = scan.nextInt();

        int[] numbersArray = new int[sizeOfArray];
        System.out.println("Enter the elements in Array: ");
        for (int i=0; i<sizeOfArray; i++) {
            numbersArray[i] = scan.nextInt();
        }

        System.out.println("The Second Largest number in Array is: " + getSecondLargestNumber(numbersArray));
    }
}