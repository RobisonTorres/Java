package JavaAdvancedOOP;

public class SumArrayClass {

    public int sumArray(int[] numbers){
        int sumNumbers = 0;
        for (int num: numbers){
            sumNumbers += num;
        }
        return sumNumbers;
    }
}