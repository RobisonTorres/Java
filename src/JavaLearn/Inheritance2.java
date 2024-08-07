package JavaLearn;

//be attentive to access modifiers
class Standard {
    protected void draw() {
        System.out.println("Drawing");
    }

    // I can't access a private item in subclasses.
    //private void write() {
    protected void write() {
        System.out.println("Writing");
    }
}
//fix the class
class Pro extends Standard{

    protected void useEffects() {
        System.out.println("Using Effects");
    }

    protected void changeResolution() {
        System.out.println("Changing Resolution");
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        Standard standard1 = new Standard();
        Pro pro1 = new Pro();

        //standard version
        standard1.draw();
        standard1.write();

        //Pro version
        pro1.draw();
        pro1.write();
        pro1.useEffects();
        pro1.changeResolution();
    }
}
