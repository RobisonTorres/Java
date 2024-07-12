package BasicChallenges;

public class Negative {

    // This function makes any positive number to negative.
    public static int makeNegative(final int x) {

        return (x > 0) ? x * -1: x;
    }
    public static void main(String[] args) {
        System.out.println(makeNegative(-1));  // Output - -1
        System.out.println(makeNegative(2));  // Output - -2
    }
}
