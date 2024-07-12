package BasicChallenges;

import java.util.Scanner;

public class Factorial {

    // An example of Factorial with Java.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in the number: ");
        int  number = scanner.nextInt();
        int fact = 1;
        int result = number;
        while (number > fact) {
            result *= number - fact;
            number --;
        }
        System.out.println(result);

        System.out.println();
    }
}
