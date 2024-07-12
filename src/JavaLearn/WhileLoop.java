package JavaLearn;

public class WhileLoop {
    public static void main(String[] args) {
        int num = 0;

        while (num < 5) {
            System.out.println(num);
            num ++;
            // num += 2;
        }
        do {
            System.out.println(num);
            num += 1;
        }
        while (num < 15);

        /* The loop will always be executed at least once,
        even if the condition is false, because the code block
        is executed before the condition is tested.*/
    }
}
