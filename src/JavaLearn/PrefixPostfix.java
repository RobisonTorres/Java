package JavaLearn;

public class PrefixPostfix {
    public static void main(String[] args) {

        // Prefix
        int x = 34;
        int y = ++x;
        System.out.println("x equals to: " + x);
        System.out.println("y equals to: " + y);

        // Postfix
        int a = 3;
        int b = a++;
        System.out.println("a equals to: " + a);
        System.out.println("b equals to: " + b);
    }
}
