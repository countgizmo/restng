package tests;

import pages.YahooSearchPage;
import flows.SearchEngineFlow;
import org.testng.Assert;
import org.testng.annotations.Test;

public class YahooWebTest {
    @Test
    public void basicSeachCheck() {
        String searchPhrase = "happiness";
        SearchEngineFlow.use(YahooSearchPage.class);
        SearchEngineFlow.searchFor(searchPhrase);
        
        Assert.assertTrue(SearchEngineFlow.getPageTitle().contains(searchPhrase));
    }
}