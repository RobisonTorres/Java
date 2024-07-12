package BasicChallenges;

import java.util.Scanner;

public class ArrayPow {
    public static void main(String[] args) {
        System.out.println("Please enter the number of elements: ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] sides =  new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter the square's side: ");
            sides[i] = scanner.nextInt();
        }
        //your code goes here
        for (int n: sides) {
            System.out.println("The area is: ");
            System.out.println(n*n);
        }
    }
}
