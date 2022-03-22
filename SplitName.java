import java.util.Scanner;

public class SplitName {

    public static void splitName(String comingName) {
        String[] splitedName = comingName.split("");
        for(String s : splitedName){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(comingName.toUpperCase());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String someName = scan.nextLine();

        splitName(someName);
    }
}