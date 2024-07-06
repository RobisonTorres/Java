package JavaFundamentalsOOP;

/*
Challenge 6: Super Expert – Analyze Constructor Flow Given the following code snippet:
1 - Predict the output without running the code.
2 - Execute the code to confirm your prediction.
3 - Modify the Parent and Child classes to include parameterized
constructors. Ensure the child class calls the parent's
parameterized constructor using the super keyword. Verify the flow
by instantiating the Child class with necessary parameters.
 */

class Parent {

    int a;

    Parent(int a) {

        this.a = a;
        System.out.println("Parent Constructor " + a);
    }
}

class Child extends Parent {
    Child(int b){
        super(b);  // Calling parent constructor
        System.out.println("Child Constructor " + b);
    }
}

public class ConstructorFlow {
    public static void main(String[] args) {
        Child obj = new Child(5);
    }
}

