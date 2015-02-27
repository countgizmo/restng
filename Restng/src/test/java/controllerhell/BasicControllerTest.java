package controllerhell;

import org.testng.Assert;
import org.testng.annotations.Test;
import testland.TestController;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsCollectionContaining.hasItems;

public class BasicControllerTest {
    @Test
    public void runSpecificTestByName() {
        String testName = "dummytests.SimpleTest";

        TestController controller = new TestController();
        controller.runTestByName(testName);
    
        Assert.assertEquals(0, controller.getFailedTests().size());
    }
    
    @Test
    public void listAllTests() {
        TestController controller = new TestController();
        Assert.assertEquals(controller.getAllTestNames().size(), 3);
        assertThat(controller.getAllTestNames(), 
                hasItems("SimpleTest", "NormalTest", "ComplexTest"));
    }
}
