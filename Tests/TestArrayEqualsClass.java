import JavaAdvancedOOP.ArrayEqualsClass;
import org.junit.Assert;
import org.junit.Test;


public class TestArrayEqualsClass {

    @Test
    public void testArrayEquals(){
    int[] a = {1, 2};
    int[] b = {1, 2};
    ArrayEqualsClass arrays = new ArrayEqualsClass();
    boolean result = arrays.ArrayEquals(a, b);
        Assert.assertTrue(result);
    }
}