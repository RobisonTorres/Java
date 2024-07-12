package JavaLearn;

public class Strings {

    public static void main(String[] args) {
        String txt = "Strigs are used for storing text.";
        System.out.println(txt.length());  // Output - 33
        System.out.println(txt.toLowerCase());  // Output - strigs are used...
        System.out.println(txt.toUpperCase());  // Output - STRIGS ARE...
        System.out.println(txt.indexOf("storing"));  // Output - 20
        String firstName = "Rob";
        String secondName = "Torres";
        System.out.println(firstName + " " + secondName);  // Output - Rob Torres
        System.out.println(firstName.concat(secondName));  // Output - RobTorres
        String specialChar = "We are the so-called \"Vikings\" from the north.";
        System.out.println(specialChar);  // Output - We are the so-called "Vikings" from the north.
        int num = 20;
        String num1 = "20";
        System.out.println(num+num1);  // Output - 2020
        int num2 = 20;
        System.out.println(num+num2);  // Output - 40

        // You can use a comma-separated list to declare more than one
        // variable of the specified type. Example: int a = 42, b = 11;
        int a = 42, b = 11;
        System.out.println(a+b);

    }
}
