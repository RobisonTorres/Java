package JavaFundamentalsOOP;

// Abstract class defining the contract for payment methods.
/*
An abstract class is a class that cannot be instantiated directly.
It can contain both abstract methods (methods without a body) and non-abstract
methods (methods with a body). Abstract classes are used to represent
general concepts or base classes from which other classes can inherit.
 */
abstract class PaymentMethod {
    abstract void pay(double amount);
}

// CreditCard is a concrete subclass that provides an implementation of the pay() method.
class CreditCard extends PaymentMethod {
    @Override
    void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

// PayPal is another concrete subclass with its own implementation of pay().
class PayPal extends PaymentMethod {
    @Override
    void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}

// Demonstrates polymorphism by treating both CreditCard and PayPal as PaymentMethod.
public class Polymorphism {
    public static void main(String[] args) {
        PaymentMethod p;  // Reference of type PaymentMethod

        p = new CreditCard();  // p now refers to a CreditCard object
        p.pay(100.50);  // Calls CreditCard's implementation of pay()

        p = new PayPal();  // p now refers to a PayPal object
        p.pay(200.75);  // Calls PayPal's implementation of pay()
    }
}

