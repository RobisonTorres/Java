package JavaLearn;

public class Methods {

    static void myMethod() {

        System.out.println("I just got executed!");  // A message is print.
    }

    static void myName(String fname) {

        System.out.println("hello " + fname);  // A message is print with a name.
    }

    static void evenOrOdd(int num) {

        System.out.println((num % 2 == 0) ? "Even": "Odd");
    }

    static void nameAge(String name, int age) {

        System.out.println(name + " is " + age);  // Two parameters.
    }

    static int sumNumbers(int num) {

        return  num + 5;  // Without 'void' - return a value.
    }

    static int sumNumbers1(int x, int y) {
        return  x + y;  // Without 'void' - return a value.
    }

    public static void main(String[] args) {
        myMethod();  // Output - I just got executed!
        myName("Rob");  // Output - hello Rob
        evenOrOdd(3);  // Output - Odd
        nameAge("Rob", 31);  // Output - Rob is 31
        System.out.println(sumNumbers(5));  // Output - 10
        System.out.println(sumNumbers1(1,2));  // Output - 3
        int z = sumNumbers1(5,7);
        System.out.println(z);  // Output - 12
    }

}

/* The void keyword, used in the examples above,
indicates that the method should not return a value.
If you want the method to return a value,
you can use a primitive data type (such as int, char, etc.)
instead of void, and use the return keyword inside the method.
 */
