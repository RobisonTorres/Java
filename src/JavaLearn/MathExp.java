package JavaLearn;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.random;

public class MathExp {

    public static void main(String[] args) {
        // System.out.println(java.lang.Math.max(10, 5));
        System.out.println(max(10, 5));  // Output - 10
        System.out.println(min(10, 5));  // Output - 5
        System.out.println(java.lang.Math.sqrt(64));  // Output - 8
        System.out.println(java.lang.Math.abs(-8.5));  // Output - 8.5
        System.out.println(java.lang.Math.random());  // Output - varies
        int randomNum = (int)(random() * 100);
        System.out.println(randomNum);  // Output - varies
        int max = max(10 ,5);
        // int max = Math.max(10 ,5); - Error.
        System.out.println(max);  // Output - 10
    }
}
