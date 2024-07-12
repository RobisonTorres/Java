package BasicChallenges;

public class RepeatString {

    // This code repeats any string at any given number of times.
    public static String repeatStr(int repeat, String string) {

        return string.repeat(repeat);
    }
    public static void main(String[] args) {
        System.out.println(repeatStr(3, "Go"));  // Output - GoGoGo
    }
}
