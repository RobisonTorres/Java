package JavaLearn;

public class Datatype1 {

    public static void main(String[] args) {

        // It's possible to convert float to integer.
        double myDoubleNum = 5.99d;
        System.out.println(myDoubleNum);
        int myInt = (int) myDoubleNum; // Narrowing Casting.
        System.out.println(myInt);
        float myFloatNum = myInt; // Widening Casting.
        System.out.println(myFloatNum);
        System.out.println((int) myFloatNum);

    }
}
