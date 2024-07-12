package JavaLearn;
import java.util.Scanner;
/* Class Attributes - You are the administrator of a hotel and must create
customer information cards for your new customers. On the card, you must note
the customer’s first and last name, age, and room number.

The program you are given takes a guest's data
(first name, last name, age, and room number) as input.

Complete the class by adding corresponding attributes so that the
saveCustomerInfo() method works correctly. Also assign taken data
values to attribute of created object.

Sample Input        Sample Output
John                First name: John
Smith               Second name: Smith
35                  Age: 35
204                 Room number: 204
*/

public class ClassTry {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String firstName = read.nextLine();
        System.out.println("Enter the last name: ");
        String secondName = read.nextLine();
        System.out.println("Enter the age: ");
        int age = read.nextInt();
        System.out.println("Enter the room number: ");
        int roomNumber = read.nextInt();

        // Creating the object.
        Customer customer = new Customer();

        // Setting customer's data to object here
        customer.firstName = firstName;
        customer.secondName = secondName;
        customer.age = age;
        customer.roomNumber = roomNumber;
        customer.saveCustomerInfo();
    }
}

class Customer {

    //add all necessary attributes here
    String firstName;
    String secondName;
    int age;
    int roomNumber;

    public void saveCustomerInfo() {
        System.out.println("First name: " + firstName);
        System.out.println("Second name: " + secondName);
        System.out.println("Age: " + age);
        System.out.println("Room number: " + roomNumber);
    }
}
