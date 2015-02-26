package pages;

import common.Application;
import common.Browser;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class GenericPage {

    public void visitMainPage() {
        String classNameUrl = this.getClass().getSimpleName();
        String mainPageUrl = "";

        try {
            mainPageUrl = Application.getProperty(classNameUrl);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GenericPage.class.getName()).log(Level.SEVERE, null, ex);
        }

        Browser.getDriver().get(mainPageUrl);
    }

    @Override
    public String toString() {
        return Browser.getDriver().getPageSource();
    }

    public abstract void typeSearchPhrase(String searchPhrase);

    public abstract void submitSearchPhrase();
}
