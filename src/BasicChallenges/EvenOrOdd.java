package BasicChallenges;

public class EvenOrOdd {

    // This function takes any given number and determines whether it is Even or Odd.
    public static String evenOrOdd(int number) {

        return (number % 2 == 0) ? "Even": "Odd";
    }
    public static void main(String[] args) {
        System.out.println(evenOrOdd(2));  // Output - Even
        System.out.println(evenOrOdd(3));  // Output - Odd
    }
}
