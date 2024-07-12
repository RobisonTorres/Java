package JavaLearn;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayInputNumber {
    public static void main(String[ ] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> evenNums = new ArrayList<Integer>();

        while(evenNums.size()<3){
            int num = scanner.nextInt();
            //your code goes here
            evenNums.add(num);
        }
        //calculate and output the average integer value
        int sumNumbers = 0;
        for (int i = 0; i < 3; i++) {
            sumNumbers += evenNums.get(i);
        }
        System.out.println(sumNumbers/3);
    }
}