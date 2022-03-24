import java.util.Scanner;

public class SplitString {

    public static String[] splitString(String sentence) {
        String[] splitedWords = sentence.split(" ");
        return splitedWords;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        String[] splitedWords = splitString(sentence);

        System.out.println("After spliting words");
        for(String eachWrod: splitedWords) {
            System.out.print(eachWrod + ", ");
        }
    }
}