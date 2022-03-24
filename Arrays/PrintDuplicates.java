import java.util.Scanner;

public class PrintDuplicates {

    public static void duplicates(int[] comingArray) {
        for(int i=0; i<comingArray.length; i++) {
            for(int j=0; j<comingArray.length; j++) {
                if((i!=j) && (comingArray[i] == comingArray[j])) {
                    System.out.print(comingArray[i] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lengthOfArray = scan.nextInt();

        int[] numbersArray = new int[lengthOfArray];
        for(int i=0; i<lengthOfArray; i++) {
            numbersArray[i] = scan.nextInt();
        }

        duplicates(numbersArray);
    }
}