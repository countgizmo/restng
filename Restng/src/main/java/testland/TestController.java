package testland;

import common.Utils;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;

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
        testng.setTestClasses(
            new Class[] { Utils.getClassByString(targetTestName) }
        );
        testng.addListener(tla);
        testng.run(); 
    }

    public List<ITestResult> getFailedTests() {
        List<ITestResult> failedTests = Lists.newArrayList();
        failedTests.addAll(tla.getFailedTests());
        failedTests.addAll(tla.getConfigurationFailures());

        return failedTests;
    }
    
    public List<String> getAllTestNames() {
        List<String> testNames = new ArrayList();
        Reflections reflections = new Reflections("dummytests", new SubTypesScanner(false));
        
        Set<Class<? extends Object>> allClasses;
        allClasses = reflections.getSubTypesOf(Object.class);
        
        allClasses.stream().forEach((cls) -> {
            testNames.add(cls.getSimpleName());
        });
        
        return testNames;
    }
}