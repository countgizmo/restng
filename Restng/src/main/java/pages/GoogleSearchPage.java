package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleSearchPage extends GenericPage {
    @FindBy(how = How.NAME, using = "q")
    private WebElement searchBox;
    
    @Override
    public void typeSearchPhrase(String phrase) {
        searchBox.sendKeys(phrase);
    }
    
    @Override
    public void submitSearchPhrase() {
        searchBox.submit();
    }
}
