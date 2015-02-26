package tests;

import flows.SearchEngineFlow;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GoogleSearchPage;

public class GoogleWebTest {
    @Test
    public void basicSeachCheck() {
        String searchPhrase = "happiness";
        SearchEngineFlow.use(GoogleSearchPage.class);
        SearchEngineFlow.searchFor(searchPhrase);
        
        Assert.assertTrue(SearchEngineFlow.getPageTitle().contains(searchPhrase));
    }
}
