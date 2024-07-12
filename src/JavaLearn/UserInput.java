package JavaLearn;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please type in: name, age and salary.");

        String name = myObj.next();  // String
        int age = myObj.nextInt();  // Int
        double salary = myObj.nextDouble();  // Double

        System.out.println("Nome: " + name + ", " + "age: " + age
        + " and salary " + salary);

        Scanner myObj1 = new Scanner(System.in);
        System.out.println(myObj1.nextLine());
    }
}
