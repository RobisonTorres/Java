package JavaLearn;

import java.util.ArrayList;

public class WrapperClasses {
    public static void main(String[] args) {

        Integer myInt = 50000;
        int mySimpleInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        /* Sometimes you must use wrapper classes, for example when working
         with Collection objects, such as ArrayList, where primitive types
         cannot be used (the list can only store objects)*/
        // ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
        ArrayList<Integer> myNumbers = new ArrayList<>(); // Valid

        // Another useful method is the toString() method,
        // which is used to convert wrapper objects to strings.

        String newNumber = myInt.toString();
        System.out.println(newNumber.length());  // Outcome - 5
        System.out.println(mySimpleInt);
    }
}
