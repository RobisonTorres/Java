package JavaLearn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class RegularExpression {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // The Object.
        System.out.println("Type in the text to be found.");  // Asking the txt.
        String text = myObj.next();  // Place hold.

        Pattern parttern = Pattern.compile("w3schools",
                Pattern.CASE_INSENSITIVE);  // The parttern to be search for.

        Matcher matcher = parttern.matcher(text);  // It checks the occurrence.
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");  // True
        } else {
            System.out.println("Match not found");  // False
        }
    }
}
