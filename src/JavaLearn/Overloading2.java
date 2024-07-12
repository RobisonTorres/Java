package JavaLearn;

public class Overloading2 {
    public static void main(String[] args) {

        int a = 5;
        double b = 10.2;

        System.out.println(doubleTheValue(a));
        System.out.println(doubleTheValue(b));

    }
    //complete the method for integer value type
    public static int doubleTheValue(int num) {
        return num * 2;

    }
    //overload the method for double value type
    public static double doubleTheValue(double num) {
        return num * 2;

    }
}