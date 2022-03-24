import java.util.Scanner;

public class AlternatePrinting {

    public static void printAlternate(int[] comingArray) {
        for (int i=0; i<comingArray.length; i++) {
            if (i%2 == 0) {
                System.out.print(comingArray[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the Array: ");
        int sizeOfArray = scan.nextInt();

        int[] numbersArray = new int[sizeOfArray];
        System.out.println("Enter the Array elements: ");
        for (int i=0; i<sizeOfArray; i++) {
            numbersArray[i] = scan.nextInt();
        }

        printAlternate(numbersArray);
    }
}