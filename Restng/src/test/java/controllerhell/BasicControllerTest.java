package controllerhell;


import org.testng.Assert;
import org.testng.annotations.Test;
import testland.TestController;

public class BasicControllerTest {
    @Test
    public void runSpecificTestByName() {
        String testName = "tests.SimpleTest";

        TestController controller = new TestController();
        controller.runTestByName(testName);
    
        Assert.assertEquals(0, controller.getFailedTests().size());
    }
}
