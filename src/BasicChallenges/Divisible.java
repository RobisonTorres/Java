package BasicChallenges;

public class Divisible {

    // This function checks if a number "n" is
    // both divisible by "x" and "y".
    public static boolean isDivisible(int n, int x, int y) {

        return (n % x == 0) & (n % y == 0);
        /* & to AND operator. | to OR operator. ! to NOT operator */
    }
    public static void main(String[] args) {

        System.out.println(isDivisible(5, 1, 3));
    }
}

