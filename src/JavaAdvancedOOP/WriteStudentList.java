package JavaAdvancedOOP;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class WriteStudentList {

    public static void main(String[] args){

        List<String> Students = Arrays.asList("Alice", "Bob", "Charlie");
        try (FileWriter fw = new FileWriter("Students.txt", true)) {

            for (String name: Students){
                fw.write(name + "\n");
            }
            System.out.println("Ok");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
