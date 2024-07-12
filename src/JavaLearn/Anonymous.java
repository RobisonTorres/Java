package JavaLearn;

class Machine {
    public void start() {
        System.out.println("Starting...");
    }
}

/* The @Override annotation is used to make your code easier
to understand, because it makes it more obvious when methods are overridden.*/

class Anonymous {
    public static void main(String[ ] args) {
        Machine m = new Machine() {
            @Override public void start() {
                System.out.println("Wooooo");
            }
        };
        m.start(); // The override only affects the m object.
        Machine n = new Machine();
        n.start();
    }
}