import java.util.Scanner;

public class StringsArray {

    public static void printAllNames(String[] namesArray) {
        System.out.print("Given names are:");
        for(String name: namesArray) {
            System.out.print(name+",");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the size of an array: ");
        int arraySize = scan.nextInt();

        String[] namesArray = new String[arraySize];
        for(int i=0; i<arraySize; i++) {
            namesArray[i] = scan.next();
        }

        printAllNames(namesArray);
    }
}