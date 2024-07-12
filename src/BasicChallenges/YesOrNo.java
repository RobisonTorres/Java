package BasicChallenges;

public class YesOrNo {

    // This function returns Yes for true and false otherwise.
    public static String boolToWord(boolean b) {

        return (b) ? "Yes" : "No";
    }
    public static void main(String[] args) {
        System.out.println(boolToWord(false));  // Output - no
        System.out.println(boolToWord(true));  // Output - Yes
    }
}
