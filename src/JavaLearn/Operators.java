package JavaLearn;

public class Operators {

    public static void main(String[] args) {
        int x = 10 + 5;
        int y = 20 - x;
        System.out.println(y);

        /* & to AND operator. | to OR operator. ! to NOT operator */
        if (x > 5 & y > 3) {
            System.out.println("It works");
        }
    }
}
