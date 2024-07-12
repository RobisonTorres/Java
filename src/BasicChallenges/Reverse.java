package BasicChallenges;

public class Reverse {

    // This function reverse any given string.
    public static String reverse(String str) {

        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return rev.toString();
        // return new StringBuilder(str).reverse().toString(); - Clever.
    }
    public static void main(String[] args) {
        System.out.println(reverse("Reverse"));  // Output - esreveR
    }
}
