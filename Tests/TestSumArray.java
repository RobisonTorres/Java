import JavaAdvancedOOP.SumArrayClass;
import org.junit.Assert;
import org.junit.Test;


public class TestSumArray {

    @Test
    public void testSumArray(){
        int[] numbers = {1,2,3,4,5};
        SumArrayClass testSum = new SumArrayClass();
        int result = testSum.sumArray(numbers);
        Assert.assertEquals(15, result);
    }
}