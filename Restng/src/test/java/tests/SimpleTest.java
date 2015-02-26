
package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SimpleTest {
    @Test(successPercentage = 0)
    public void failedTest1() {
        Assert.assertTrue(true);
    }
    
    @Test
    public void failedTest2() {
        Assert.assertTrue(true);
    }
    
    @Test
    public void failedTest3() {
        Assert.assertTrue(true);
    }
}
