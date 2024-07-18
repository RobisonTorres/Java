package JavaAdvancedOOP;
import java.util.ArrayList;
import java.util.List;

public class RotateArrayClass {

    public static List<Integer> rotateArray(int[] numbers, int k){
        List<Integer> numbersList = new ArrayList<>();

        for(int number: numbers){
            numbersList.add(number);
        };

        for (int i = 0; i < k; i++){
            numbersList.add(0, numbersList.get(numbersList.size() - 1));
            numbersList.remove(numbersList.size() - 1);
        }
        return numbersList;
    }
}