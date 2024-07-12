package BasicChallengesII;
import java.util.ArrayList;
public class Multiples {

    public static int multiplesSum(int n){

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for(int x = 3; x < n; x++){
            if(x % 3 == 0 || x % 5 == 0){
                numbers.add(x);
                }
            }
        return numbers.stream().reduce(0, Integer::sum);
        }
    public static void main(String[] args){

        System.out.println(multiplesSum(5));
    }
}

/* Clever
* import java.util.stream.*;

public class Solution {

  public int solution(int number) {
    return IntStream.range(3, number).filter(n -> n % 3 == 0 || n % 5 == 0).sum();
  }
}

*/