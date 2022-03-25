import java.util.Scanner;

public class RotateArray {

    public static void rotateGivenArray(int[] comingArray, int rotateWith) {
        System.out.print("Array rotated with " + rotateWith + " is: ");
        for (int i=rotateWith; i<comingArray.length; i++) {
            System.out.print(comingArray[i] + " ");
        }
        for (int j=0; j<rotateWith; j++) {
            System.out.print(comingArray[j] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of arrays: ");
        int numberOfArrays = scan.nextInt();

        for (int i=1; i<=numberOfArrays; i++) {
            System.out.println("Please enter the length of the array: ");
            int sizeOfArray = scan.nextInt();

            System.out.println("Please enter the Rotate items: ");
            int rotateNum = scan.nextInt();

            int[] numsArray = new int[sizeOfArray];
            System.out.println("Please enter the array elements: ");
            for (int j=0; j<sizeOfArray; j++) {
                numsArray[j] = scan.nextInt();
            }

            rotateGivenArray(numsArray, rotateNum);
        }
    }
}