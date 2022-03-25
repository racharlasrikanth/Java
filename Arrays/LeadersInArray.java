import java.util.Scanner;

public class LeadersInArray {

    public static void printLeaders(int[] comingArray) {
        for (int i=0; i<comingArray.length-1; i++) {
            boolean flag = false;
            for (int j=i+1; j<comingArray.length; j++) {
                if (comingArray[i] > comingArray[j]) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(comingArray[i] + " ");
            }
        }
        System.out.print(comingArray[comingArray.length-1]);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int sizeOfArray = scan.nextInt();

        int[] numsArray = new int[sizeOfArray];
        System.out.println("Please enter the elements in array: ");
        for (int i=0; i<sizeOfArray; i++) {
            numsArray[i] = scan.nextInt();
        }

        printLeaders(numsArray);
    }
}