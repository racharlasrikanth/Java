import java.util.Scanner;

public class CountSmallNumbers {

    public static int getSmallNumCount(int[] comingArray, int smallNumber) {
        int count = 0;

        for (int i=0; i<comingArray.length; i++) {
            if (comingArray[i] <= smallNumber) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int sizeOfArray = scan.nextInt();

        int[] numsArray = new int[sizeOfArray];
        System.out.println("Please enter the array elements: ");
        for (int i=0; i<sizeOfArray; i++) {
            numsArray[i] = scan.nextInt();
        }

        System.out.println("Enter the small number: ");
        int smallNumber = scan.nextInt();

        System.out.println("Count of Smaller elements: " + getSmallNumCount(numsArray, smallNumber));
    }
}