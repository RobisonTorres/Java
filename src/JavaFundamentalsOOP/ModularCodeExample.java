package JavaFundamentalsOOP;

// Abstract Module class
abstract class Module {
    // Abstract method to perform module-specific functionality
    public abstract void performAction();
}

// Concrete LoginModule
class LoginModule extends Module {
    @Override
    public void performAction() {
        System.out.println("LoginModule: User logged in successfully.");
        // Add login logic here
    }
}

// Concrete PaymentModule
class PaymentModule extends Module {
    @Override
    public void performAction() {
        System.out.println("PaymentModule: Payment processed.");
        // Add payment processing logic here
    }
}

public class ModularCodeExample {
    public static void main(String[] args) {
        // Create instances of modules
        Module loginModule = new LoginModule();
        Module paymentModule = new PaymentModule();

        // Perform actions using the modules
        loginModule.performAction(); // Perform login
        paymentModule.performAction(); // Process payment
    }
}
