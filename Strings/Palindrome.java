import java.util.Scanner;

public class Palindrome {

    public static boolean checkPalindrome(String name) {
        String reversedName = "";

        for(int i=name.length()-1; i>=0; i--) {
            reversedName = reversedName + name.charAt(i);
        }

        if(name.equals(reversedName)) {
            return true;
        }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        if (checkPalindrome(name)) {
            System.out.println(name + " is a palindrome!");
        } else {
            System.out.println(name + " is NOT a palindrome!");
        }
    }
}