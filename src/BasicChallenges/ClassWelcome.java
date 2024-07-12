package BasicChallenges;

import java.util.Scanner;

public class ClassWelcome {

        /* You are creating a robot, "Welcomer 2000", that never fails to greet
        a single person it encounters. You provide the number of people that will
        enter the room, and the robot will shout "Welcome" that number of times.*/
        public static void main(String[] args) {
            System.out.println("Please enter the number of people: ");
            Scanner read = new Scanner(System.in);
            int numberOfPeople = read.nextInt();

            for (int i = 0; i < numberOfPeople; i++) {
                welcome();
            }
        }
    public static void welcome() {
        //complete the method
        System.out.println("Welcome!");

    }
}
