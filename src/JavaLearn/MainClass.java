package JavaLearn;

public class    MainClass {

    // Class Attributes.
    int x = 5;
    int y = 5;

    String fName = "Rob";
    String lName = "Cross";
    String fullName = fName + " " + lName;
    int age = 31;

    public static void main(String[] args) {

        MainClass myObj = new MainClass();  // You need to create an object to
        System.out.println(myObj.x);  // use the class' attributes.

        // You can create multiple objects from one class.
        MainClass myObje1 = new MainClass();
        System.out.println(myObj.x + 1 + myObje1.y + 1);  // Output - 12
        System.out.println(myObj.x + myObj.x);  // Output - 10

        // You can also modify classes' attribute values
        myObj.x = 15;
        System.out.println(myObj.x);  // Output - 15
        System.out.println(myObje1.x);  // Output - 5

        System.out.println("Full Name: " + myObj.fullName);  // Full Name: Rob Cross
        System.out.println(myObj.fName + " is " + myObj.age);  // Rob is 31

    }
}
