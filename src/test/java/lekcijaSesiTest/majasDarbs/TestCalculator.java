package lekcijaSesiTest.majasDarbs;

import lekcijaSesi.majasdarbs.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {
    @Test
    public void testAdd() {
        Calculator saskaitisana = new Calculator();
        int expectedSum = 12;
        int actualSum = saskaitisana.add(5, 7);
        Assert.assertEquals(actualSum, expectedSum);
    }
    @Test
    public void testSubtract(){
        Calculator atnemsana = new Calculator();
        int expectedDifference = -2;
        int actualDifference = atnemsana.subtract(5,7);
        Assert.assertEquals(actualDifference, expectedDifference);
    }
    @Test
    public void testMultiply(){
        Calculator reizinasana = new Calculator();
        int expectedProduct = 35;
        int actualProduct = reizinasana.multiply(5,7);
        Assert.assertEquals(actualProduct, expectedProduct);
    }
    @Test
    public void testDivide(){
        Calculator dalisana = new Calculator();
        float expectedQuotient = 2.5F;
        float actualQuotient = dalisana.divide(10,4);
        Assert.assertEquals(actualQuotient, expectedQuotient);

    }
}
