package JavaLearn;

public class Methodoverloading {

    // Instead of defining two methods that should do
    // the same thing, it is better to overload one.

    static int plusMethod (
            int x, int y) {
        // methods with the same name.
        return x + y;
    }
    static double plusMethod(double x, double y){

        return x + y;
    }
    public static void main(String[] args) {
        System.out.println(plusMethod(5, 7));
        System.out.println(plusMethod(7.83, 5.17));
    }
}
