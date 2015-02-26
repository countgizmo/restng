package pages;

import org.openqa.selenium.WebElement;

public class YandexSearchPage extends GenericPage {
    WebElement text;

    @Override
    public void typeSearchPhrase(String searchPhrase) {
        text.sendKeys(searchPhrase);
    }

    @Override
    public void submitSearchPhrase() {
        text.submit();
    }
    
}
