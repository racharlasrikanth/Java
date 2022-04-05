import java.util.Scanner;

public class InsertSubString {

    public static String insertSubString(String mainString, String subString, int position) {
        String finalString = "";

        int i, j, k;

        for (i=0; i<position; i++) {
            finalString = finalString + mainString.charAt(i);
        }

        for (j=0; j<subString.length(); j++) {
            finalString = finalString + subString.charAt(j);
        }

        for (k=i; k<mainString.length(); k++) {
            finalString = finalString + mainString.charAt(k);
        }

        return finalString;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the Main String: ");
        String mainString = scan.nextLine();

        System.out.println("Please enter the sub String: ");
        String subString = scan.nextLine();

        System.out.println("Please enter the position ?: ");
        int position = scan.nextInt();

        System.out.println("Given String: " + mainString + " & Final String: " + insertSubString(mainString, subString, position));
    }
}