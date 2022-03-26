import java.util.Scanner;

public class MinDistance {

    public static boolean containsArray(int[] comingArray, int data) {
        for (int i=0; i<comingArray.length; i++) {
            if (comingArray[i] == data) {
                return true;
            }
        }

        return false;
    }

    public static int getMinDistance(int[] comingArray, int x, int y) {
        if (!containsArray(comingArray, x) || !containsArray(comingArray, y)) {
            return -1;
        }

        int minDistance = Integer.MAX_VALUE;
        int prev = 0;
        int i = 0;

        for (; i<comingArray.length; i++) {
            if (comingArray[i] == x || comingArray[i] == y) {
                if (comingArray[prev] != comingArray[i] && (i-prev) < minDistance) {
                    minDistance = i-prev;
                    prev = i;
                } else {
                    prev = i;
                }
            }
        }

        if (minDistance == Integer.MAX_VALUE) {
            return -1;
        }

        return minDistance;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Plese enter the size of array: ");
        int sizeOfArray = scan.nextInt();

        int[] numsArray = new int[sizeOfArray];
        System.out.println("Please enter array elements: ");
        for (int i=0; i<sizeOfArray; i++) {
            numsArray[i] = scan.nextInt();
        }

        System.out.println("Please enter the X element: ");
        int x = scan.nextInt();
        System.out.println("Please enter the Y element: ");
        int y = scan.nextInt();

        System.out.println("The minimum distance between " + x + " and " + y + " is : " + getMinDistance(numsArray, x, y));
    }
}