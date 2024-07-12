package BasicChallenges;

public class SquareSum {

    // This function squares every number in an array, and sums all of them.
    public static int squareSums(int[] n) {

        int x = 0;
        for (int i : n) x += Math.pow(i, 2);
        return x;
    }
    public static void main(String[] args){
        int[] numbersArray = {5,-3,4};
        System.out.println(squareSums(numbersArray));  // Output - 50.
    }
}
