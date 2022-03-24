import java.util.Scanner;

public class GetArray {

    public static void printArray(int[] comingArray) {
        for(int i=0; i<comingArray.length; i++) {
            System.out.print(comingArray[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Length of the Array: ");
        int lengthOfArray = scan.nextInt();

        int[] numbersArray = new int[lengthOfArray];
        System.out.print("Enter the array elements: ");
        for(int i=0; i<lengthOfArray; i++) {
            numbersArray[i] = scan.nextInt();
        }

        printArray(numbersArray);
    }
}