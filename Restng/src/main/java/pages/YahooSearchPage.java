package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class YahooSearchPage extends GenericPage {
    @FindBy(how = How.ID, using = "UHSearchBox")
    WebElement searchBox;
    
    @FindBy(how = How.ID, using = "UHSearchWeb")
    WebElement searchButton;
    
    @Override
    public void typeSearchPhrase(String searchPhrase) {
        searchBox.clear();
        searchBox.sendKeys(searchPhrase);
    }

    @Override
    public void submitSearchPhrase() {
        searchButton.click();
    }
    
}
