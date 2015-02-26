package flows;

import common.Browser;
import common.Utils;
import org.openqa.selenium.support.PageFactory;
import pages.GenericPage;

public class SearchEngineFlow {
    private static GenericPage page = null;
    
    public static void use(Class cls) {
        //Class cls = Utils.getClassByString(searchEngineName);
        page = (GenericPage) PageFactory.initElements(Browser.getDriver(), cls);
    }

    public static void searchFor(String searchPhrase) {
        page.visitMainPage();
        page.typeSearchPhrase(searchPhrase);
        page.submitSearchPhrase();
    }

    public static String getPageTitle() {
        return Browser.getDriver().getTitle();
    }
}
