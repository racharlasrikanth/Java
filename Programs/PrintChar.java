import java.util.Scanner;

public class PrintChar {

    public static void printChar(char[] charArray) {
        for(char ch : charArray) {
            System.out.print(ch + ", ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberofCharacters = scan.nextInt();
        char ch[] = new char[numberofCharacters];
        for(int i=0; i<numberofCharacters; i++) {
            ch[i] = scan.next().charAt(0);
        }
        printChar(ch);
    }
}