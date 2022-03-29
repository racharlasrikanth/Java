import java.util.Scanner;

public class CheckArraySorted {

    public static boolean checkSortedOrNot(int[] comingArray) {
        for (int i=0; i<comingArray.length-1; i++) {
            if (comingArray[i] > comingArray[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("PLease enter the size of array");
        int sizeOfArray = scan.nextInt();

        int[] numsArray = new int[sizeOfArray];
        System.out.println("Please enter the elements in array");
        for (int i=0; i<sizeOfArray; i++) {
            numsArray[i] = scan.nextInt();
        }

        String result = checkSortedOrNot(numsArray) == true ? "Sorted" : "Un-Sorted";

        System.out.println("The given array is: " + result);
    }
}