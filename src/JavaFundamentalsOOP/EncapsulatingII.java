package JavaFundamentalsOOP;

/*
Advanced Encapsulation Concepts - Creating immutable classes ensures
that once an object is created, it cannot be altered. This is achieved
by making all members final and providing no setters.
*/

// Creating immutable class in Java using final keyword
final class ImmutableClass {
    private final String name;

    public ImmutableClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // No setter methods – this makes the class immutable
}

// Using final keyword to prevent method overriding
class ParentClass {
    public final void showFinalMethod() {
        System.out.println("This is a final method from ParentClass");
    }
}

class ChildClass extends ParentClass {
    // Attempting to override the final method from parent class would result in a compile-time error
    // public void showFinalMethod() {
    //     System.out.println("Trying to override final method");
    // }
}

public class EncapsulatingII {

    public static void main(String[] args){

        ImmutableClass imm = new ImmutableClass("Immutable");
        System.out.println(imm.getName());
        // imm.name = "Mutable"; - it'll generate error.
    }
}