import java.util.Scanner;

public class GetArray {

    public static void printGivenArray(int[] comingArray, String comingText) {
        System.out.print("Your " + comingText +" is:");
        for(int item : comingArray) {
            System.out.print(" " + item);
        }
    }

    public static int[] sortAnArray(int[] comingArray) {
        for(int i=0; i<comingArray.length; i++) {
            for(int j=i+1; j<comingArray.length; j++){
                if(comingArray[i] > comingArray[j]) {
                    int temp = comingArray[i];
                    comingArray[i] = comingArray[j];
                    comingArray[j] = temp;
                }
            }
        }
        return comingArray;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the size of array: \n");
        int arraySize = scan.nextInt();

        int numbersArray[] = new int[arraySize];
        System.out.print("Please enter the elements in array: \n");
        for(int i=0; i<arraySize; i++) {
            numbersArray[i] = scan.nextInt();
        }

        printGivenArray(numbersArray, "given array");
        System.out.println();
        printGivenArray(sortAnArray(numbersArray), "sorted array");
    }
}