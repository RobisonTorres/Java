package JavaFundamentalsOOP;

/*
Use getters and setters to control access to and modification
of an object's attributes. This is a key part in encapsulation.

Here are some of the main reasons to use getters and setters:
By making attributes private and providing getters
and setters with public access, you control how data is accessed
and modified. This helps ensure data integrity and prevents unexpected changes.

Data Validation: You can add validation logic inside your setter methods
to ensure that only valid data is assigned to the attribute. This can
prevent errors and unexpected behavior in your program.
*/

class Account {

    private double balance;

    // Constructor - Used to give the initial value.
    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    // Setter method to control the deposit operation and the balance.
    public void deposit(double amount){

        if (amount > 0){
            balance += amount;
            System.out.println("$" + amount + " has been deposited.");
        } else {
            System.out.println("Amount must be greater than $0");
        }
    }

    // Setter method to control withdraw operation
    public void withdraw(double amount){

        if (amount > 0 && balance >= amount){
            balance -= amount;
            System.out.println("$" + amount + " has been withdrawn.");
        } else {
            System.out.println("There's not enough funds for - $" + amount);
        }
    }
}

public class Encapsulating {

    public static void main(String[] args){

        Account americanBank = new Account(0);
        americanBank.deposit(500);
        americanBank.withdraw(100);
        americanBank.withdraw(150);
        americanBank.withdraw(600);
        System.out.println("There's $" + americanBank.getBalance());

        // americanBank.balance = 0; - it'll generate error.
    }
}