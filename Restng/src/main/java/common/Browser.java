package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public enum Browser {

    INSTANCE;
    private WebDriver driver;

    Browser() {
        driver = new HtmlUnitDriver();
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver() {
        return INSTANCE.driver;
    }
}
