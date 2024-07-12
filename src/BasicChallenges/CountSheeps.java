package BasicChallenges;

public class CountSheeps {

    // This function count the amount of "true" values.
    public static int counts(Boolean[] arrayOfSheeps) {

        int count = 0;
        for (Boolean i : arrayOfSheeps) {
            if (i == null) {
                continue;
            } else if (i) {
                count += 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Boolean[] listSheep = {null, null, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true};
        System.out.println(counts(listSheep));
    }
}
/* Clever.

import java.util.Arrays;
import java.util.Collections;

public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    return Collections.frequency(Arrays.asList(arrayOfSheeps), true);
  }
}
 */

