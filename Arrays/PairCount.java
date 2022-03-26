import java.util.Scanner;

public class PairCount {

    public static int getNumberofPairs(int[] comingArray, int keyNumber) {
        int count = 0;
        for (int i=0; i<comingArray.length-1; i++) {
            for (int j=i+1; j<comingArray.length; j++) {
                if ((comingArray[i] + comingArray[j]) == keyNumber) {
                    count++;
                }
            }
        }

        if (count == 0) {
            return -1;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the size of an array: ");
        int sizeOfArray = scan.nextInt();

        int[] numsArray = new int[sizeOfArray];
        System.out.println("Please enter the elements in array: ");
        for (int i=0; i<sizeOfArray; i++) {
            numsArray[i] = scan.nextInt();
        }

        System.out.println("Enter the KEY VALUE to find pairs: ");
        int keyNumber = scan.nextInt();

        int result = getNumberofPairs(numsArray, keyNumber);
        if (result == -1) {
            System.out.println("Sorry, no pairs found with: " + keyNumber);
        } else {
            System.out.println("There are " + result + " pairs found for: " + keyNumber);
        }
    }
}