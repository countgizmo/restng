package testland;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.collections.Lists;

public class TestController {
    private final TestListenerAdapter tla;
    private final TestNG testng;
        
    public TestController() {
        tla = new TestListenerAdapter();
        testng = new TestNG();
    }
    
    public void runTestByName(String targetTestName) {     
        testng.setTestClasses(new Class[] { getClassByString(targetTestName) });
        testng.addListener(tla);
        testng.run(); 
    }

    public List<ITestResult> getFailedTests() {
        List<ITestResult> failedTests = Lists.newArrayList();
        failedTests.addAll(tla.getFailedTests());
        failedTests.addAll(tla.getConfigurationFailures());

        return failedTests;
    }
    
    private Class getClassByString(String className) {
        Class cls = null;
        
        try {
            cls = Class.forName(className);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cls;
    }
}
