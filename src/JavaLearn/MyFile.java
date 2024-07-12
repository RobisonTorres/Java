package JavaLearn;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyFile {
    public static void main(String[ ] args) {
        File x = new File("C:\\Users\\rcssi\\Code\\Java\\src\\javalearn\\test.txt");
        if(x.exists()) {
            System.out.println(x.getName() +  " exists!");
        }
        else {
            System.out.println("The file does not exist");
        }

        try {
            Scanner read = new Scanner(x);
            while (read.hasNext()) {
                System.out.println(read.next());
            }
            read.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }
    }
}