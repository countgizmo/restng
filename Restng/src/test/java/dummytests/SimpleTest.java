
package dummytests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SimpleTest {
    @Test(successPercentage = 0)
    public void passingTest1() {
        Assert.assertTrue(true);
    }
    
    @Test
    public void passingTest2() {
        Assert.assertTrue(true);
    }
    
    @Test
    public void passingTest3() {
        Assert.assertTrue(true);
    }
}
