import JavaAdvancedOOP.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {

    @Test
    public void testAdd(){
        Calculator calc = new Calculator();
        int result = calc.add(5,5);
        Assert.assertEquals(10, result);
    }

    @Test
    public void testSubtraction() {
        Calculator calc = new Calculator();
        int result = calc.subtraction(5, 5);
        Assert.assertEquals(0, result);
    }
}