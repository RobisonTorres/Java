package BasicChallenges;

public class RemoveChar {

    // This function removes the first and the last characters of a string.
    public static String remove(String str) {

        int a = str.length() - 1;
        return str.substring(1, a);
    }
    public static void main(String[] args) {
        System.out.println(remove("person"));  // Output - erso
    }
}
