package JavaLearn;

/* Threads allows a program to operate more efficiently by doing
multiple things at the same time. Threads can be used to perform
complicated tasks in the background without interrupting the main program.
*/

class Loader implements Runnable {
    public void run() {
        System.out.println("Hello");
    }
}

class Threads {
    public static void main(String[ ] args) {
        Thread t = new Thread(new Loader());
        t.start();
    }
}