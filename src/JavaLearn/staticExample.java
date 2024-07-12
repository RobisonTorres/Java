package JavaLearn;

public class staticExample {
    public static void horn() {
        System.out.println("Beep");
    }
}

// Now, the horn method can be called without creating an object:

class myStaticExample {
    public static void main(String[ ] args) {
        staticExample.horn();
    }
}