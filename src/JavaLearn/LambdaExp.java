package JavaLearn;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExp {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(-33);
        numbers.add(15);
        numbers.add(20);
        numbers.add(34);
        numbers.add(8);
        numbers.add(12);
        // numbers.forEach( (n) -> { System.out.println(n);});

        // Use Java's Consumer interface to store a lambda expression in a variable.
        Consumer<Integer> method = (n) -> { System.out.println(n);};
        System.out.println(numbers);
        numbers.forEach(method);
    }
}
