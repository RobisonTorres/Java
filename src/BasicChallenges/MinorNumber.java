package BasicChallenges;

import java.util.Arrays;

public class MinorNumber {

    // This function returns the smallest number in the array.
    public static int minor(int[] numbers) {

        Arrays.sort(numbers);
        return numbers[0];
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, -4, 3, 0};
        System.out.println(Arrays.toString(new int[]{minor(nums)}));
    }
}
