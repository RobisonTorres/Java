package BasicChallenges;

public class ReWhSp {

    // This code removes all whitespaces from any given string.
    public static String noSpace(String x) {

        return x.replaceAll(" ", "");
    }
    public static void main(String[] args) {
        System.out.println(noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        // Output - 8j8mBliB8gimjB8B8jlB
    }
}
