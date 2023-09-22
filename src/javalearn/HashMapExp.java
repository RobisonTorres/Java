package javalearn;

import java.util.HashMap;

public class HashMapExp {

    public static void main(String[] args) {

        HashMap<String, String> capitalCities = new HashMap<>();
        // To add values use the "put" method.
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        // To access an item use the "get" method.
        String capitalMovie = capitalCities.get("Norway");
        System.out.println(capitalMovie);

        // To remove an item use the "remove" method.
        // capitalCities.remove("England");

        // To clear all items use the "clear" method.

        // To loop through a hashmap.
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
        for (String i : capitalCities.keySet()) {
            System.out.println("Country: " + i + " City: " + capitalCities.get(i));
        }
        // A hashmap with String Keys and Integer Values.
        HashMap<String, Integer> people = new HashMap<>();
        people.put("Rob", 32);
        people.put("Tom", 54);
        people.put("Jimmy", 17);
        people.put("Bryan", 21);
        System.out.println(people);
    }
}
