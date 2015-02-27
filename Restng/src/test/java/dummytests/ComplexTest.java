package dummytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ComplexTest {
    @Test(successPercentage = 0)
    public void addition() {
        Assert.assertEquals(1+1, 2);
    }
    
    @Test
    public void subtraction() {
        Assert.assertEquals(5-4, 1);
    }
    
    @Test
    public void zero() {
        Assert.assertEquals(10-10, 0);
    }
    
    @Test
    public void stringLength() {
        Assert.assertEquals("Foobar".length(), 6);
    }
}
