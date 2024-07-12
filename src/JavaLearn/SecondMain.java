package JavaLearn;

public class SecondMain {

    public static void main(String[] args) {
    /* You can also create an object of a class and access it in another class.
    This is often used for better organization of classes.
     */
        MainClass myObj = new MainClass();
        System.out.println(myObj.x);  // Output - 5

        // In order to access a method from other class,
        // the method must be public.
        PublicMethods newObj = new PublicMethods();
        newObj.fullThrottle();  // The car is going as fast as it can!
        newObj.speed(150);  // Max speed is 150
        Encapsulation objEnc = new Encapsulation();
        // objEnc.name = "Rob"; error
        // System.out.println(objEnc.name); error
        objEnc.setName("Rob"); // Set the value of the name variable to "Rob"
        System.out.println(objEnc.getName()); // Get the value of the name

    }
}
