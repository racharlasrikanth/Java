import java.util.Scanner;

public class GetName {

    public static String changeToUpperCase(String comingName) {
        return comingName.toUpperCase();
    }

    public static String changeToLowerCase(String comingName) {
        return comingName.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String someName = scan.nextLine();
        System.out.println("Your name in Uppercase is: " + changeToUpperCase(someName));
        System.out.println("Your name in Lowercase is: " + changeToLowerCase(someName));
    }
}