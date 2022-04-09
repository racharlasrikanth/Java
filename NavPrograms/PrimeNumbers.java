import java.util.Scanner;
import java.lang.Math;

public class PrimeNumbers {

    public static void printPrimeNumbers(int comingNumber) {
        System.out.print("Prime Numbers are: ");
        for (int i=2; i<=comingNumber; i++) {
            boolean flag = true;
            for (int j=2; j<=(int)Math.sqrt(i); j++) {
                if (i!=j && i%j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.print(i + " ");
            flag = true;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Display the prime numbers between 1 and ");
        int givenNumber = scan.nextInt();

        printPrimeNumbers(givenNumber);
    }
}