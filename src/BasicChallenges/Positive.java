package BasicChallenges;

public class Positive {

    // This function returns the sum of all positives numbers of an array.
    public static int sum(int[] arr){

        int x = 0;
        for (int i : arr) x += Math.max(i, 0);
        return x;
    }
    public static void main(String[] args) {
        int[] numbers = {1, -2, 3, 4,};
        System.out.println(sum(numbers));  // Output - 8
    }
}
