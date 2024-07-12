package JavaLearn;

public class InnerClass {
    public static void main(String[] args) {
        Robot r = new Robot(1);
    }
}

class Robot {
    int id;
    Robot(int i) {
        id = i;
        Brain b = new Brain();
        b.think();
    }

    /* The class Robot has an inner class Brain. The inner class can
    access all the member variables and methods of its outer class,
    but it cannot be accessed from any outside class.*/

    private class Brain {
        public void think() {
            System.out.println(id + " is thinking");
        }
    }
}
