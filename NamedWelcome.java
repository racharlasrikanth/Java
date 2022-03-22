import java.util.Scanner;

class NamedWelcome {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Plese enter your name: ");
        String someName = scan.nextLine();
        System.out.println("Hello, " + someName);
    }
}