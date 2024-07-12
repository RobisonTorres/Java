package JavaLearn;

public class Compiling {
    public static void main(String[] args) {

        /* The compiling process catches mistakes before the computer runs our code.
        * Use javac in the terminal to catch these errors.*/

        System.out.println("Java is a class-based language.");
        System.out.println("Java classes have a 'main' method.");
        System.out.println("Java statements end with a semicolon.");

        System.out.println("Programming is... fun!");
        /*
        As a reminder, we can compile a .java file from the terminal with the command:
        javac Whales.java
        If the file compiles successfully, this command produces an executable class: FileName.class. Executable means we can run this program from the terminal.
        We run the executable with the command:
        java Whales
         */
    }
}
