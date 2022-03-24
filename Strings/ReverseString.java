import java.util.Scanner;

public class ReverseString {

    public static String reverseString(String name) {
        String reversedName = "";

        for(int i=name.length()-1; i>=0; i--) {
            reversedName = reversedName + name.charAt(i);
        }

        return reversedName;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Reversed String is: " + reverseString(name));
    }
}