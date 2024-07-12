package JavaLearn;

public class ForLoop {
    public static void main(String[] args) {
        for (int n = 0; n < 5; n++) {
            System.out.println(n);
/* Statement 1 sets a variable before the loop starts (int i = 0).

Statement 2 defines the condition for the loop to run (i must be less than 5).
If the condition is true, the loop will start over again,
if it is false, the loop will end.

Statement 3 increases a value (i++) each time the code block
in the loop has been executed. */
        }
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
/* There is also a "for-each" loop, which is used exclusively to
loop through elements in an array. */
        }
    }
}
