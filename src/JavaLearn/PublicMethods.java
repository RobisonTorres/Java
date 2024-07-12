package JavaLearn;

public class PublicMethods {
    // Access methods with an object

    public void fullThrottle() {

        System.out.println("The car is going as fast as it can!");
    }
    public void speed(int maxSpeed) {

        System.out.println("Max speed is " + maxSpeed);
    }

    public static void main(String[] args) {
        PublicMethods myObj = new PublicMethods();
        myObj.fullThrottle();  // Output - The car is going as fast as it can!
        myObj.speed(200);  // Output - Max speed is 200
    }
}
