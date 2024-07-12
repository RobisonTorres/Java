package BasicChallengesII;
public class Vowels {

    // This function counts vowels in a string.
    public static int getCount(String str) {

        return str.length() - str.replaceAll("(?i)[aeiou]", "").length();
        //return str.replaceAll("[^aeiou]","").length(); - Clever.
    }
    public static void main(String[] arg){

        System.out.println(getCount("This is a simple text."));
    }
}
