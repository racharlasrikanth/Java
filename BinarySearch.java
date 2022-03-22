import java.util.Scanner;

public class BinarySearch {

    public static int searchInArray(int[] comingArray, int searchElement) {
        int index = -1;
        for(int i=0; i<comingArray.length; i++) {
            if(comingArray[i] == searchElement){
                index = i;
                return index;
            }
        }
        return index;
    }

    public static int binarySearchArray(int[] comingArray, int searchElement, int low, int high) {
        int index = -1;
        
        low = 0;
        high = comingArray.length-1;
        
        while(low <= high) {
            int medium = (low + high)/2;

            if(comingArray[medium] == searchElement){
                index = medium;
                return index;
            }

            if(comingArray[medium] < searchElement) {
                low = medium + 1;
            }

            if(comingArray[medium] > searchElement) {
                high = medium - 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Plese enter the size of array: \n");
        int arraySize = scan.nextInt();
        int[] numbersArray = new int[arraySize];
        
        System.out.print("Plese enter the array elements: \n");
        for(int i=0; i<arraySize; i++) {
            numbersArray[i] = scan.nextInt();
        }

        System.out.println("Enter the Search Element: ");
        int searchElement = scan.nextInt();

        // int result = searchInArray(numbersArray, searchElement);
        int result = binarySearchArray(numbersArray, searchElement, 0, arraySize-1);
        if(result == -1) {
            System.out.println("The given number " + searchElement + " not found!");
        } else {
            System.out.println("The given number " + searchElement + " found at position " + result);
        }
    }
}