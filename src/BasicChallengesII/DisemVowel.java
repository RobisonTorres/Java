package BasicChallengesII;

public class DisemVowel {

    // This function removes vowels from any given string.
    public static String removeVowels(String text){

        return text.replaceAll("(?i)[aeiou]", "");
    }
    public static void main (String[] args){

        System.out.println(removeVowels("This is a simple test..."));
    }
}
