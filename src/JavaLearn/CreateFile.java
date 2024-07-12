package JavaLearn;
import java.util.Formatter;

public class CreateFile {
    public static void main(String[ ] args) {
        try {
            Formatter f = new Formatter("C:\\Users\\rcssi\\Code\\Java\\src\\javalearn\\testII.txt");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}