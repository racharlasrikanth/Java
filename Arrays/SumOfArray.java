import java.util.Scanner;

public class SumOfArray {

    public static int sumOfGivenArray(int[] comingArray) {
        int sum = 0;
        for (int eachItem : comingArray) {
            sum = sum + eachItem;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the Array: ");
        int sizeOfArray = scan.nextInt();

        int[] numbersArray = new int[sizeOfArray];
        System.out.println("Enter the array elements: ");
        for (int i=0; i<numbersArray.length; i++) {
            numbersArray[i] = scan.nextInt();
        }

        System.out.println("Sum of given Array: " + sumOfGivenArray(numbersArray));
    }
}