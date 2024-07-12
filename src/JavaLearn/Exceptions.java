package JavaLearn;

public class Exceptions {

    static void checkAge(int age) {

        // It's possible to create you own throw error.
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at " +
                    "least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }
    public static void main(String[] args) {

        int a = 1;
        try {
            System.out.println(a / 0);
        }
        catch (Exception e) {
            System.out.println("Something went wrong.");
        }
        finally {
            System.out.println("The operation is finished");
        }
        // System.out.println(checkAge(18));
    }
}
