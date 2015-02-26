package tests;

import flows.SearchEngineFlow;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.YandexSearchPage;

public class YandexWebTest {
    @Test
    public void basicSeachCheck() {
        String searchPhrase = "happiness";
        SearchEngineFlow.use(YandexSearchPage.class);
        SearchEngineFlow.searchFor(searchPhrase);
        
        Assert.assertTrue(SearchEngineFlow.getPageTitle().contains(searchPhrase));
    }
}