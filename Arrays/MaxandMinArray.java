import java.util.Scanner;

public class MaxandMinArray {

    public static int getMaxNumber(int[] comingArray) {
        int maxNumber = comingArray[0];

        for (int i=1; i<comingArray.length; i++) {
            if (maxNumber < comingArray[i]) {
                int temp = maxNumber;
                maxNumber = comingArray[i];
                comingArray[i] = temp;
            }
        }

        return maxNumber;
    }

    public static int getMinNumber(int[] comingArray) {
        int minNumber = comingArray[0];

        for (int i=1; i<comingArray.length; i++) {
            if (minNumber > comingArray[i]) {
                int temp = minNumber;
                minNumber = comingArray[i];
                comingArray[i] = minNumber;
            }
        }

        return minNumber;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int sizeOfArray = scan.nextInt();

        int[] numbersArray = new int[sizeOfArray];
        System.out.println("Enter the array elements: ");
        for (int i=0; i<sizeOfArray; i++) {
            numbersArray[i] = scan.nextInt();
        }

        System.out.println("The max number in Array: " + getMaxNumber(numbersArray));
        System.out.println("The min number in Array: " + getMinNumber(numbersArray));
    }
}