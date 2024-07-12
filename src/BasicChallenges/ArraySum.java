package BasicChallenges;

import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array =  new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        //your code goes here
        int sum = 0;
        for (int num: array) {
            if (num % 4 == 0) {
                sum += num;
            }
        }
        System.out.println(sum);
        int result = 0;
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                result += 10;
            } else {
                result += i;
            }
        }
        System.out.println(result);
    }
}
