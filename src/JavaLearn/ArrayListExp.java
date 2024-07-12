package JavaLearn;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExp {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();  // Create an ArrayList
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Toyota");
        cars.remove("Toyota");
        System.out.println(cars);  // Output - [Volvo, BMW, Ford, Mazda]
        System.out.println(cars.get(0));  // Output - Volvo
        cars.set(0, "Opel");
        System.out.println(cars.get(0));  // Output - Opel
        // To remove all the elements in the ArrayList, use the clear().
        // cars.clear();
        System.out.println(cars.size());  // Output - 4

        // Loop through the elements of an ArrayList with a for loop.
        /*for (int n = 0; n < cars.size(); n++) {
            System.out.println(cars.get(n));*/
        for (String i : cars) {
            System.out.println(i);
        }

        // Sort an ArrayList
        Collections.sort(cars);
        System.out.println(cars);

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(-33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers);
        System.out.println(myNumbers.get(0));
    }
}
