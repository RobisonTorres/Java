package JavaLearn;
import java.io.File;
import java.util.Scanner;
import java.util.Formatter;

public class FormatFilesII {
    public static void main(String[ ] args) {
        Scanner input = new Scanner(System.in);
        try {
            Formatter f = new Formatter("C:\\Users\\rcssi\\Code\\Java\\src\\javalearn\\tasks.txt");
            int count = 0;
            while(count < 3) {
                //your code goes here
                String task = input.next();
                f.format(task + '\n');
                count++;
            }
            f.close();
        }
        catch (Exception e) {
            System.out.println("Error");
        }
        readFile();
    }

    public static void readFile() {
        try {
            File x = new File("C:\\Users\\rcssi\\Code\\Java\\src\\javalearn\\tasks.txt");
            Scanner sc = new Scanner(x);
            while(sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        }
        catch (Exception e) {
            System.out.println("Error");
        }
    }
}