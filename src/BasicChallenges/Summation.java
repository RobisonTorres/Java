package BasicChallenges;

public class Summation {

    // This function sums all numbers between 1 and the given number "n".
    public static int summation(int n) {

        int x = 0;
        while (n > 0) {
            x += n;
            n--;
        }
        return x;
    }
    public static void main(String[] args) {

        System.out.println(summation(36));  // Output - 36
    }
}
