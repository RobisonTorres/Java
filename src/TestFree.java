public class TestFree {

    public static String removeVowels(String text){

        return text.replaceAll("(?i)[aeiou]", "");
    }
    public static void main (String[] args){

        System.out.println(removeVowels("This is a simple test..."));
    }
}
