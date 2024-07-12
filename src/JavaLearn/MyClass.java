package JavaLearn;

// import java.util.*; - To import a whole package, end with an asterisk sign (*)
import java.util.Scanner;  // - To import a single class.

public class MyClass {

    /* Import a Class If you find a class you want to use,
    for example, the Scanner class, which is used to get
    user input, write the following code: */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username, age and salary.");

        String username = myObj.next();
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();
        System.out.println("User name is: " + username
        + "," + " age " + age + " and salary " + salary);
    }
}
