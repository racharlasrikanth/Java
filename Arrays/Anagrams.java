import java.util.Scanner;

public class Anagrams {

    public static String sortString(String comingString) {
        // String[] letters = comingString.split("");
        char[] letters = comingString.toCharArray();
        for (int i=0; i<letters.length; i++) {
            for (int j=i+1; j<letters.length; j++) {
                if ((int)letters[i] > (int)letters[j]) {
                    char temp = letters[j];
                    letters[j] = letters[i];
                    letters[i] = temp;
                }
            }
        }
        
        String sortedString = "";
        for (int i=0; i<letters.length; i++) {
            sortedString = sortedString + letters[i];
        }

        return sortedString;
    }

    public static boolean checkAnagrams(String sent1, String sent2) {

        sent1 = sent1.trim();
        sent2 = sent2.trim();

        if (sent1.length() != sent2.length()) {
            return false;
        }

        sent1 = sortString(sent1);
        sent2 = sortString(sent2);

        if (sent1.equals(sent2)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First String: ");
        String sent1 = scan.nextLine();

        System.out.println("Enter the Second String: ");
        String sent2 = scan.nextLine();

        if (checkAnagrams(sent1, sent2)) {
            System.out.println(sent1 + ", " + sent2 + " are Anagrams!");
        } else {
            System.out.println(sent1 + ", " + sent2 + " are NOT Anagrams!");
        }
    }
}