import JavaAdvancedOOP.RotateArrayClass;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class TestRotateArray {

    @Test
    public void testRotateArray(){
        int[] numbers = {1,2,3,4,5};
        List<Integer> result = RotateArrayClass.rotateArray(numbers, 2);
        List<Integer> expectedNumbers = new ArrayList<>()
        {{add(4);add(5);add(1);add(2);add(3);}};
        Assert.assertEquals(expectedNumbers, result);
    };
}
