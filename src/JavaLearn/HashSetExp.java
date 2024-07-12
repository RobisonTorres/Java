package JavaLearn;

import java.util.HashSet;

public class HashSetExp {

    public static void main(String[] arg) {

        // Hashset doesn't allow duplicate items.
        HashSet<String> cars = new HashSet<>();

        // To add items use the "add" method.
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Ford");
        System.out.println(cars);

        // To check if an item is present use the contains method.
        System.out.println(cars.contains("Mazda"));  // Output - True.

        // To show the length.
        System.out.println(cars.size());  // Output - 4

    }
}
